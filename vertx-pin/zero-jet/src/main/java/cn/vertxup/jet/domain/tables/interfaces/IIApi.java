/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.jet.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IIApi extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.I_API.KEY</code>. 「key」- 接口ID
     */
    public IIApi setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.KEY</code>. 「key」- 接口ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.I_API.NAME</code>. 「name」- 接口名称
     */
    public IIApi setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.NAME</code>. 「name」- 接口名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.I_API.URI</code>. 「uri」- 接口路径，安全路径位于 /api 之下
     */
    public IIApi setUri(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.URI</code>. 「uri」- 接口路径，安全路径位于 /api 之下
     */
    public String getUri();

    /**
     * Setter for <code>DB_ETERNAL.I_API.METHOD</code>. 「method」- 接口对应的HTTP方法
     */
    public IIApi setMethod(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.METHOD</code>. 「method」- 接口对应的HTTP方法
     */
    public String getMethod();

    /**
     * Setter for <code>DB_ETERNAL.I_API.CONSUMES</code>. 「consumes」- 当前接口使用的客户端
     * MIME
     */
    public IIApi setConsumes(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.CONSUMES</code>. 「consumes」- 当前接口使用的客户端
     * MIME
     */
    public String getConsumes();

    /**
     * Setter for <code>DB_ETERNAL.I_API.PRODUCES</code>. 「produces」- 当前接口使用的服务端
     * MIME
     */
    public IIApi setProduces(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.PRODUCES</code>. 「produces」- 当前接口使用的服务端
     * MIME
     */
    public String getProduces();

    /**
     * Setter for <code>DB_ETERNAL.I_API.SECURE</code>. 「secure」-
     * 是否走安全通道，默认为TRUE
     */
    public IIApi setSecure(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.SECURE</code>. 「secure」-
     * 是否走安全通道，默认为TRUE
     */
    public Boolean getSecure();

    /**
     * Setter for <code>DB_ETERNAL.I_API.COMMENT</code>. 「comment」- 备注信息
     */
    public IIApi setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.COMMENT</code>. 「comment」- 备注信息
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.I_API.TYPE</code>. 「type」- 通信类型，ONE-WAY /
     * REQUEST-RESPONSE / PUBLISH-SUBSCRIBE
     */
    public IIApi setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.TYPE</code>. 「type」- 通信类型，ONE-WAY /
     * REQUEST-RESPONSE / PUBLISH-SUBSCRIBE
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.I_API.PARAM_MODE</code>. 「paramMode」-
     * 参数来源，QUERY / BODY / DEFINE / PATH
     */
    public IIApi setParamMode(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.PARAM_MODE</code>. 「paramMode」-
     * 参数来源，QUERY / BODY / DEFINE / PATH
     */
    public String getParamMode();

    /**
     * Setter for <code>DB_ETERNAL.I_API.PARAM_REQUIRED</code>. 「paramRequired」-
     * 必须参数表，一个JsonArray用于返回 400基本验证（验证Query和Path）
     */
    public IIApi setParamRequired(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.PARAM_REQUIRED</code>. 「paramRequired」-
     * 必须参数表，一个JsonArray用于返回 400基本验证（验证Query和Path）
     */
    public String getParamRequired();

    /**
     * Setter for <code>DB_ETERNAL.I_API.PARAM_CONTAINED</code>.
     * 「paramContained」- 必须参数表，一个JsonArray用于返回 400基本验证（验证Body）
     */
    public IIApi setParamContained(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.PARAM_CONTAINED</code>.
     * 「paramContained」- 必须参数表，一个JsonArray用于返回 400基本验证（验证Body）
     */
    public String getParamContained();

    /**
     * Setter for <code>DB_ETERNAL.I_API.IN_RULE</code>. 「inRule」- 参数验证、转换基本规则
     */
    public IIApi setInRule(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.IN_RULE</code>. 「inRule」- 参数验证、转换基本规则
     */
    public String getInRule();

    /**
     * Setter for <code>DB_ETERNAL.I_API.IN_MAPPING</code>. 「inMapping」- 参数映射规则
     */
    public IIApi setInMapping(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.IN_MAPPING</code>. 「inMapping」- 参数映射规则
     */
    public String getInMapping();

    /**
     * Setter for <code>DB_ETERNAL.I_API.IN_PLUG</code>. 「inPlug」- 参数请求流程中的插件
     */
    public IIApi setInPlug(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.IN_PLUG</code>. 「inPlug」- 参数请求流程中的插件
     */
    public String getInPlug();

    /**
     * Setter for <code>DB_ETERNAL.I_API.IN_SCRIPT</code>. 「inScript」-
     * 【保留】参数请求流程中的脚本控制
     */
    public IIApi setInScript(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.IN_SCRIPT</code>. 「inScript」-
     * 【保留】参数请求流程中的脚本控制
     */
    public String getInScript();

    /**
     * Setter for <code>DB_ETERNAL.I_API.OUT_WRITER</code>. 「outWriter」- 响应格式处理器
     */
    public IIApi setOutWriter(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.OUT_WRITER</code>. 「outWriter」- 响应格式处理器
     */
    public String getOutWriter();

    /**
     * Setter for <code>DB_ETERNAL.I_API.WORKER_TYPE</code>. 「workerType」-
     * Worker类型：JS / PLUG / STD
     */
    public IIApi setWorkerType(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.WORKER_TYPE</code>. 「workerType」-
     * Worker类型：JS / PLUG / STD
     */
    public String getWorkerType();

    /**
     * Setter for <code>DB_ETERNAL.I_API.WORKER_ADDRESS</code>. 「workerAddress」-
     * 请求发送地址
     */
    public IIApi setWorkerAddress(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.WORKER_ADDRESS</code>. 「workerAddress」-
     * 请求发送地址
     */
    public String getWorkerAddress();

    /**
     * Setter for <code>DB_ETERNAL.I_API.WORKER_CONSUMER</code>.
     * 「workerConsumer」- 请求地址消费专用组件
     */
    public IIApi setWorkerConsumer(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.WORKER_CONSUMER</code>.
     * 「workerConsumer」- 请求地址消费专用组件
     */
    public String getWorkerConsumer();

    /**
     * Setter for <code>DB_ETERNAL.I_API.WORKER_CLASS</code>. 「workerClass」- OX
     * | PLUG专用，请求执行器对应的JavaClass名称
     */
    public IIApi setWorkerClass(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.WORKER_CLASS</code>. 「workerClass」- OX
     * | PLUG专用，请求执行器对应的JavaClass名称
     */
    public String getWorkerClass();

    /**
     * Setter for <code>DB_ETERNAL.I_API.WORKER_JS</code>. 「workerJs」- JS
     * 专用，JavaScript路径：runtime/workers/&lt;app&gt;/下的执行器
     */
    public IIApi setWorkerJs(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.WORKER_JS</code>. 「workerJs」- JS
     * 专用，JavaScript路径：runtime/workers/&lt;app&gt;/下的执行器
     */
    public String getWorkerJs();

    /**
     * Setter for <code>DB_ETERNAL.I_API.SERVICE_ID</code>. 「serviceId」- 关联的服务ID
     */
    public IIApi setServiceId(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.SERVICE_ID</code>. 「serviceId」- 关联的服务ID
     */
    public String getServiceId();

    /**
     * Setter for <code>DB_ETERNAL.I_API.SIGMA</code>. 「sigma」- 统一标识
     */
    public IIApi setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.I_API.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IIApi setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.I_API.ACTIVE</code>. 「active」- 是否启用
     */
    public IIApi setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.I_API.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IIApi setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.I_API.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IIApi setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.I_API.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IIApi setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.I_API.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IIApi setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.I_API.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IIApi setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_API.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IIApi
     */
    public void from(IIApi from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IIApi
     */
    public <E extends IIApi> E into(E into);

        @Override
        public default IIApi fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setUri,json::getString,"URI","java.lang.String");
                setOrThrow(this::setMethod,json::getString,"METHOD","java.lang.String");
                setOrThrow(this::setConsumes,json::getString,"CONSUMES","java.lang.String");
                setOrThrow(this::setProduces,json::getString,"PRODUCES","java.lang.String");
                setOrThrow(this::setSecure,json::getBoolean,"SECURE","java.lang.Boolean");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setParamMode,json::getString,"PARAM_MODE","java.lang.String");
                setOrThrow(this::setParamRequired,json::getString,"PARAM_REQUIRED","java.lang.String");
                setOrThrow(this::setParamContained,json::getString,"PARAM_CONTAINED","java.lang.String");
                setOrThrow(this::setInRule,json::getString,"IN_RULE","java.lang.String");
                setOrThrow(this::setInMapping,json::getString,"IN_MAPPING","java.lang.String");
                setOrThrow(this::setInPlug,json::getString,"IN_PLUG","java.lang.String");
                setOrThrow(this::setInScript,json::getString,"IN_SCRIPT","java.lang.String");
                setOrThrow(this::setOutWriter,json::getString,"OUT_WRITER","java.lang.String");
                setOrThrow(this::setWorkerType,json::getString,"WORKER_TYPE","java.lang.String");
                setOrThrow(this::setWorkerAddress,json::getString,"WORKER_ADDRESS","java.lang.String");
                setOrThrow(this::setWorkerConsumer,json::getString,"WORKER_CONSUMER","java.lang.String");
                setOrThrow(this::setWorkerClass,json::getString,"WORKER_CLASS","java.lang.String");
                setOrThrow(this::setWorkerJs,json::getString,"WORKER_JS","java.lang.String");
                setOrThrow(this::setServiceId,json::getString,"SERVICE_ID","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setCreatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"CREATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setCreatedBy,json::getString,"CREATED_BY","java.lang.String");
                setOrThrow(this::setUpdatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"UPDATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setUpdatedBy,json::getString,"UPDATED_BY","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("NAME",getName());
                json.put("URI",getUri());
                json.put("METHOD",getMethod());
                json.put("CONSUMES",getConsumes());
                json.put("PRODUCES",getProduces());
                json.put("SECURE",getSecure());
                json.put("COMMENT",getComment());
                json.put("TYPE",getType());
                json.put("PARAM_MODE",getParamMode());
                json.put("PARAM_REQUIRED",getParamRequired());
                json.put("PARAM_CONTAINED",getParamContained());
                json.put("IN_RULE",getInRule());
                json.put("IN_MAPPING",getInMapping());
                json.put("IN_PLUG",getInPlug());
                json.put("IN_SCRIPT",getInScript());
                json.put("OUT_WRITER",getOutWriter());
                json.put("WORKER_TYPE",getWorkerType());
                json.put("WORKER_ADDRESS",getWorkerAddress());
                json.put("WORKER_CONSUMER",getWorkerConsumer());
                json.put("WORKER_CLASS",getWorkerClass());
                json.put("WORKER_JS",getWorkerJs());
                json.put("SERVICE_ID",getServiceId());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
