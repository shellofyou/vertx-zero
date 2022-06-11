package cn.zeroup.macrocosm.cv;

import io.vertx.tp.workflow.atom.EngineOn;
import io.vertx.tp.workflow.uca.camunda.IoOld;
import io.vertx.tp.workflow.uca.camunda.RunOn;
import io.vertx.tp.workflow.uca.central.Behaviour;
import io.vertx.tp.workflow.uca.component.MoveOn;
import io.vertx.tp.workflow.uca.deployment.DeployOn;
import io.vertx.tp.workflow.uca.modeling.ActionOn;
import io.vertx.tp.workflow.uca.runner.EventOn;
import io.vertx.tp.workflow.uca.runner.StoreOn;
import io.vertx.up.uca.cache.Cc;
import org.camunda.bpm.engine.repository.ProcessDefinition;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface WfPool {
    @SuppressWarnings("all")
    Cc<String, IoOld> CC_IO = Cc.openThread();
    Cc<String, ProcessDefinition> CC_DEFINITION = Cc.open();
    // uca.runner POOL
    Cc<String, StoreOn> CC_STORE = Cc.openThread();
    Cc<String, RunOn> CC_RUN = Cc.openThread();
    Cc<String, EventOn> CC_EVENT = Cc.openThread();

    // uca.modeling POOL
    Cc<String, ActionOn> CC_ACTION = Cc.openThread();

    // uca.deployment POOL
    Cc<String, DeployOn> CC_DEPLOY = Cc.open();
    Cc<String, EngineOn> CC_ENGINE = Cc.openThread();

    // uca.component POOL -> Transfer / Movement

    Cc<String, Behaviour> CC_COMPONENT = Cc.openThread();

    // uca.component POOL -> MoveOn
    Cc<String, MoveOn> CC_DIVERT = Cc.openThread();
}
