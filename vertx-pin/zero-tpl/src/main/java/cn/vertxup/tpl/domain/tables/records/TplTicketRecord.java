/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.tpl.domain.tables.records;


import cn.vertxup.tpl.domain.tables.TplTicket;
import cn.vertxup.tpl.domain.tables.interfaces.ITplTicket;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TplTicketRecord extends UpdatableRecordImpl<TplTicketRecord> implements VertxPojo, Record22<String, String, String, String, String, String, Boolean, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, ITplTicket {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.KEY</code>. 「key」- 增量记录ID
     */
    @Override
    public TplTicketRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.KEY</code>. 「key」- 增量记录ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.CODE</code>. 「code」- 编码
     */
    @Override
    public TplTicketRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.CODE</code>. 「code」- 编码
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.NAME</code>. 「name」- 名称
     */
    @Override
    public TplTicketRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.NAME</code>. 「name」- 名称
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.DESCRIPTION</code>. 「description」-
     * 描述
     */
    @Override
    public TplTicketRecord setDescription(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.DESCRIPTION</code>. 「description」-
     * 描述
     */
    @Override
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.TYPE</code>. 「type」- 分类
     */
    @Override
    public TplTicketRecord setType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.TYPE</code>. 「type」- 分类
     */
    @Override
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.STATUS</code>. 「status」- 状态
     */
    @Override
    public TplTicketRecord setStatus(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.STATUS</code>. 「status」- 状态
     */
    @Override
    public String getStatus() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.SYSTEM</code>. 「system」- 是否属于系统模板
     */
    @Override
    public TplTicketRecord setSystem(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.SYSTEM</code>. 「system」- 是否属于系统模板
     */
    @Override
    public Boolean getSystem() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public TplTicketRecord setModelId(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public TplTicketRecord setModelKey(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.MODEL_CATEGORY</code>.
     * 「modelCategory」- 模型分类
     */
    @Override
    public TplTicketRecord setModelCategory(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.MODEL_CATEGORY</code>.
     * 「modelCategory」- 模型分类
     */
    @Override
    public String getModelCategory() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.RECORD_JSON</code>. 「recordJson」-
     * 上一次的记录内容（Json格式）
     */
    @Override
    public TplTicketRecord setRecordJson(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.RECORD_JSON</code>. 「recordJson」-
     * 上一次的记录内容（Json格式）
     */
    @Override
    public String getRecordJson() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.RECORD_COMPONENT</code>.
     * 「recordComponent」- 处理记录的组件
     */
    @Override
    public TplTicketRecord setRecordComponent(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.RECORD_COMPONENT</code>.
     * 「recordComponent」- 处理记录的组件
     */
    @Override
    public String getRecordComponent() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.UI_CONFIG</code>. 「uiConfig」-
     * UI的配置（Json格式）
     */
    @Override
    public TplTicketRecord setUiConfig(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.UI_CONFIG</code>. 「uiConfig」-
     * UI的配置（Json格式）
     */
    @Override
    public String getUiConfig() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.UI_COMPONENT</code>.
     * 「uiComponent」- 处理UI的组件
     */
    @Override
    public TplTicketRecord setUiComponent(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.UI_COMPONENT</code>.
     * 「uiComponent」- 处理UI的组件
     */
    @Override
    public String getUiComponent() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public TplTicketRecord setSigma(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public TplTicketRecord setLanguage(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public TplTicketRecord setActive(Boolean value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public TplTicketRecord setMetadata(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public TplTicketRecord setCreatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public TplTicketRecord setCreatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public TplTicketRecord setUpdatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.TPL_TICKET.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public TplTicketRecord setUpdatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.TPL_TICKET.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, String, String, String, Boolean, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, String, String, String, String, Boolean, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TplTicket.TPL_TICKET.KEY;
    }

    @Override
    public Field<String> field2() {
        return TplTicket.TPL_TICKET.CODE;
    }

    @Override
    public Field<String> field3() {
        return TplTicket.TPL_TICKET.NAME;
    }

    @Override
    public Field<String> field4() {
        return TplTicket.TPL_TICKET.DESCRIPTION;
    }

    @Override
    public Field<String> field5() {
        return TplTicket.TPL_TICKET.TYPE;
    }

    @Override
    public Field<String> field6() {
        return TplTicket.TPL_TICKET.STATUS;
    }

    @Override
    public Field<Boolean> field7() {
        return TplTicket.TPL_TICKET.SYSTEM;
    }

    @Override
    public Field<String> field8() {
        return TplTicket.TPL_TICKET.MODEL_ID;
    }

    @Override
    public Field<String> field9() {
        return TplTicket.TPL_TICKET.MODEL_KEY;
    }

    @Override
    public Field<String> field10() {
        return TplTicket.TPL_TICKET.MODEL_CATEGORY;
    }

    @Override
    public Field<String> field11() {
        return TplTicket.TPL_TICKET.RECORD_JSON;
    }

    @Override
    public Field<String> field12() {
        return TplTicket.TPL_TICKET.RECORD_COMPONENT;
    }

    @Override
    public Field<String> field13() {
        return TplTicket.TPL_TICKET.UI_CONFIG;
    }

    @Override
    public Field<String> field14() {
        return TplTicket.TPL_TICKET.UI_COMPONENT;
    }

    @Override
    public Field<String> field15() {
        return TplTicket.TPL_TICKET.SIGMA;
    }

    @Override
    public Field<String> field16() {
        return TplTicket.TPL_TICKET.LANGUAGE;
    }

    @Override
    public Field<Boolean> field17() {
        return TplTicket.TPL_TICKET.ACTIVE;
    }

    @Override
    public Field<String> field18() {
        return TplTicket.TPL_TICKET.METADATA;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return TplTicket.TPL_TICKET.CREATED_AT;
    }

    @Override
    public Field<String> field20() {
        return TplTicket.TPL_TICKET.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field21() {
        return TplTicket.TPL_TICKET.UPDATED_AT;
    }

    @Override
    public Field<String> field22() {
        return TplTicket.TPL_TICKET.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public String component5() {
        return getType();
    }

    @Override
    public String component6() {
        return getStatus();
    }

    @Override
    public Boolean component7() {
        return getSystem();
    }

    @Override
    public String component8() {
        return getModelId();
    }

    @Override
    public String component9() {
        return getModelKey();
    }

    @Override
    public String component10() {
        return getModelCategory();
    }

    @Override
    public String component11() {
        return getRecordJson();
    }

    @Override
    public String component12() {
        return getRecordComponent();
    }

    @Override
    public String component13() {
        return getUiConfig();
    }

    @Override
    public String component14() {
        return getUiComponent();
    }

    @Override
    public String component15() {
        return getSigma();
    }

    @Override
    public String component16() {
        return getLanguage();
    }

    @Override
    public Boolean component17() {
        return getActive();
    }

    @Override
    public String component18() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component19() {
        return getCreatedAt();
    }

    @Override
    public String component20() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component21() {
        return getUpdatedAt();
    }

    @Override
    public String component22() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public String value5() {
        return getType();
    }

    @Override
    public String value6() {
        return getStatus();
    }

    @Override
    public Boolean value7() {
        return getSystem();
    }

    @Override
    public String value8() {
        return getModelId();
    }

    @Override
    public String value9() {
        return getModelKey();
    }

    @Override
    public String value10() {
        return getModelCategory();
    }

    @Override
    public String value11() {
        return getRecordJson();
    }

    @Override
    public String value12() {
        return getRecordComponent();
    }

    @Override
    public String value13() {
        return getUiConfig();
    }

    @Override
    public String value14() {
        return getUiComponent();
    }

    @Override
    public String value15() {
        return getSigma();
    }

    @Override
    public String value16() {
        return getLanguage();
    }

    @Override
    public Boolean value17() {
        return getActive();
    }

    @Override
    public String value18() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value19() {
        return getCreatedAt();
    }

    @Override
    public String value20() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value21() {
        return getUpdatedAt();
    }

    @Override
    public String value22() {
        return getUpdatedBy();
    }

    @Override
    public TplTicketRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public TplTicketRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public TplTicketRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public TplTicketRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public TplTicketRecord value5(String value) {
        setType(value);
        return this;
    }

    @Override
    public TplTicketRecord value6(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public TplTicketRecord value7(Boolean value) {
        setSystem(value);
        return this;
    }

    @Override
    public TplTicketRecord value8(String value) {
        setModelId(value);
        return this;
    }

    @Override
    public TplTicketRecord value9(String value) {
        setModelKey(value);
        return this;
    }

    @Override
    public TplTicketRecord value10(String value) {
        setModelCategory(value);
        return this;
    }

    @Override
    public TplTicketRecord value11(String value) {
        setRecordJson(value);
        return this;
    }

    @Override
    public TplTicketRecord value12(String value) {
        setRecordComponent(value);
        return this;
    }

    @Override
    public TplTicketRecord value13(String value) {
        setUiConfig(value);
        return this;
    }

    @Override
    public TplTicketRecord value14(String value) {
        setUiComponent(value);
        return this;
    }

    @Override
    public TplTicketRecord value15(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public TplTicketRecord value16(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public TplTicketRecord value17(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public TplTicketRecord value18(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public TplTicketRecord value19(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public TplTicketRecord value20(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public TplTicketRecord value21(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public TplTicketRecord value22(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public TplTicketRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Boolean value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, Boolean value17, String value18, LocalDateTime value19, String value20, LocalDateTime value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITplTicket from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setDescription(from.getDescription());
        setType(from.getType());
        setStatus(from.getStatus());
        setSystem(from.getSystem());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setModelCategory(from.getModelCategory());
        setRecordJson(from.getRecordJson());
        setRecordComponent(from.getRecordComponent());
        setUiConfig(from.getUiConfig());
        setUiComponent(from.getUiComponent());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends ITplTicket> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TplTicketRecord
     */
    public TplTicketRecord() {
        super(TplTicket.TPL_TICKET);
    }

    /**
     * Create a detached, initialised TplTicketRecord
     */
    public TplTicketRecord(String key, String code, String name, String description, String type, String status, Boolean system, String modelId, String modelKey, String modelCategory, String recordJson, String recordComponent, String uiConfig, String uiComponent, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(TplTicket.TPL_TICKET);

        setKey(key);
        setCode(code);
        setName(name);
        setDescription(description);
        setType(type);
        setStatus(status);
        setSystem(system);
        setModelId(modelId);
        setModelKey(modelKey);
        setModelCategory(modelCategory);
        setRecordJson(recordJson);
        setRecordComponent(recordComponent);
        setUiConfig(uiConfig);
        setUiComponent(uiComponent);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised TplTicketRecord
     */
    public TplTicketRecord(cn.vertxup.tpl.domain.tables.pojos.TplTicket value) {
        super(TplTicket.TPL_TICKET);

        if (value != null) {
            setKey(value.getKey());
            setCode(value.getCode());
            setName(value.getName());
            setDescription(value.getDescription());
            setType(value.getType());
            setStatus(value.getStatus());
            setSystem(value.getSystem());
            setModelId(value.getModelId());
            setModelKey(value.getModelKey());
            setModelCategory(value.getModelCategory());
            setRecordJson(value.getRecordJson());
            setRecordComponent(value.getRecordComponent());
            setUiConfig(value.getUiConfig());
            setUiComponent(value.getUiComponent());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public TplTicketRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
