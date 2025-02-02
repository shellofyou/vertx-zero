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
public interface IPCommodityHis extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.KEY</code>. 「key」- 产品变更记录主键
     */
    public IPCommodityHis setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.KEY</code>. 「key」- 产品变更记录主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.CODE</code>. 「code」-
     * 产品变更编号（系统可用）
     */
    public IPCommodityHis setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.CODE</code>. 「code」-
     * 产品变更编号（系统可用）
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.TYPE</code>. 「type」-
     * 产品变更类型：IN/OUT，出入
     */
    public IPCommodityHis setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.TYPE</code>. 「type」-
     * 产品变更类型：IN/OUT，出入
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.COMMODITY_ID</code>.
     * 「commodityId」- 产品ID
     */
    public IPCommodityHis setCommodityId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.COMMODITY_ID</code>.
     * 「commodityId」- 产品ID
     */
    public String getCommodityId();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.NUM_FROM</code>. 「numFrom」-
     * 之前数量
     */
    public IPCommodityHis setNumFrom(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.NUM_FROM</code>. 「numFrom」-
     * 之前数量
     */
    public Integer getNumFrom();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.NUM_TO</code>. 「numTo」- 之后数量
     */
    public IPCommodityHis setNumTo(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.NUM_TO</code>. 「numTo」- 之后数量
     */
    public Integer getNumTo();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.AMOUNT_FROM</code>.
     * 「amountFrom」- 之前平均价格
     */
    public IPCommodityHis setAmountFrom(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.AMOUNT_FROM</code>.
     * 「amountFrom」- 之前平均价格
     */
    public BigDecimal getAmountFrom();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.AMOUNT_TO</code>. 「amountTo」-
     * 之后平均价格
     */
    public IPCommodityHis setAmountTo(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.AMOUNT_TO</code>. 「amountTo」-
     * 之后平均价格
     */
    public BigDecimal getAmountTo();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.ITEM_ID</code>. 「itemId」-
     * 入库/出库明细ID
     */
    public IPCommodityHis setItemId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.ITEM_ID</code>. 「itemId」-
     * 入库/出库明细ID
     */
    public String getItemId();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.ACTIVE</code>. 「active」- 是否启用
     */
    public IPCommodityHis setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.SIGMA</code>. 「sigma」- 统一标识
     */
    public IPCommodityHis setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.METADATA</code>. 「metadata」-
     * 附加配置
     */
    public IPCommodityHis setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.METADATA</code>. 「metadata」-
     * 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public IPCommodityHis setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    public IPCommodityHis setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    public IPCommodityHis setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    public IPCommodityHis setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.P_COMMODITY_HIS.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    public IPCommodityHis setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_COMMODITY_HIS.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IPCommodityHis
     */
    public void from(IPCommodityHis from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IPCommodityHis
     */
    public <E extends IPCommodityHis> E into(E into);

        @Override
        public default IPCommodityHis fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setCommodityId,json::getString,"COMMODITY_ID","java.lang.String");
                setOrThrow(this::setNumFrom,json::getInteger,"NUM_FROM","java.lang.Integer");
                setOrThrow(this::setNumTo,json::getInteger,"NUM_TO","java.lang.Integer");
                setOrThrow(this::setAmountFrom,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT_FROM","java.math.BigDecimal");
                setOrThrow(this::setAmountTo,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT_TO","java.math.BigDecimal");
                setOrThrow(this::setItemId,json::getString,"ITEM_ID","java.lang.String");
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
                json.put("CODE",getCode());
                json.put("TYPE",getType());
                json.put("COMMODITY_ID",getCommodityId());
                json.put("NUM_FROM",getNumFrom());
                json.put("NUM_TO",getNumTo());
                json.put("AMOUNT_FROM",getAmountFrom()==null?null:getAmountFrom().toString());
                json.put("AMOUNT_TO",getAmountTo()==null?null:getAmountTo().toString());
                json.put("ITEM_ID",getItemId());
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
