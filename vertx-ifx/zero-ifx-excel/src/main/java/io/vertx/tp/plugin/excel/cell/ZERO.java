package io.vertx.tp.plugin.excel.cell;

import io.vertx.up.util.Ut;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

interface Pool {

    ConcurrentMap<String, ExValue> VALUE_MAP = new ConcurrentHashMap<String, ExValue>() {
        {
            this.put(Literal.UUID, Ut.singleton(UuidValue.class));
        }
    };

    ConcurrentMap<String, ExValue> PREFIX_MAP = new ConcurrentHashMap<String, ExValue>() {
        {
            this.put(Literal.Prefix.JSON, Ut.singleton(JsonValue.class));
            this.put(Literal.Prefix.FILE, Ut.singleton(FileValue.class));
        }
    };

    ConcurrentMap<CellType, Function<Cell, Object>> FUNS
        = new ConcurrentHashMap<CellType, Function<Cell, Object>>() {
        {
            this.put(CellType.STRING, DataValue::toString);
            this.put(CellType.BOOLEAN, DataValue::toBoolean);
            this.put(CellType.NUMERIC, DataValue::toNumeric);
        }
    };
}

interface Literal {
    String UUID = "{UUID}";

    String K_TYPE = "__type__";
    String K_CONTENT = "__content__";

    interface Prefix {
        String JSON = "JSON";
        String FILE = "FILE";

        String[] SET = new String[]{JSON, FILE};
    }
}
