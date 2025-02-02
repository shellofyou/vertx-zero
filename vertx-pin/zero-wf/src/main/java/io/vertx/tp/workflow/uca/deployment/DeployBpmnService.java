package io.vertx.tp.workflow.uca.deployment;

import io.vertx.core.Future;
import io.vertx.tp.workflow.init.WfPin;
import io.vertx.tp.workflow.plugin.FlowSequenceListener;
import io.vertx.tp.workflow.refine.Wf;
import io.vertx.up.eon.Constants;
import io.vertx.up.eon.FileSuffix;
import io.vertx.up.eon.Strings;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.repository.Deployment;
import org.camunda.bpm.engine.repository.DeploymentBuilder;
import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.bpmn.instance.ExtensionElements;
import org.camunda.bpm.model.bpmn.instance.SequenceFlow;
import org.camunda.bpm.model.bpmn.instance.camunda.CamundaExecutionListener;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class DeployBpmnService implements DeployOn {
    private final transient DeploymentBuilder builder;
    private final transient DeployOn formStub;
    private transient String tenantId;

    DeployBpmnService(final String workflow) {
        // DeploymentBuilder create
        final RepositoryService repository = WfPin.camundaRepository();
        this.builder = repository.createDeployment();
        // Set Deployment Name
        this.builder.name(workflow);
        this.builder.source(Constants.DEFAULT_WORKFLOW_SOURCE);
        // Avoid duplicated deployment when container started.
        this.builder.enableDuplicateFiltering(Boolean.TRUE);
        final List<String> files = Ut.ioFiles(workflow);
        final String bpmnFile = files.stream()
            .filter(item -> item.endsWith(Strings.DOT + FileSuffix.BPMN))
            .findAny().orElse(null);
        Objects.requireNonNull(bpmnFile);

        // BPMN Model Instance
        final String modelFile = workflow + "/" + bpmnFile;
        Wf.Log.infoDeploy(this.getClass(), "Load BPMN model from `{0}`", modelFile);
        final BpmnModelInstance instance = Bpmn.readModelFromStream(Ut.ioStream(modelFile));
        Objects.requireNonNull(instance);

        // Flow Processing for activity log
        this.initializeListener(instance);
        this.builder.addModelInstance(bpmnFile, instance);

        // DeployStub ( Form Service )
        final Set<String> forms = files.stream()
            .filter(item -> item.endsWith(Strings.DOT + FileSuffix.BPMN_FORM))
            .collect(Collectors.toSet());
        this.formStub = new DeployFormService(workflow, this.builder).forms(forms);
    }

    /*
     * Add Global Flow Sequence Listener
     <bpmn:extensionElements>
        <camunda:executionListener class="io.vertx.tp.workflow.plugin.FlowSequenceListener" event="zero-take"/>
     </bpmn:extensionElements>
     */
    private void initializeListener(final BpmnModelInstance instance) {
        final Collection<SequenceFlow> sequences = instance.getModelElementsByType(SequenceFlow.class);
        sequences.forEach(sequence -> {
            final ExtensionElements elements = instance.newInstance(ExtensionElements.class);
            final CamundaExecutionListener elementListener = instance.newInstance(CamundaExecutionListener.class);
            elementListener.setCamundaClass(FlowSequenceListener.class.getName());
            elements.addChildElement(elementListener);
            sequence.setExtensionElements(elements);
        });
    }

    @Override
    public Future<Boolean> initialize() {
        Objects.requireNonNull(this.builder);
        if (Ut.notNil(this.tenantId)) {
            this.builder.tenantId(this.tenantId);
        }
        return this.formStub.initialize().compose(nil -> {
            final Deployment deployment = this.builder.deployWithResult();
            Wf.Log.infoDeploy(this.getClass(), "Workflow `{0}（id = {1}）` has been deployed successfully!",
                deployment.getName(), deployment.getId());
            return Ux.futureT();
        });
    }

    @Override
    public DeployOn tenant(final String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
}
