/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.tpl.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IMySetting extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.KEY</code>. 「key」- 个人设置主键
     */
    public IMySetting setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.KEY</code>. 「key」- 个人设置主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_NAV_THEME</code>. 「pNavTheme」-
     * navTheme, 风格处理，对应 light / realdark
     */
    public IMySetting setPNavTheme(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_NAV_THEME</code>. 「pNavTheme」-
     * navTheme, 风格处理，对应 light / realdark
     */
    public String getPNavTheme();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_COLOR_PRIMARY</code>.
     * 「pColorPrimary」- colorPrimary，主色调
     */
    public IMySetting setPColorPrimary(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_COLOR_PRIMARY</code>.
     * 「pColorPrimary」- colorPrimary，主色调
     */
    public String getPColorPrimary();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_LAYOUT</code>. 「pLayout」-
     * 布局类型：top, menu, mix
     */
    public IMySetting setPLayout(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_LAYOUT</code>. 「pLayout」-
     * 布局类型：top, menu, mix
     */
    public String getPLayout();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_CONTENT_WIDTH</code>.
     * 「pContentWidth」- 两种
     */
    public IMySetting setPContentWidth(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_CONTENT_WIDTH</code>.
     * 「pContentWidth」- 两种
     */
    public String getPContentWidth();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_FIXED_HEADER</code>.
     * 「pFixedHeader」- 标题控制
     */
    public IMySetting setPFixedHeader(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_FIXED_HEADER</code>.
     * 「pFixedHeader」- 标题控制
     */
    public Boolean getPFixedHeader();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_FIX_SIDER_BAR</code>.
     * 「pFixSiderBar」- 侧边栏控制
     */
    public IMySetting setPFixSiderBar(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_FIX_SIDER_BAR</code>.
     * 「pFixSiderBar」- 侧边栏控制
     */
    public Boolean getPFixSiderBar();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_COLOR_WEAK</code>. 「pColorWeak」-
     * 色彩控制
     */
    public IMySetting setPColorWeak(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_COLOR_WEAK</code>. 「pColorWeak」-
     * 色彩控制
     */
    public Boolean getPColorWeak();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_PWA</code>. 「pPwa」- pwa属性，暂时未知
     */
    public IMySetting setPPwa(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_PWA</code>. 「pPwa」- pwa属性，暂时未知
     */
    public Boolean getPPwa();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_TOKEN</code>. 「pToken」-
     * 保留（后续可能会使用）
     */
    public IMySetting setPToken(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_TOKEN</code>. 「pToken」-
     * 保留（后续可能会使用）
     */
    public String getPToken();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.MY_BAG</code>. 「myBag」- 对应 MY_BAG
     * 设置，每个BAG有对应设置信息
     */
    public IMySetting setMyBag(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.MY_BAG</code>. 「myBag」- 对应 MY_BAG
     * 设置，每个BAG有对应设置信息
     */
    public String getMyBag();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.OWNER</code>. 「owner」- 拥有者ID，我的 /
     * 角色级
     */
    public IMySetting setOwner(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.OWNER</code>. 「owner」- 拥有者ID，我的 /
     * 角色级
     */
    public String getOwner();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.OWNER_TYPE</code>. 「ownerType」-
     * ROLE 角色，USER 用户
     */
    public IMySetting setOwnerType(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.OWNER_TYPE</code>. 「ownerType」-
     * ROLE 角色，USER 用户
     */
    public String getOwnerType();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.TYPE</code>. 「type」- 类型（默认全站）
     */
    public IMySetting setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.TYPE</code>. 「type」- 类型（默认全站）
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.ACTIVE</code>. 「active」- 是否启用
     */
    public IMySetting setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.SIGMA</code>. 「sigma」- 统一标识
     */
    public IMySetting setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.METADATA</code>. 「metadata」- 附加配置
     */
    public IMySetting setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IMySetting setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IMySetting setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public IMySetting setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IMySetting setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public IMySetting setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IMySetting
     */
    public void from(IMySetting from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IMySetting
     */
    public <E extends IMySetting> E into(E into);

        @Override
        public default IMySetting fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setPNavTheme,json::getString,"P_NAV_THEME","java.lang.String");
                setOrThrow(this::setPColorPrimary,json::getString,"P_COLOR_PRIMARY","java.lang.String");
                setOrThrow(this::setPLayout,json::getString,"P_LAYOUT","java.lang.String");
                setOrThrow(this::setPContentWidth,json::getString,"P_CONTENT_WIDTH","java.lang.String");
                setOrThrow(this::setPFixedHeader,json::getBoolean,"P_FIXED_HEADER","java.lang.Boolean");
                setOrThrow(this::setPFixSiderBar,json::getBoolean,"P_FIX_SIDER_BAR","java.lang.Boolean");
                setOrThrow(this::setPColorWeak,json::getBoolean,"P_COLOR_WEAK","java.lang.Boolean");
                setOrThrow(this::setPPwa,json::getBoolean,"P_PWA","java.lang.Boolean");
                setOrThrow(this::setPToken,json::getString,"P_TOKEN","java.lang.String");
                setOrThrow(this::setMyBag,json::getString,"MY_BAG","java.lang.String");
                setOrThrow(this::setOwner,json::getString,"OWNER","java.lang.String");
                setOrThrow(this::setOwnerType,json::getString,"OWNER_TYPE","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
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
                json.put("P_NAV_THEME",getPNavTheme());
                json.put("P_COLOR_PRIMARY",getPColorPrimary());
                json.put("P_LAYOUT",getPLayout());
                json.put("P_CONTENT_WIDTH",getPContentWidth());
                json.put("P_FIXED_HEADER",getPFixedHeader());
                json.put("P_FIX_SIDER_BAR",getPFixSiderBar());
                json.put("P_COLOR_WEAK",getPColorWeak());
                json.put("P_PWA",getPPwa());
                json.put("P_TOKEN",getPToken());
                json.put("MY_BAG",getMyBag());
                json.put("OWNER",getOwner());
                json.put("OWNER_TYPE",getOwnerType());
                json.put("TYPE",getType());
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
