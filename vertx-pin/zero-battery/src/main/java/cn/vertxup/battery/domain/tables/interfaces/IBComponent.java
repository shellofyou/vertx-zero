/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IBComponent extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.KEY</code>. 「key」- 主键
     */
    public IBComponent setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.KEY</code>. 「key」- 主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.BLOCK_ID</code>. 「blockId」-
     * 所属模块ID
     */
    public IBComponent setBlockId(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.BLOCK_ID</code>. 「blockId」-
     * 所属模块ID
     */
    public String getBlockId();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.TYPE</code>. 「type」- 类型保留，单独区分
     */
    public IBComponent setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.TYPE</code>. 「type」- 类型保留，单独区分
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.MAVEN_AID</code>. 「mavenAid」-
     * 所在项目ID
     */
    public IBComponent setMavenAid(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.MAVEN_AID</code>. 「mavenAid」-
     * 所在项目ID
     */
    public String getMavenAid();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.MAVEN_GID</code>. 「mavenGid」-
     * 所在Group的ID
     */
    public IBComponent setMavenGid(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.MAVEN_GID</code>. 「mavenGid」-
     * 所在Group的ID
     */
    public String getMavenGid();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.SPEC_INTERFACE</code>.
     * 「specInterface」- 接口名称
     */
    public IBComponent setSpecInterface(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.SPEC_INTERFACE</code>.
     * 「specInterface」- 接口名称
     */
    public String getSpecInterface();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.SPEC_IMPL</code>. 「specImpl」-
     * 实现组件
     */
    public IBComponent setSpecImpl(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.SPEC_IMPL</code>. 「specImpl」-
     * 实现组件
     */
    public String getSpecImpl();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.INTEGRATED</code>. 「integrated」-
     * 是否用于外部集成
     */
    public IBComponent setIntegrated(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.INTEGRATED</code>. 「integrated」-
     * 是否用于外部集成
     */
    public Boolean getIntegrated();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.ACTIVE</code>. 「active」- 是否启用
     */
    public IBComponent setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.SIGMA</code>. 「sigma」- 统一标识
     */
    public IBComponent setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.METADATA</code>. 「metadata」- 附加配置
     */
    public IBComponent setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.B_COMPONENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public IBComponent setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_COMPONENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public String getLanguage();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IBComponent
     */
    public void from(IBComponent from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IBComponent
     */
    public <E extends IBComponent> E into(E into);

        @Override
        public default IBComponent fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setBlockId,json::getString,"BLOCK_ID","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setMavenAid,json::getString,"MAVEN_AID","java.lang.String");
                setOrThrow(this::setMavenGid,json::getString,"MAVEN_GID","java.lang.String");
                setOrThrow(this::setSpecInterface,json::getString,"SPEC_INTERFACE","java.lang.String");
                setOrThrow(this::setSpecImpl,json::getString,"SPEC_IMPL","java.lang.String");
                setOrThrow(this::setIntegrated,json::getBoolean,"INTEGRATED","java.lang.Boolean");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("BLOCK_ID",getBlockId());
                json.put("TYPE",getType());
                json.put("MAVEN_AID",getMavenAid());
                json.put("MAVEN_GID",getMavenGid());
                json.put("SPEC_INTERFACE",getSpecInterface());
                json.put("SPEC_IMPL",getSpecImpl());
                json.put("INTEGRATED",getIntegrated());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("METADATA",getMetadata());
                json.put("LANGUAGE",getLanguage());
                return json;
        }

}
