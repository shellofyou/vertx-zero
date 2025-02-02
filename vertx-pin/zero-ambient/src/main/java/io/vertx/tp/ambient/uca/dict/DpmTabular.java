package io.vertx.tp.ambient.uca.dict;

import cn.vertxup.ambient.domain.tables.daos.XTabularDao;
import io.vertx.core.Future;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonArray;
import io.vertx.up.commune.exchange.DSource;
import io.vertx.up.eon.Constants;
import io.vertx.up.eon.KName;
import io.vertx.up.uca.cache.Rapid;
import io.vertx.up.uca.cache.RapidKey;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.concurrent.ConcurrentMap;

/**
 * ## `X_TABULAR` Dict
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class DpmTabular implements Dpm {

    @Override
    public Future<ConcurrentMap<String, JsonArray>> fetchAsync(final DSource source, final MultiMap params) {
        return Rapid.map(RapidKey.DIRECTORY, Constants.DEFAULT_EXPIRED_DATA).cached(source.getTypes(),
            types -> Ux.Jooq.on(XTabularDao.class).fetchAndAsync(DpmTool.condition(params, types))
                .compose(Ux::futureG));
    }

    @Override
    public ConcurrentMap<String, JsonArray> fetch(final DSource source, final MultiMap params) {
        final JsonArray dataArray = Ux.Jooq.on(XTabularDao.class)
            .fetchJAnd(DpmTool.condition(params, source.getTypes()));
        return Ut.elementGroup(dataArray, KName.TYPE);
    }
}
