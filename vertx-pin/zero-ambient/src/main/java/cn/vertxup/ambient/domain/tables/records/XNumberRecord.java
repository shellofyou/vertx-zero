/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.records;


import cn.vertxup.ambient.domain.tables.XNumber;
import cn.vertxup.ambient.domain.tables.interfaces.IXNumber;

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
public class XNumberRecord extends UpdatableRecordImpl<XNumberRecord> implements VertxPojo, Record22<String, String, String, Long, String, String, String, String, String, Integer, Integer, Boolean, String, Boolean, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IXNumber {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.KEY</code>. 「key」- 主键
     */
    @Override
    public XNumberRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.KEY</code>. 「key」- 主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.CODE</code>. 「code」- 编码
     */
    @Override
    public XNumberRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.CODE</code>. 「code」- 编码
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.COMMENT</code>. 「comment」-
     * 编号备注信息，用于描述编号数据,comment,S_COMMENT
     */
    @Override
    public XNumberRecord setComment(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.COMMENT</code>. 「comment」-
     * 编号备注信息，用于描述编号数据,comment,S_COMMENT
     */
    @Override
    public String getComment() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.CURRENT</code>.
     * 「current」编号当前值，对应${seed}，每次变化时current提取后更新为：current + step或current -
     * step,current,L_CURRENT
     */
    @Override
    public XNumberRecord setCurrent(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.CURRENT</code>.
     * 「current」编号当前值，对应${seed}，每次变化时current提取后更新为：current + step或current -
     * step,current,L_CURRENT
     */
    @Override
    public Long getCurrent() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.FORMAT</code>.
     * 「format」格式信息，用于处理最终格式：,format,S_FORMAT
     */
    @Override
    public XNumberRecord setFormat(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.FORMAT</code>.
     * 「format」格式信息，用于处理最终格式：,format,S_FORMAT
     */
    @Override
    public String getFormat() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.IDENTIFIER</code>.
     * 「identifier」编号对应的identifier，用于查询当前identifier使用的序号信息,identifier,S_IDENTIFIER
     */
    @Override
    public XNumberRecord setIdentifier(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.IDENTIFIER</code>.
     * 「identifier」编号对应的identifier，用于查询当前identifier使用的序号信息,identifier,S_IDENTIFIER
     */
    @Override
    public String getIdentifier() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.PREFIX</code>.
     * 「prefix」编号前缀,prefix,S_PREFIX
     */
    @Override
    public XNumberRecord setPrefix(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.PREFIX</code>.
     * 「prefix」编号前缀,prefix,S_PREFIX
     */
    @Override
    public String getPrefix() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.SUFFIX</code>.
     * 「suffix」编号后缀,suffix,S_SUFFIX
     */
    @Override
    public XNumberRecord setSuffix(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.SUFFIX</code>.
     * 「suffix」编号后缀,suffix,S_SUFFIX
     */
    @Override
    public String getSuffix() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.TIME</code>.
     * 「time」时间对应Pattern，对应${time}：YYYY-MM-DD
     * HH:mm:ss用于描述时间格式生成序号时间部分,time,S_TIME
     */
    @Override
    public XNumberRecord setTime(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.TIME</code>.
     * 「time」时间对应Pattern，对应${time}：YYYY-MM-DD
     * HH:mm:ss用于描述时间格式生成序号时间部分,time,S_TIME
     */
    @Override
    public String getTime() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.LENGTH</code>.
     * 「length」编号长度，编号长度不包含prefix和suffix部分,length,I_LENGTH
     */
    @Override
    public XNumberRecord setLength(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.LENGTH</code>.
     * 「length」编号长度，编号长度不包含prefix和suffix部分,length,I_LENGTH
     */
    @Override
    public Integer getLength() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.STEP</code>.
     * 「step」编号的步进系数，每次按照step进行变化,step,I_STEP
     */
    @Override
    public XNumberRecord setStep(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.STEP</code>.
     * 「step」编号的步进系数，每次按照step进行变化,step,I_STEP
     */
    @Override
    public Integer getStep() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.DECREMENT</code>.
     * 「decrement」递增/递减？如果为true则递减，为false则是递增,decrement,IS_DECREMENT
     */
    @Override
    public XNumberRecord setDecrement(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.DECREMENT</code>.
     * 「decrement」递增/递减？如果为true则递减，为false则是递增,decrement,IS_DECREMENT
     */
    @Override
    public Boolean getDecrement() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public XNumberRecord setAppId(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.RENEWAL</code>. 「renewal」- 是否循环
     */
    @Override
    public XNumberRecord setRenewal(Boolean value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.RENEWAL</code>. 「renewal」- 是否循环
     */
    @Override
    public Boolean getRenewal() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XNumberRecord setActive(Boolean value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XNumberRecord setSigma(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public XNumberRecord setMetadata(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XNumberRecord setLanguage(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public XNumberRecord setCreatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XNumberRecord setCreatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public XNumberRecord setUpdatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XNumberRecord setUpdatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.UPDATED_BY</code>. 「updatedBy」- 更新人
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
    public Row22<String, String, String, Long, String, String, String, String, String, Integer, Integer, Boolean, String, Boolean, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, String, Long, String, String, String, String, String, Integer, Integer, Boolean, String, Boolean, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return XNumber.X_NUMBER.KEY;
    }

    @Override
    public Field<String> field2() {
        return XNumber.X_NUMBER.CODE;
    }

    @Override
    public Field<String> field3() {
        return XNumber.X_NUMBER.COMMENT;
    }

    @Override
    public Field<Long> field4() {
        return XNumber.X_NUMBER.CURRENT;
    }

    @Override
    public Field<String> field5() {
        return XNumber.X_NUMBER.FORMAT;
    }

    @Override
    public Field<String> field6() {
        return XNumber.X_NUMBER.IDENTIFIER;
    }

    @Override
    public Field<String> field7() {
        return XNumber.X_NUMBER.PREFIX;
    }

    @Override
    public Field<String> field8() {
        return XNumber.X_NUMBER.SUFFIX;
    }

    @Override
    public Field<String> field9() {
        return XNumber.X_NUMBER.TIME;
    }

    @Override
    public Field<Integer> field10() {
        return XNumber.X_NUMBER.LENGTH;
    }

    @Override
    public Field<Integer> field11() {
        return XNumber.X_NUMBER.STEP;
    }

    @Override
    public Field<Boolean> field12() {
        return XNumber.X_NUMBER.DECREMENT;
    }

    @Override
    public Field<String> field13() {
        return XNumber.X_NUMBER.APP_ID;
    }

    @Override
    public Field<Boolean> field14() {
        return XNumber.X_NUMBER.RENEWAL;
    }

    @Override
    public Field<Boolean> field15() {
        return XNumber.X_NUMBER.ACTIVE;
    }

    @Override
    public Field<String> field16() {
        return XNumber.X_NUMBER.SIGMA;
    }

    @Override
    public Field<String> field17() {
        return XNumber.X_NUMBER.METADATA;
    }

    @Override
    public Field<String> field18() {
        return XNumber.X_NUMBER.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return XNumber.X_NUMBER.CREATED_AT;
    }

    @Override
    public Field<String> field20() {
        return XNumber.X_NUMBER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field21() {
        return XNumber.X_NUMBER.UPDATED_AT;
    }

    @Override
    public Field<String> field22() {
        return XNumber.X_NUMBER.UPDATED_BY;
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
        return getComment();
    }

    @Override
    public Long component4() {
        return getCurrent();
    }

    @Override
    public String component5() {
        return getFormat();
    }

    @Override
    public String component6() {
        return getIdentifier();
    }

    @Override
    public String component7() {
        return getPrefix();
    }

    @Override
    public String component8() {
        return getSuffix();
    }

    @Override
    public String component9() {
        return getTime();
    }

    @Override
    public Integer component10() {
        return getLength();
    }

    @Override
    public Integer component11() {
        return getStep();
    }

    @Override
    public Boolean component12() {
        return getDecrement();
    }

    @Override
    public String component13() {
        return getAppId();
    }

    @Override
    public Boolean component14() {
        return getRenewal();
    }

    @Override
    public Boolean component15() {
        return getActive();
    }

    @Override
    public String component16() {
        return getSigma();
    }

    @Override
    public String component17() {
        return getMetadata();
    }

    @Override
    public String component18() {
        return getLanguage();
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
        return getComment();
    }

    @Override
    public Long value4() {
        return getCurrent();
    }

    @Override
    public String value5() {
        return getFormat();
    }

    @Override
    public String value6() {
        return getIdentifier();
    }

    @Override
    public String value7() {
        return getPrefix();
    }

    @Override
    public String value8() {
        return getSuffix();
    }

    @Override
    public String value9() {
        return getTime();
    }

    @Override
    public Integer value10() {
        return getLength();
    }

    @Override
    public Integer value11() {
        return getStep();
    }

    @Override
    public Boolean value12() {
        return getDecrement();
    }

    @Override
    public String value13() {
        return getAppId();
    }

    @Override
    public Boolean value14() {
        return getRenewal();
    }

    @Override
    public Boolean value15() {
        return getActive();
    }

    @Override
    public String value16() {
        return getSigma();
    }

    @Override
    public String value17() {
        return getMetadata();
    }

    @Override
    public String value18() {
        return getLanguage();
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
    public XNumberRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public XNumberRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public XNumberRecord value3(String value) {
        setComment(value);
        return this;
    }

    @Override
    public XNumberRecord value4(Long value) {
        setCurrent(value);
        return this;
    }

    @Override
    public XNumberRecord value5(String value) {
        setFormat(value);
        return this;
    }

    @Override
    public XNumberRecord value6(String value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public XNumberRecord value7(String value) {
        setPrefix(value);
        return this;
    }

    @Override
    public XNumberRecord value8(String value) {
        setSuffix(value);
        return this;
    }

    @Override
    public XNumberRecord value9(String value) {
        setTime(value);
        return this;
    }

    @Override
    public XNumberRecord value10(Integer value) {
        setLength(value);
        return this;
    }

    @Override
    public XNumberRecord value11(Integer value) {
        setStep(value);
        return this;
    }

    @Override
    public XNumberRecord value12(Boolean value) {
        setDecrement(value);
        return this;
    }

    @Override
    public XNumberRecord value13(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public XNumberRecord value14(Boolean value) {
        setRenewal(value);
        return this;
    }

    @Override
    public XNumberRecord value15(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public XNumberRecord value16(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public XNumberRecord value17(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public XNumberRecord value18(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public XNumberRecord value19(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public XNumberRecord value20(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public XNumberRecord value21(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public XNumberRecord value22(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public XNumberRecord values(String value1, String value2, String value3, Long value4, String value5, String value6, String value7, String value8, String value9, Integer value10, Integer value11, Boolean value12, String value13, Boolean value14, Boolean value15, String value16, String value17, String value18, LocalDateTime value19, String value20, LocalDateTime value21, String value22) {
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
    public void from(IXNumber from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setComment(from.getComment());
        setCurrent(from.getCurrent());
        setFormat(from.getFormat());
        setIdentifier(from.getIdentifier());
        setPrefix(from.getPrefix());
        setSuffix(from.getSuffix());
        setTime(from.getTime());
        setLength(from.getLength());
        setStep(from.getStep());
        setDecrement(from.getDecrement());
        setAppId(from.getAppId());
        setRenewal(from.getRenewal());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IXNumber> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XNumberRecord
     */
    public XNumberRecord() {
        super(XNumber.X_NUMBER);
    }

    /**
     * Create a detached, initialised XNumberRecord
     */
    public XNumberRecord(String key, String code, String comment, Long current, String format, String identifier, String prefix, String suffix, String time, Integer length, Integer step, Boolean decrement, String appId, Boolean renewal, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(XNumber.X_NUMBER);

        setKey(key);
        setCode(code);
        setComment(comment);
        setCurrent(current);
        setFormat(format);
        setIdentifier(identifier);
        setPrefix(prefix);
        setSuffix(suffix);
        setTime(time);
        setLength(length);
        setStep(step);
        setDecrement(decrement);
        setAppId(appId);
        setRenewal(renewal);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised XNumberRecord
     */
    public XNumberRecord(cn.vertxup.ambient.domain.tables.pojos.XNumber value) {
        super(XNumber.X_NUMBER);

        if (value != null) {
            setKey(value.getKey());
            setCode(value.getCode());
            setComment(value.getComment());
            setCurrent(value.getCurrent());
            setFormat(value.getFormat());
            setIdentifier(value.getIdentifier());
            setPrefix(value.getPrefix());
            setSuffix(value.getSuffix());
            setTime(value.getTime());
            setLength(value.getLength());
            setStep(value.getStep());
            setDecrement(value.getDecrement());
            setAppId(value.getAppId());
            setRenewal(value.getRenewal());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public XNumberRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
