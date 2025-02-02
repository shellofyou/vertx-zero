package io.vertx.tp.crud.refine;

import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.crud.init.IxPin;
import io.vertx.tp.crud.uca.desk.IxMod;
import io.vertx.up.atom.Kv;
import io.vertx.up.commune.Envelop;
import io.vertx.up.eon.Constants;
import io.vertx.up.eon.KName;
import io.vertx.up.experiment.mixture.HTAtom;
import io.vertx.up.experiment.mixture.HTField;
import io.vertx.up.experiment.specification.KField;
import io.vertx.up.experiment.specification.KModule;
import io.vertx.up.log.Annal;
import io.vertx.up.uca.jooq.JqAnalyzer;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.util.Ut;

import java.text.MessageFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class IxData {
    private static final Annal LOGGER = Annal.get(IxData.class);

    static void audit(final JsonObject auditor, final JsonObject config, final String userId) {
        if (Objects.nonNull(config) && Ut.notNil(userId)) {
            /* User By */
            final String by = config.getString(KName.BY);
            if (Ut.notNil(by)) {
                /* Audit Process */
                IxLog.infoDao(LOGGER, "( Audit ) By -> \"{0}\" = {1}", by, userId);
                auditor.put(by, userId);
            }
            final String at = config.getString(KName.AT);
            if (Ut.notNil(at)) {
                IxLog.infoDao(LOGGER, "( Audit ) At Field -> {0}", at);
                auditor.put(at, Instant.now());
            }
        }
    }

    static Kv<String, HttpMethod> impact(final IxMod in) {
        final KModule module = in.module();
        final String pattern = "/api/{0}/search";
        final String actor = module.getName();
        return Kv.create(MessageFormat.format(pattern, actor), HttpMethod.POST);
    }

    static Kv<String, String> field(final Object value) {
        if (Constants.DEFAULT_HOLDER.equals(value)) {
            return null;
        }
        final String field;
        final String fieldValue;
        if (value instanceof String) {
            // metadata
            field = value.toString().split(",")[0];
            fieldValue = value.toString().split(",")[1];
        } else {
            final JsonObject column = (JsonObject) value;
            if (column.containsKey(KName.METADATA)) {
                // metadata
                final String metadata = column.getString(KName.METADATA);
                if (Ut.notNil(metadata)) {
                    field = metadata.split(",")[0];
                    fieldValue = value.toString().split(",")[1];
                } else {
                    field = null;
                    fieldValue = null;
                }
            } else {
                // dataIndex
                field = column.getString(IxPin.getColumnKey());
                fieldValue = column.getString(IxPin.getColumnLabel());
            }
        }
        if (Objects.nonNull(field) && Objects.nonNull(fieldValue)) {
            return Kv.create(field, fieldValue);
        } else {
            return null;
        }
    }

    static JsonArray matrix(final KField field) {
        final JsonArray priority = new JsonArray();
        final String keyField = field.getKey();
        /*
         * Add key into group as the high est priority
         */
        priority.add(new JsonArray().add(keyField));
        final JsonArray matrix = Ut.valueJArray(field.getUnique());
        priority.addAll(matrix);
        return priority;
    }

    static JsonObject parameters(final IxMod in) {
        /*
         * module seeking
         * 1. Checking connect module to see whether it's defined in crud configuration
         * 2. When it's null, ( Half Processing )
         *      -- Check the `module` parameters first
         * 3. The last part is current `module` identifier ( such as `tabular` )
         */
        final JsonObject parameters = in.parameters();
        if (!parameters.containsKey(KName.MODULE)) {
            final KModule module = in.module();
            final KModule connect = in.connect();
            if (Objects.isNull(connect)) {
                parameters.put(KName.MODULE, module.identifier());
            } else {
                parameters.put(KName.MODULE, connect.identifier());
            }
        }
        return parameters;
    }

    static HTAtom atom(final IxMod active, final JsonArray columns) {
        final ConcurrentMap<String, String> headers = new ConcurrentHashMap<>();
        columns.stream().map(Ix::onColumn).filter(Objects::nonNull).forEach(kv -> {
            /* Calculated */
            headers.put(kv.getKey(), kv.getValue());
        });
        /*
         * First module for calculation
         */
        final HTAtom atom = HTAtom.create();
        final KModule module = active.module();
        final List<HTField> fieldList = new ArrayList<>();

        final KModule connect = active.connect();
        if (Objects.nonNull(connect)) {
            fieldList.addAll(field(connect, active.envelop(), headers));
        }
        fieldList.addAll(field(module, active.envelop(), headers));

        fieldList.forEach(atom::add);
        return atom;
    }

    private static List<HTField> field(final KModule module, final Envelop envelop,
                                       final ConcurrentMap<String, String> headerMap) {
        final UxJooq jooq = IxPin.jooq(module, envelop);
        final JqAnalyzer analyzer = jooq.analyzer();
        final ConcurrentMap<String, Class<?>> typeMap = analyzer.types();
        /*
         * Processing for TypeField list building
         */
        final List<HTField> fieldList = new ArrayList<>();
        headerMap.forEach((field, alias) -> {
            final Class<?> type = typeMap.getOrDefault(field, String.class);
            fieldList.add(HTField.create(field, alias, type));
        });
        return fieldList;
    }
}
