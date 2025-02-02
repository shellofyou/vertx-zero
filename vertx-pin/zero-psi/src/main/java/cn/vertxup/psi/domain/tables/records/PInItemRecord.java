/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.records;


import cn.vertxup.psi.domain.tables.PInItem;
import cn.vertxup.psi.domain.tables.interfaces.IPInItem;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PInItemRecord extends UpdatableRecordImpl<PInItemRecord> implements VertxPojo, IPInItem {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.KEY</code>. 「key」- 入库明细主键
     */
    @Override
    public PInItemRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.KEY</code>. 「key」- 入库明细主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.SERIAL</code>. 「serial」-
     * 入库明细号（系统可用，直接计算）
     */
    @Override
    public PInItemRecord setSerial(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.SERIAL</code>. 「serial」-
     * 入库明细号（系统可用，直接计算）
     */
    @Override
    public String getSerial() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.STATUS</code>. 「status」- 明细状态
     */
    @Override
    public PInItemRecord setStatus(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.STATUS</code>. 「status」- 明细状态
     */
    @Override
    public String getStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_ID</code>. 「commodityId」-
     * 商品ID
     */
    @Override
    public PInItemRecord setCommodityId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_ID</code>. 「commodityId」-
     * 商品ID
     */
    @Override
    public String getCommodityId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public PInItemRecord setCommodityCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    @Override
    public String getCommodityCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public PInItemRecord setCommodityName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    @Override
    public String getCommodityName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_LOGO</code>.
     * 「commodityLogo」- 商品Logo
     */
    @Override
    public PInItemRecord setCommodityLogo(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_LOGO</code>.
     * 「commodityLogo」- 商品Logo
     */
    @Override
    public String getCommodityLogo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 供应商
     */
    @Override
    public PInItemRecord setCustomerId(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 供应商
     */
    @Override
    public String getCustomerId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.FROM_NAME</code>. 「fromName」-
     * 供应商商品名称
     */
    @Override
    public PInItemRecord setFromName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.FROM_NAME</code>. 「fromName」-
     * 供应商商品名称
     */
    @Override
    public String getFromName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.FROM_CODE</code>. 「fromCode」-
     * 供应商商品编码
     */
    @Override
    public PInItemRecord setFromCode(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.FROM_CODE</code>. 「fromCode」-
     * 供应商商品编码
     */
    @Override
    public String getFromCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TICKET_ID</code>. 「ticketId」- 入库单ID
     */
    @Override
    public PInItemRecord setTicketId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TICKET_ID</code>. 「ticketId」- 入库单ID
     */
    @Override
    public String getTicketId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_NUMBER</code>. 「orderNumber」-
     * 订单编号
     */
    @Override
    public PInItemRecord setOrderNumber(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_NUMBER</code>. 「orderNumber」-
     * 订单编号
     */
    @Override
    public String getOrderNumber() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_SOURCE</code>. 「orderSource」-
     * 源单单号
     */
    @Override
    public PInItemRecord setOrderSource(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_SOURCE</code>. 「orderSource」-
     * 源单单号
     */
    @Override
    public String getOrderSource() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.WH_ID</code>. 「whId」- 实际入库仓库
     */
    @Override
    public PInItemRecord setWhId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.WH_ID</code>. 「whId」- 实际入库仓库
     */
    @Override
    public String getWhId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.NUM_WAIT</code>. 「numWait」- 预计入库
     */
    @Override
    public PInItemRecord setNumWait(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.NUM_WAIT</code>. 「numWait」- 预计入库
     */
    @Override
    public Integer getNumWait() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.NUM</code>. 「num」- 实际入库数量
     */
    @Override
    public PInItemRecord setNum(Integer value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.NUM</code>. 「num」- 实际入库数量
     */
    @Override
    public Integer getNum() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TAX_RATE</code>. 「taxRate」- 税率
     */
    @Override
    public PInItemRecord setTaxRate(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TAX_RATE</code>. 「taxRate」- 税率
     */
    @Override
    public BigDecimal getTaxRate() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TAX_AMOUNT</code>. 「taxAmount」- 税额
     */
    @Override
    public PInItemRecord setTaxAmount(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TAX_AMOUNT</code>. 「taxAmount」- 税额
     */
    @Override
    public BigDecimal getTaxAmount() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TAX_PRICE</code>. 「taxPrice」- 含税单价
     */
    @Override
    public PInItemRecord setTaxPrice(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TAX_PRICE</code>. 「taxPrice」- 含税单价
     */
    @Override
    public BigDecimal getTaxPrice() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_TOTAL</code>. 「amountTotal」-
     * 税价合计
     */
    @Override
    public PInItemRecord setAmountTotal(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_TOTAL</code>. 「amountTotal」-
     * 税价合计
     */
    @Override
    public BigDecimal getAmountTotal() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_SPLIT</code>. 「amountSplit」-
     * 采购分摊费用
     */
    @Override
    public PInItemRecord setAmountSplit(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_SPLIT</code>. 「amountSplit」-
     * 采购分摊费用
     */
    @Override
    public BigDecimal getAmountSplit() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT</code>. 「amount」- 采购总价（订单总价）
     */
    @Override
    public PInItemRecord setAmount(BigDecimal value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT</code>. 「amount」- 采购总价（订单总价）
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.PRICE</code>. 「price」- 采购单价（采购价）
     */
    @Override
    public PInItemRecord setPrice(BigDecimal value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.PRICE</code>. 「price」- 采购单价（采购价）
     */
    @Override
    public BigDecimal getPrice() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    @Override
    public PInItemRecord setComment(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    @Override
    public String getComment() {
        return (String) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER_BASIS</code>.
     * 「costPerBasis」- 基本单位成本
     */
    @Override
    public PInItemRecord setCostPerBasis(BigDecimal value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER_BASIS</code>.
     * 「costPerBasis」- 基本单位成本
     */
    @Override
    public BigDecimal getCostPerBasis() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER</code>. 「costPer」- 单位成本
     */
    @Override
    public PInItemRecord setCostPer(BigDecimal value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER</code>. 「costPer」- 单位成本
     */
    @Override
    public BigDecimal getCostPer() {
        return (BigDecimal) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COST_AMOUNT</code>. 「costAmount」-
     * 入库成本
     */
    @Override
    public PInItemRecord setCostAmount(BigDecimal value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COST_AMOUNT</code>. 「costAmount」-
     * 入库成本
     */
    @Override
    public BigDecimal getCostAmount() {
        return (BigDecimal) get(26);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    @Override
    public PInItemRecord setDiscountAmount(BigDecimal value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    @Override
    public BigDecimal getDiscountAmount() {
        return (BigDecimal) get(27);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    @Override
    public PInItemRecord setDiscountRate(BigDecimal value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    @Override
    public BigDecimal getDiscountRate() {
        return (BigDecimal) get(28);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public PInItemRecord setActive(Boolean value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(29);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public PInItemRecord setSigma(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(30);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public PInItemRecord setMetadata(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(31);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public PInItemRecord setLanguage(String value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(32);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public PInItemRecord setCreatedAt(LocalDateTime value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(33);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public PInItemRecord setCreatedBy(String value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(34);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public PInItemRecord setUpdatedAt(LocalDateTime value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(35);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public PInItemRecord setUpdatedBy(String value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(36);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IPInItem from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setStatus(from.getStatus());
        setCommodityId(from.getCommodityId());
        setCommodityCode(from.getCommodityCode());
        setCommodityName(from.getCommodityName());
        setCommodityLogo(from.getCommodityLogo());
        setCustomerId(from.getCustomerId());
        setFromName(from.getFromName());
        setFromCode(from.getFromCode());
        setTicketId(from.getTicketId());
        setOrderNumber(from.getOrderNumber());
        setOrderSource(from.getOrderSource());
        setWhId(from.getWhId());
        setNumWait(from.getNumWait());
        setNum(from.getNum());
        setTaxRate(from.getTaxRate());
        setTaxAmount(from.getTaxAmount());
        setTaxPrice(from.getTaxPrice());
        setAmountTotal(from.getAmountTotal());
        setAmountSplit(from.getAmountSplit());
        setAmount(from.getAmount());
        setPrice(from.getPrice());
        setComment(from.getComment());
        setCostPerBasis(from.getCostPerBasis());
        setCostPer(from.getCostPer());
        setCostAmount(from.getCostAmount());
        setDiscountAmount(from.getDiscountAmount());
        setDiscountRate(from.getDiscountRate());
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
    public <E extends IPInItem> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PInItemRecord
     */
    public PInItemRecord() {
        super(PInItem.P_IN_ITEM);
    }

    /**
     * Create a detached, initialised PInItemRecord
     */
    public PInItemRecord(String key, String serial, String status, String commodityId, String commodityCode, String commodityName, String commodityLogo, String customerId, String fromName, String fromCode, String ticketId, String orderNumber, String orderSource, String whId, Integer numWait, Integer num, BigDecimal taxRate, BigDecimal taxAmount, BigDecimal taxPrice, BigDecimal amountTotal, BigDecimal amountSplit, BigDecimal amount, BigDecimal price, String comment, BigDecimal costPerBasis, BigDecimal costPer, BigDecimal costAmount, BigDecimal discountAmount, BigDecimal discountRate, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(PInItem.P_IN_ITEM);

        setKey(key);
        setSerial(serial);
        setStatus(status);
        setCommodityId(commodityId);
        setCommodityCode(commodityCode);
        setCommodityName(commodityName);
        setCommodityLogo(commodityLogo);
        setCustomerId(customerId);
        setFromName(fromName);
        setFromCode(fromCode);
        setTicketId(ticketId);
        setOrderNumber(orderNumber);
        setOrderSource(orderSource);
        setWhId(whId);
        setNumWait(numWait);
        setNum(num);
        setTaxRate(taxRate);
        setTaxAmount(taxAmount);
        setTaxPrice(taxPrice);
        setAmountTotal(amountTotal);
        setAmountSplit(amountSplit);
        setAmount(amount);
        setPrice(price);
        setComment(comment);
        setCostPerBasis(costPerBasis);
        setCostPer(costPer);
        setCostAmount(costAmount);
        setDiscountAmount(discountAmount);
        setDiscountRate(discountRate);
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
     * Create a detached, initialised PInItemRecord
     */
    public PInItemRecord(cn.vertxup.psi.domain.tables.pojos.PInItem value) {
        super(PInItem.P_IN_ITEM);

        if (value != null) {
            setKey(value.getKey());
            setSerial(value.getSerial());
            setStatus(value.getStatus());
            setCommodityId(value.getCommodityId());
            setCommodityCode(value.getCommodityCode());
            setCommodityName(value.getCommodityName());
            setCommodityLogo(value.getCommodityLogo());
            setCustomerId(value.getCustomerId());
            setFromName(value.getFromName());
            setFromCode(value.getFromCode());
            setTicketId(value.getTicketId());
            setOrderNumber(value.getOrderNumber());
            setOrderSource(value.getOrderSource());
            setWhId(value.getWhId());
            setNumWait(value.getNumWait());
            setNum(value.getNum());
            setTaxRate(value.getTaxRate());
            setTaxAmount(value.getTaxAmount());
            setTaxPrice(value.getTaxPrice());
            setAmountTotal(value.getAmountTotal());
            setAmountSplit(value.getAmountSplit());
            setAmount(value.getAmount());
            setPrice(value.getPrice());
            setComment(value.getComment());
            setCostPerBasis(value.getCostPerBasis());
            setCostPer(value.getCostPer());
            setCostAmount(value.getCostAmount());
            setDiscountAmount(value.getDiscountAmount());
            setDiscountRate(value.getDiscountRate());
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

        public PInItemRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
