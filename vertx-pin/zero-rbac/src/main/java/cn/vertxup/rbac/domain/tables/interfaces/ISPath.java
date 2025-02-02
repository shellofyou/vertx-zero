/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISPath extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.KEY</code>. 「key」- 规则主键
     */
    public ISPath setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.KEY</code>. 「key」- 规则主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.NAME</code>. 「name」- 规则名称
     */
    public ISPath setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.NAME</code>. 「name」- 规则名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.CODE</code>. 「code」- 系统界面标识
     */
    public ISPath setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.CODE</code>. 「code」- 系统界面标识
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.PHASE</code>. 「phase」- UI读取数据的操作周期
     */
    public ISPath setPhase(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.PHASE</code>. 「phase」- UI读取数据的操作周期
     */
    public String getPhase();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.MAPPING</code>. 「mapping」- 从 dm -&gt;
     * ui 转换
     */
    public ISPath setMapping(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.MAPPING</code>. 「mapping」- 从 dm -&gt;
     * ui 转换
     */
    public String getMapping();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.PARENT_ID</code>. 「parentId」-
     * 区域模式下的父ID，系统内部读取
     */
    public ISPath setParentId(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.PARENT_ID</code>. 「parentId」-
     * 区域模式下的父ID，系统内部读取
     */
    public String getParentId();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.RUN_COMPONENT</code>. 「runComponent」-
     * HValve执行组件，组件内置处理 dm / ui 两部分内容
     */
    public ISPath setRunComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.RUN_COMPONENT</code>. 「runComponent」-
     * HValve执行组件，组件内置处理 dm / ui 两部分内容
     */
    public String getRunComponent();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.RUN_TYPE</code>. 「runType」-
     * 视图管理类型（查询用）
     */
    public ISPath setRunType(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.RUN_TYPE</code>. 「runType」-
     * 视图管理类型（查询用）
     */
    public String getRunType();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.DM_TYPE</code>. 「dmType」- 分组类型
     */
    public ISPath setDmType(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.DM_TYPE</code>. 「dmType」- 分组类型
     */
    public String getDmType();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.DM_COMPONENT</code>. 「dmComponent」-
     * 必须绑定组专用Dao组件
     */
    public ISPath setDmComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.DM_COMPONENT</code>. 「dmComponent」-
     * 必须绑定组专用Dao组件
     */
    public String getDmComponent();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.DM_CONDITION</code>. 「dmCondition」-
     * 分组条件
     */
    public ISPath setDmCondition(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.DM_CONDITION</code>. 「dmCondition」-
     * 分组条件
     */
    public String getDmCondition();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.DM_CONFIG</code>. 「dmConfig」-
     * 组配置信息，配置呈现部分
     */
    public ISPath setDmConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.DM_CONFIG</code>. 「dmConfig」-
     * 组配置信息，配置呈现部分
     */
    public String getDmConfig();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_TYPE</code>. 「uiType」- 目标数据源类型
     */
    public ISPath setUiType(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_TYPE</code>. 「uiType」- 目标数据源类型
     */
    public String getUiType();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    public ISPath setUiConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    public String getUiConfig();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_CONDITION</code>. 「uiCondition」-
     * 查询模板
     */
    public ISPath setUiCondition(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_CONDITION</code>. 「uiCondition」-
     * 查询模板
     */
    public String getUiCondition();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_COMPONENT</code>. 「uiComponent」-
     * 特殊组件
     */
    public ISPath setUiComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_COMPONENT</code>. 「uiComponent」-
     * 特殊组件
     */
    public String getUiComponent();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_SURFACE</code>. 「uiSurface」-
     * 界面呈现模式，已经被降维之后（列表、树、其他等相关配置）
     */
    public ISPath setUiSurface(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_SURFACE</code>. 「uiSurface」-
     * 界面呈现模式，已经被降维之后（列表、树、其他等相关配置）
     */
    public String getUiSurface();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_SORT</code>. 「sort」- 该板块的排序（前端）
     */
    public ISPath setUiSort(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_SORT</code>. 「sort」- 该板块的排序（前端）
     */
    public Integer getUiSort();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.SIGMA</code>. 「sigma」- 统一标识
     */
    public ISPath setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISPath setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.ACTIVE</code>. 「active」- 是否启用
     */
    public ISPath setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISPath setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISPath setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISPath setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISPath setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISPath setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ISPath
     */
    public void from(ISPath from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ISPath
     */
    public <E extends ISPath> E into(E into);

        @Override
        public default ISPath fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setPhase,json::getString,"PHASE","java.lang.String");
                setOrThrow(this::setMapping,json::getString,"MAPPING","java.lang.String");
                setOrThrow(this::setParentId,json::getString,"PARENT_ID","java.lang.String");
                setOrThrow(this::setRunComponent,json::getString,"RUN_COMPONENT","java.lang.String");
                setOrThrow(this::setRunType,json::getString,"RUN_TYPE","java.lang.String");
                setOrThrow(this::setDmType,json::getString,"DM_TYPE","java.lang.String");
                setOrThrow(this::setDmComponent,json::getString,"DM_COMPONENT","java.lang.String");
                setOrThrow(this::setDmCondition,json::getString,"DM_CONDITION","java.lang.String");
                setOrThrow(this::setDmConfig,json::getString,"DM_CONFIG","java.lang.String");
                setOrThrow(this::setUiType,json::getString,"UI_TYPE","java.lang.String");
                setOrThrow(this::setUiConfig,json::getString,"UI_CONFIG","java.lang.String");
                setOrThrow(this::setUiCondition,json::getString,"UI_CONDITION","java.lang.String");
                setOrThrow(this::setUiComponent,json::getString,"UI_COMPONENT","java.lang.String");
                setOrThrow(this::setUiSurface,json::getString,"UI_SURFACE","java.lang.String");
                setOrThrow(this::setUiSort,json::getInteger,"UI_SORT","java.lang.Integer");
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
                json.put("CODE",getCode());
                json.put("PHASE",getPhase());
                json.put("MAPPING",getMapping());
                json.put("PARENT_ID",getParentId());
                json.put("RUN_COMPONENT",getRunComponent());
                json.put("RUN_TYPE",getRunType());
                json.put("DM_TYPE",getDmType());
                json.put("DM_COMPONENT",getDmComponent());
                json.put("DM_CONDITION",getDmCondition());
                json.put("DM_CONFIG",getDmConfig());
                json.put("UI_TYPE",getUiType());
                json.put("UI_CONFIG",getUiConfig());
                json.put("UI_CONDITION",getUiCondition());
                json.put("UI_COMPONENT",getUiComponent());
                json.put("UI_SURFACE",getUiSurface());
                json.put("UI_SORT",getUiSort());
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
