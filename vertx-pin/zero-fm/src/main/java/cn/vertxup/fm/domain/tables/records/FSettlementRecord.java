/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.records;


import cn.vertxup.fm.domain.tables.FSettlement;
import cn.vertxup.fm.domain.tables.interfaces.IFSettlement;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FSettlementRecord extends UpdatableRecordImpl<FSettlementRecord> implements VertxPojo, Record21<String, String, String, BigDecimal, String, Byte, Boolean, LocalDateTime, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IFSettlement {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.KEY</code>. 「key」- 结算单主键
     */
    @Override
    public FSettlementRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.KEY</code>. 「key」- 结算单主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.CODE</code>. 「code」 - 结算单编号
     */
    @Override
    public FSettlementRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.CODE</code>. 「code」 - 结算单编号
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.SERIAL</code>. 「serial」 - 结算单据号
     */
    @Override
    public FSettlementRecord setSerial(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.SERIAL</code>. 「serial」 - 结算单据号
     */
    @Override
    public String getSerial() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public FSettlementRecord setAmount(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.COMMENT</code>. 「comment」 -
     * 结算单备注
     */
    @Override
    public FSettlementRecord setComment(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.COMMENT</code>. 「comment」 -
     * 结算单备注
     */
    @Override
    public String getComment() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.ROUNDED</code>. 「rounded」抹零方式 =
     * true：四舍五入、round = false：零头舍掉,round,IS_ROUND
     */
    @Override
    public FSettlementRecord setRounded(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.ROUNDED</code>. 「rounded」抹零方式 =
     * true：四舍五入、round = false：零头舍掉,round,IS_ROUND
     */
    @Override
    public Byte getRounded() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.FINISHED</code>. 「finished」-
     * 是否完成
     */
    @Override
    public FSettlementRecord setFinished(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.FINISHED</code>. 「finished」-
     * 是否完成
     */
    @Override
    public Boolean getFinished() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.FINISHED_AT</code>. 「createdAt」-
     * 完成时间
     */
    @Override
    public FSettlementRecord setFinishedAt(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.FINISHED_AT</code>. 「createdAt」-
     * 完成时间
     */
    @Override
    public LocalDateTime getFinishedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.SIGN_NAME</code>.
     * 「signName」签单人姓名
     */
    @Override
    public FSettlementRecord setSignName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.SIGN_NAME</code>.
     * 「signName」签单人姓名
     */
    @Override
    public String getSignName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.SIGN_MOBILE</code>.
     * 「signMobile」签单人电话
     */
    @Override
    public FSettlementRecord setSignMobile(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.SIGN_MOBILE</code>.
     * 「signMobile」签单人电话
     */
    @Override
    public String getSignMobile() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.CUSTOMER_ID</code>.
     * 「customerId」结算对象（单位ID）
     */
    @Override
    public FSettlementRecord setCustomerId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.CUSTOMER_ID</code>.
     * 「customerId」结算对象（单位ID）
     */
    @Override
    public String getCustomerId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.ORDER_ID</code>. 「orderId」-
     * 预授权所属订单ID
     */
    @Override
    public FSettlementRecord setOrderId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.ORDER_ID</code>. 「orderId」-
     * 预授权所属订单ID
     */
    @Override
    public String getOrderId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.BOOK_ID</code>. 「bookId」- 所属账本ID
     */
    @Override
    public FSettlementRecord setBookId(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.BOOK_ID</code>. 「bookId」- 所属账本ID
     */
    @Override
    public String getBookId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FSettlementRecord setSigma(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public FSettlementRecord setLanguage(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FSettlementRecord setActive(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public FSettlementRecord setMetadata(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public FSettlementRecord setCreatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public FSettlementRecord setCreatedBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public FSettlementRecord setUpdatedAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public FSettlementRecord setUpdatedBy(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, BigDecimal, String, Byte, Boolean, LocalDateTime, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<String, String, String, BigDecimal, String, Byte, Boolean, LocalDateTime, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FSettlement.F_SETTLEMENT.KEY;
    }

    @Override
    public Field<String> field2() {
        return FSettlement.F_SETTLEMENT.CODE;
    }

    @Override
    public Field<String> field3() {
        return FSettlement.F_SETTLEMENT.SERIAL;
    }

    @Override
    public Field<BigDecimal> field4() {
        return FSettlement.F_SETTLEMENT.AMOUNT;
    }

    @Override
    public Field<String> field5() {
        return FSettlement.F_SETTLEMENT.COMMENT;
    }

    @Override
    public Field<Byte> field6() {
        return FSettlement.F_SETTLEMENT.ROUNDED;
    }

    @Override
    public Field<Boolean> field7() {
        return FSettlement.F_SETTLEMENT.FINISHED;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return FSettlement.F_SETTLEMENT.FINISHED_AT;
    }

    @Override
    public Field<String> field9() {
        return FSettlement.F_SETTLEMENT.SIGN_NAME;
    }

    @Override
    public Field<String> field10() {
        return FSettlement.F_SETTLEMENT.SIGN_MOBILE;
    }

    @Override
    public Field<String> field11() {
        return FSettlement.F_SETTLEMENT.CUSTOMER_ID;
    }

    @Override
    public Field<String> field12() {
        return FSettlement.F_SETTLEMENT.ORDER_ID;
    }

    @Override
    public Field<String> field13() {
        return FSettlement.F_SETTLEMENT.BOOK_ID;
    }

    @Override
    public Field<String> field14() {
        return FSettlement.F_SETTLEMENT.SIGMA;
    }

    @Override
    public Field<String> field15() {
        return FSettlement.F_SETTLEMENT.LANGUAGE;
    }

    @Override
    public Field<Boolean> field16() {
        return FSettlement.F_SETTLEMENT.ACTIVE;
    }

    @Override
    public Field<String> field17() {
        return FSettlement.F_SETTLEMENT.METADATA;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return FSettlement.F_SETTLEMENT.CREATED_AT;
    }

    @Override
    public Field<String> field19() {
        return FSettlement.F_SETTLEMENT.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field20() {
        return FSettlement.F_SETTLEMENT.UPDATED_AT;
    }

    @Override
    public Field<String> field21() {
        return FSettlement.F_SETTLEMENT.UPDATED_BY;
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
        return getSerial();
    }

    @Override
    public BigDecimal component4() {
        return getAmount();
    }

    @Override
    public String component5() {
        return getComment();
    }

    @Override
    public Byte component6() {
        return getRounded();
    }

    @Override
    public Boolean component7() {
        return getFinished();
    }

    @Override
    public LocalDateTime component8() {
        return getFinishedAt();
    }

    @Override
    public String component9() {
        return getSignName();
    }

    @Override
    public String component10() {
        return getSignMobile();
    }

    @Override
    public String component11() {
        return getCustomerId();
    }

    @Override
    public String component12() {
        return getOrderId();
    }

    @Override
    public String component13() {
        return getBookId();
    }

    @Override
    public String component14() {
        return getSigma();
    }

    @Override
    public String component15() {
        return getLanguage();
    }

    @Override
    public Boolean component16() {
        return getActive();
    }

    @Override
    public String component17() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component18() {
        return getCreatedAt();
    }

    @Override
    public String component19() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component20() {
        return getUpdatedAt();
    }

    @Override
    public String component21() {
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
        return getSerial();
    }

    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    @Override
    public String value5() {
        return getComment();
    }

    @Override
    public Byte value6() {
        return getRounded();
    }

    @Override
    public Boolean value7() {
        return getFinished();
    }

    @Override
    public LocalDateTime value8() {
        return getFinishedAt();
    }

    @Override
    public String value9() {
        return getSignName();
    }

    @Override
    public String value10() {
        return getSignMobile();
    }

    @Override
    public String value11() {
        return getCustomerId();
    }

    @Override
    public String value12() {
        return getOrderId();
    }

    @Override
    public String value13() {
        return getBookId();
    }

    @Override
    public String value14() {
        return getSigma();
    }

    @Override
    public String value15() {
        return getLanguage();
    }

    @Override
    public Boolean value16() {
        return getActive();
    }

    @Override
    public String value17() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value18() {
        return getCreatedAt();
    }

    @Override
    public String value19() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value20() {
        return getUpdatedAt();
    }

    @Override
    public String value21() {
        return getUpdatedBy();
    }

    @Override
    public FSettlementRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public FSettlementRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FSettlementRecord value3(String value) {
        setSerial(value);
        return this;
    }

    @Override
    public FSettlementRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public FSettlementRecord value5(String value) {
        setComment(value);
        return this;
    }

    @Override
    public FSettlementRecord value6(Byte value) {
        setRounded(value);
        return this;
    }

    @Override
    public FSettlementRecord value7(Boolean value) {
        setFinished(value);
        return this;
    }

    @Override
    public FSettlementRecord value8(LocalDateTime value) {
        setFinishedAt(value);
        return this;
    }

    @Override
    public FSettlementRecord value9(String value) {
        setSignName(value);
        return this;
    }

    @Override
    public FSettlementRecord value10(String value) {
        setSignMobile(value);
        return this;
    }

    @Override
    public FSettlementRecord value11(String value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public FSettlementRecord value12(String value) {
        setOrderId(value);
        return this;
    }

    @Override
    public FSettlementRecord value13(String value) {
        setBookId(value);
        return this;
    }

    @Override
    public FSettlementRecord value14(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public FSettlementRecord value15(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public FSettlementRecord value16(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public FSettlementRecord value17(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public FSettlementRecord value18(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public FSettlementRecord value19(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public FSettlementRecord value20(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public FSettlementRecord value21(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public FSettlementRecord values(String value1, String value2, String value3, BigDecimal value4, String value5, Byte value6, Boolean value7, LocalDateTime value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, Boolean value16, String value17, LocalDateTime value18, String value19, LocalDateTime value20, String value21) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFSettlement from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setRounded(from.getRounded());
        setFinished(from.getFinished());
        setFinishedAt(from.getFinishedAt());
        setSignName(from.getSignName());
        setSignMobile(from.getSignMobile());
        setCustomerId(from.getCustomerId());
        setOrderId(from.getOrderId());
        setBookId(from.getBookId());
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
    public <E extends IFSettlement> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FSettlementRecord
     */
    public FSettlementRecord() {
        super(FSettlement.F_SETTLEMENT);
    }

    /**
     * Create a detached, initialised FSettlementRecord
     */
    public FSettlementRecord(String key, String code, String serial, BigDecimal amount, String comment, Byte rounded, Boolean finished, LocalDateTime finishedAt, String signName, String signMobile, String customerId, String orderId, String bookId, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(FSettlement.F_SETTLEMENT);

        setKey(key);
        setCode(code);
        setSerial(serial);
        setAmount(amount);
        setComment(comment);
        setRounded(rounded);
        setFinished(finished);
        setFinishedAt(finishedAt);
        setSignName(signName);
        setSignMobile(signMobile);
        setCustomerId(customerId);
        setOrderId(orderId);
        setBookId(bookId);
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
     * Create a detached, initialised FSettlementRecord
     */
    public FSettlementRecord(cn.vertxup.fm.domain.tables.pojos.FSettlement value) {
        super(FSettlement.F_SETTLEMENT);

        if (value != null) {
            setKey(value.getKey());
            setCode(value.getCode());
            setSerial(value.getSerial());
            setAmount(value.getAmount());
            setComment(value.getComment());
            setRounded(value.getRounded());
            setFinished(value.getFinished());
            setFinishedAt(value.getFinishedAt());
            setSignName(value.getSignName());
            setSignMobile(value.getSignMobile());
            setCustomerId(value.getCustomerId());
            setOrderId(value.getOrderId());
            setBookId(value.getBookId());
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

        public FSettlementRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
