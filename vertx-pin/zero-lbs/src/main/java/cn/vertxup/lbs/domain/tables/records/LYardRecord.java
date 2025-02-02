/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables.records;


import cn.vertxup.lbs.domain.tables.LYard;
import cn.vertxup.lbs.domain.tables.interfaces.ILYard;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LYardRecord extends UpdatableRecordImpl<LYardRecord> implements VertxPojo, Record13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String>, ILYard {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.KEY</code>. 「key」- 主键
     */
    @Override
    public LYardRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.KEY</code>. 「key」- 主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.NAME</code>. 「name」- 名称
     */
    @Override
    public LYardRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.NAME</code>. 「name」- 名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.CODE</code>. 「code」- 编码
     */
    @Override
    public LYardRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.CODE</code>. 「code」- 编码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public LYardRecord setMetadata(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.ORDER</code>. 「order」- 排序
     */
    @Override
    public LYardRecord setOrder(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.ORDER</code>. 「order」- 排序
     */
    @Override
    public Integer getOrder() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.LOCATION_ID</code>. 「locationId」-
     * 关联地址ID
     */
    @Override
    public LYardRecord setLocationId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.LOCATION_ID</code>. 「locationId」-
     * 关联地址ID
     */
    @Override
    public String getLocationId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public LYardRecord setActive(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public LYardRecord setSigma(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public LYardRecord setLanguage(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LYardRecord setCreatedAt(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public LYardRecord setCreatedBy(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LYardRecord setUpdatedAt(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public LYardRecord setUpdatedBy(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return LYard.L_YARD.KEY;
    }

    @Override
    public Field<String> field2() {
        return LYard.L_YARD.NAME;
    }

    @Override
    public Field<String> field3() {
        return LYard.L_YARD.CODE;
    }

    @Override
    public Field<String> field4() {
        return LYard.L_YARD.METADATA;
    }

    @Override
    public Field<Integer> field5() {
        return LYard.L_YARD.ORDER;
    }

    @Override
    public Field<String> field6() {
        return LYard.L_YARD.LOCATION_ID;
    }

    @Override
    public Field<Boolean> field7() {
        return LYard.L_YARD.ACTIVE;
    }

    @Override
    public Field<String> field8() {
        return LYard.L_YARD.SIGMA;
    }

    @Override
    public Field<String> field9() {
        return LYard.L_YARD.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return LYard.L_YARD.CREATED_AT;
    }

    @Override
    public Field<String> field11() {
        return LYard.L_YARD.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return LYard.L_YARD.UPDATED_AT;
    }

    @Override
    public Field<String> field13() {
        return LYard.L_YARD.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getMetadata();
    }

    @Override
    public Integer component5() {
        return getOrder();
    }

    @Override
    public String component6() {
        return getLocationId();
    }

    @Override
    public Boolean component7() {
        return getActive();
    }

    @Override
    public String component8() {
        return getSigma();
    }

    @Override
    public String component9() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component10() {
        return getCreatedAt();
    }

    @Override
    public String component11() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component12() {
        return getUpdatedAt();
    }

    @Override
    public String component13() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getMetadata();
    }

    @Override
    public Integer value5() {
        return getOrder();
    }

    @Override
    public String value6() {
        return getLocationId();
    }

    @Override
    public Boolean value7() {
        return getActive();
    }

    @Override
    public String value8() {
        return getSigma();
    }

    @Override
    public String value9() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value10() {
        return getCreatedAt();
    }

    @Override
    public String value11() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value12() {
        return getUpdatedAt();
    }

    @Override
    public String value13() {
        return getUpdatedBy();
    }

    @Override
    public LYardRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public LYardRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public LYardRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public LYardRecord value4(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public LYardRecord value5(Integer value) {
        setOrder(value);
        return this;
    }

    @Override
    public LYardRecord value6(String value) {
        setLocationId(value);
        return this;
    }

    @Override
    public LYardRecord value7(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public LYardRecord value8(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public LYardRecord value9(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public LYardRecord value10(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public LYardRecord value11(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public LYardRecord value12(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public LYardRecord value13(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public LYardRecord values(String value1, String value2, String value3, String value4, Integer value5, String value6, Boolean value7, String value8, String value9, LocalDateTime value10, String value11, LocalDateTime value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ILYard from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setMetadata(from.getMetadata());
        setOrder(from.getOrder());
        setLocationId(from.getLocationId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends ILYard> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LYardRecord
     */
    public LYardRecord() {
        super(LYard.L_YARD);
    }

    /**
     * Create a detached, initialised LYardRecord
     */
    public LYardRecord(String key, String name, String code, String metadata, Integer order, String locationId, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(LYard.L_YARD);

        setKey(key);
        setName(name);
        setCode(code);
        setMetadata(metadata);
        setOrder(order);
        setLocationId(locationId);
        setActive(active);
        setSigma(sigma);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised LYardRecord
     */
    public LYardRecord(cn.vertxup.lbs.domain.tables.pojos.LYard value) {
        super(LYard.L_YARD);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setMetadata(value.getMetadata());
            setOrder(value.getOrder());
            setLocationId(value.getLocationId());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public LYardRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
