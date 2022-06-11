package io.vertx.tp.workflow.uca.camunda;

import cn.zeroup.macrocosm.cv.WfPool;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.exception.web._501NotSupportException;
import io.vertx.up.unity.Ux;
import org.camunda.bpm.engine.history.HistoricProcessInstance;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.model.bpmn.instance.EndEvent;
import org.camunda.bpm.model.bpmn.instance.StartEvent;

import java.util.List;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@SuppressWarnings("all")
public interface IoOld<P, T> {

    static IoOld<ProcessDefinition, StartEvent> ioStart() {
        return WfPool.CC_IO.pick(IoOldEStart::new, IoOldEStart.class.getName());
    }

    static IoOld<ProcessDefinition, EndEvent> ioEnd() {
        return WfPool.CC_IO.pick(IoOldEEnd::new, IoOldEEnd.class.getName());
    }

    static IoOld<HistoricProcessInstance, ProcessInstance> instance() {
        return WfPool.CC_IO.pick(IoOldInstance::new, IoOldInstance.class.getName());
    }

    // ------------------ Interface Api ----------------------

    Future<ProcessDefinition> definition(String key);

    // ------------------ Fetch Children / Child ----------------------
    // Fetch children by parent
    default Future<List<T>> children(final P parent) {
        return Ux.thenError(_501NotSupportException.class, this.getClass());
    }

    default Future<List<T>> children(final String parentId) {
        return Ux.thenError(_501NotSupportException.class, this.getClass());
    }

    // Fetch child ( unique children ) by parent
    default Future<T> child(final P object) {
        return Ux.thenError(_501NotSupportException.class, this.getClass());
    }

    default Future<T> child(final String key) {
        return Ux.thenError(_501NotSupportException.class, this.getClass());
    }

    // ------------------ Fetch Instance ----------------------
    // Fetch instance
    default Future<T> instance(final String key) {
        return Ux.thenError(_501NotSupportException.class, this.getClass());
    }

    // ------------------ Fetch Parent ----------------------
    // Fetch parent
    default Future<P> inverse(final T object) {
        return Ux.thenError(_501NotSupportException.class, this.getClass());
    }

    default Future<P> inverse(final String key) {
        return Ux.thenError(_501NotSupportException.class, this.getClass());
    }

    // ------------------ Build Response ----------------------
    default Future<JsonObject> write(final JsonObject response, final T object) {
        return Ux.future(response);
    }

    default Future<JsonObject> write(final JsonObject response, final List<T> children) {
        return Ux.future(response);
    }
}
