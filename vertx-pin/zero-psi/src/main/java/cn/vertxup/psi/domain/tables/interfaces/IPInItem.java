/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IPInItem extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.KEY</code>. 「key」- 入库明细主键
     */
    public IPInItem setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.KEY</code>. 「key」- 入库明细主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.SERIAL</code>. 「serial」-
     * 入库明细号（系统可用，直接计算）
     */
    public IPInItem setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.SERIAL</code>. 「serial」-
     * 入库明细号（系统可用，直接计算）
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.STATUS</code>. 「status」- 明细状态
     */
    public IPInItem setStatus(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.STATUS</code>. 「status」- 明细状态
     */
    public String getStatus();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_ID</code>. 「commodityId」-
     * 商品ID
     */
    public IPInItem setCommodityId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_ID</code>. 「commodityId」-
     * 商品ID
     */
    public String getCommodityId();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    public IPInItem setCommodityCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    public String getCommodityCode();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    public IPInItem setCommodityName(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    public String getCommodityName();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_LOGO</code>.
     * 「commodityLogo」- 商品Logo
     */
    public IPInItem setCommodityLogo(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMODITY_LOGO</code>.
     * 「commodityLogo」- 商品Logo
     */
    public String getCommodityLogo();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 供应商
     */
    public IPInItem setCustomerId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 供应商
     */
    public String getCustomerId();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.FROM_NAME</code>. 「fromName」-
     * 供应商商品名称
     */
    public IPInItem setFromName(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.FROM_NAME</code>. 「fromName」-
     * 供应商商品名称
     */
    public String getFromName();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.FROM_CODE</code>. 「fromCode」-
     * 供应商商品编码
     */
    public IPInItem setFromCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.FROM_CODE</code>. 「fromCode」-
     * 供应商商品编码
     */
    public String getFromCode();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TICKET_ID</code>. 「ticketId」- 入库单ID
     */
    public IPInItem setTicketId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TICKET_ID</code>. 「ticketId」- 入库单ID
     */
    public String getTicketId();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_NUMBER</code>. 「orderNumber」-
     * 订单编号
     */
    public IPInItem setOrderNumber(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_NUMBER</code>. 「orderNumber」-
     * 订单编号
     */
    public String getOrderNumber();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_SOURCE</code>. 「orderSource」-
     * 源单单号
     */
    public IPInItem setOrderSource(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.ORDER_SOURCE</code>. 「orderSource」-
     * 源单单号
     */
    public String getOrderSource();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.WH_ID</code>. 「whId」- 实际入库仓库
     */
    public IPInItem setWhId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.WH_ID</code>. 「whId」- 实际入库仓库
     */
    public String getWhId();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.NUM_WAIT</code>. 「numWait」- 预计入库
     */
    public IPInItem setNumWait(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.NUM_WAIT</code>. 「numWait」- 预计入库
     */
    public Integer getNumWait();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.NUM</code>. 「num」- 实际入库数量
     */
    public IPInItem setNum(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.NUM</code>. 「num」- 实际入库数量
     */
    public Integer getNum();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TAX_RATE</code>. 「taxRate」- 税率
     */
    public IPInItem setTaxRate(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TAX_RATE</code>. 「taxRate」- 税率
     */
    public BigDecimal getTaxRate();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TAX_AMOUNT</code>. 「taxAmount」- 税额
     */
    public IPInItem setTaxAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TAX_AMOUNT</code>. 「taxAmount」- 税额
     */
    public BigDecimal getTaxAmount();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.TAX_PRICE</code>. 「taxPrice」- 含税单价
     */
    public IPInItem setTaxPrice(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.TAX_PRICE</code>. 「taxPrice」- 含税单价
     */
    public BigDecimal getTaxPrice();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_TOTAL</code>. 「amountTotal」-
     * 税价合计
     */
    public IPInItem setAmountTotal(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_TOTAL</code>. 「amountTotal」-
     * 税价合计
     */
    public BigDecimal getAmountTotal();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_SPLIT</code>. 「amountSplit」-
     * 采购分摊费用
     */
    public IPInItem setAmountSplit(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT_SPLIT</code>. 「amountSplit」-
     * 采购分摊费用
     */
    public BigDecimal getAmountSplit();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT</code>. 「amount」- 采购总价（订单总价）
     */
    public IPInItem setAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.AMOUNT</code>. 「amount」- 采购总价（订单总价）
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.PRICE</code>. 「price」- 采购单价（采购价）
     */
    public IPInItem setPrice(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.PRICE</code>. 「price」- 采购单价（采购价）
     */
    public BigDecimal getPrice();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    public IPInItem setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER_BASIS</code>.
     * 「costPerBasis」- 基本单位成本
     */
    public IPInItem setCostPerBasis(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER_BASIS</code>.
     * 「costPerBasis」- 基本单位成本
     */
    public BigDecimal getCostPerBasis();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER</code>. 「costPer」- 单位成本
     */
    public IPInItem setCostPer(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COST_PER</code>. 「costPer」- 单位成本
     */
    public BigDecimal getCostPer();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.COST_AMOUNT</code>. 「costAmount」-
     * 入库成本
     */
    public IPInItem setCostAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.COST_AMOUNT</code>. 「costAmount」-
     * 入库成本
     */
    public BigDecimal getCostAmount();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    public IPInItem setDiscountAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    public BigDecimal getDiscountAmount();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    public IPInItem setDiscountRate(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    public BigDecimal getDiscountRate();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public IPInItem setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public IPInItem setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    public IPInItem setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IPInItem setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IPInItem setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IPInItem setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IPInItem setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IPInItem setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_IN_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IPInItem
     */
    public void from(IPInItem from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IPInItem
     */
    public <E extends IPInItem> E into(E into);

        @Override
        public default IPInItem fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setSerial,json::getString,"SERIAL","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setCommodityId,json::getString,"COMMODITY_ID","java.lang.String");
                setOrThrow(this::setCommodityCode,json::getString,"COMMODITY_CODE","java.lang.String");
                setOrThrow(this::setCommodityName,json::getString,"COMMODITY_NAME","java.lang.String");
                setOrThrow(this::setCommodityLogo,json::getString,"COMMODITY_LOGO","java.lang.String");
                setOrThrow(this::setCustomerId,json::getString,"CUSTOMER_ID","java.lang.String");
                setOrThrow(this::setFromName,json::getString,"FROM_NAME","java.lang.String");
                setOrThrow(this::setFromCode,json::getString,"FROM_CODE","java.lang.String");
                setOrThrow(this::setTicketId,json::getString,"TICKET_ID","java.lang.String");
                setOrThrow(this::setOrderNumber,json::getString,"ORDER_NUMBER","java.lang.String");
                setOrThrow(this::setOrderSource,json::getString,"ORDER_SOURCE","java.lang.String");
                setOrThrow(this::setWhId,json::getString,"WH_ID","java.lang.String");
                setOrThrow(this::setNumWait,json::getInteger,"NUM_WAIT","java.lang.Integer");
                setOrThrow(this::setNum,json::getInteger,"NUM","java.lang.Integer");
                setOrThrow(this::setTaxRate,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"TAX_RATE","java.math.BigDecimal");
                setOrThrow(this::setTaxAmount,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"TAX_AMOUNT","java.math.BigDecimal");
                setOrThrow(this::setTaxPrice,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"TAX_PRICE","java.math.BigDecimal");
                setOrThrow(this::setAmountTotal,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT_TOTAL","java.math.BigDecimal");
                setOrThrow(this::setAmountSplit,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT_SPLIT","java.math.BigDecimal");
                setOrThrow(this::setAmount,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT","java.math.BigDecimal");
                setOrThrow(this::setPrice,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"PRICE","java.math.BigDecimal");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setCostPerBasis,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"COST_PER_BASIS","java.math.BigDecimal");
                setOrThrow(this::setCostPer,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"COST_PER","java.math.BigDecimal");
                setOrThrow(this::setCostAmount,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"COST_AMOUNT","java.math.BigDecimal");
                setOrThrow(this::setDiscountAmount,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"DISCOUNT_AMOUNT","java.math.BigDecimal");
                setOrThrow(this::setDiscountRate,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"DISCOUNT_RATE","java.math.BigDecimal");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
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
                json.put("SERIAL",getSerial());
                json.put("STATUS",getStatus());
                json.put("COMMODITY_ID",getCommodityId());
                json.put("COMMODITY_CODE",getCommodityCode());
                json.put("COMMODITY_NAME",getCommodityName());
                json.put("COMMODITY_LOGO",getCommodityLogo());
                json.put("CUSTOMER_ID",getCustomerId());
                json.put("FROM_NAME",getFromName());
                json.put("FROM_CODE",getFromCode());
                json.put("TICKET_ID",getTicketId());
                json.put("ORDER_NUMBER",getOrderNumber());
                json.put("ORDER_SOURCE",getOrderSource());
                json.put("WH_ID",getWhId());
                json.put("NUM_WAIT",getNumWait());
                json.put("NUM",getNum());
                json.put("TAX_RATE",getTaxRate()==null?null:getTaxRate().toString());
                json.put("TAX_AMOUNT",getTaxAmount()==null?null:getTaxAmount().toString());
                json.put("TAX_PRICE",getTaxPrice()==null?null:getTaxPrice().toString());
                json.put("AMOUNT_TOTAL",getAmountTotal()==null?null:getAmountTotal().toString());
                json.put("AMOUNT_SPLIT",getAmountSplit()==null?null:getAmountSplit().toString());
                json.put("AMOUNT",getAmount()==null?null:getAmount().toString());
                json.put("PRICE",getPrice()==null?null:getPrice().toString());
                json.put("COMMENT",getComment());
                json.put("COST_PER_BASIS",getCostPerBasis()==null?null:getCostPerBasis().toString());
                json.put("COST_PER",getCostPer()==null?null:getCostPer().toString());
                json.put("COST_AMOUNT",getCostAmount()==null?null:getCostAmount().toString());
                json.put("DISCOUNT_AMOUNT",getDiscountAmount()==null?null:getDiscountAmount().toString());
                json.put("DISCOUNT_RATE",getDiscountRate()==null?null:getDiscountRate().toString());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("METADATA",getMetadata());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
