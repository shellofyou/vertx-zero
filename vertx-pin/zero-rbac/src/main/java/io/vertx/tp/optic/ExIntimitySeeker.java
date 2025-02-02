package io.vertx.tp.optic;

import cn.vertxup.rbac.service.accredit.ActionService;
import cn.vertxup.rbac.service.accredit.ActionStub;
import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.error._404ActionMissingException;
import io.vertx.tp.optic.ui.Anchoret;
import io.vertx.tp.optic.web.Seeker;
import io.vertx.tp.rbac.cv.AuthMsg;
import io.vertx.tp.rbac.refine.Sc;
import io.vertx.up.atom.unity.UObject;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;

import java.util.Objects;

/*
 * Seek impact resource for params here, it will be passed by crud
 */
public class ExIntimitySeeker extends Anchoret<Seeker> implements Seeker {

    private transient final ActionStub stub = Ut.singleton(ActionService.class);

    @Override
    public Future<JsonObject> fetchImpact(final JsonObject params) {
        /*
         * Uri, Method
         */
        final String uri = params.getString(ARG0);
        final HttpMethod method = HttpMethod.valueOf(params.getString(ARG1));
        final String sigma = params.getString(ARG2);
        Sc.infoResource(this.getLogger(), AuthMsg.SEEKER_RESOURCE, uri, method, sigma);
        return this.stub.fetchAction(uri, method, sigma).compose(action -> Objects.isNull(action) ?
            Future.failedFuture(new _404ActionMissingException(this.getClass(), method + " " + uri)) :
            UObject.create(params).append(KName.RESOURCE_ID, action.getResourceId())
                .toFuture());
    }
}
