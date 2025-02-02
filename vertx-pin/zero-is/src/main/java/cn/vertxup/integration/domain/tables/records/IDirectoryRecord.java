/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.records;


import cn.vertxup.integration.domain.tables.IDirectory;
import cn.vertxup.integration.domain.tables.interfaces.IIDirectory;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IDirectoryRecord extends UpdatableRecordImpl<IDirectoryRecord> implements VertxPojo, IIDirectory {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.KEY</code>. 「key」- 目录主键
     */
    @Override
    public IDirectoryRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.KEY</code>. 「key」- 目录主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.NAME</code>. 「name」- 目录名称
     */
    @Override
    public IDirectoryRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.NAME</code>. 「name」- 目录名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.CODE</code>. 「code」- 目录编号
     */
    @Override
    public IDirectoryRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.CODE</code>. 「code」- 目录编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.STORE_PATH</code>. 「storePath」-
     * 目录相对路径
     */
    @Override
    public IDirectoryRecord setStorePath(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.STORE_PATH</code>. 「storePath」-
     * 目录相对路径
     */
    @Override
    public String getStorePath() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.LINKED_PATH</code>. 「linkedPath」-
     * 链接路径，type = LINK 时专用
     */
    @Override
    public IDirectoryRecord setLinkedPath(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.LINKED_PATH</code>. 「linkedPath」-
     * 链接路径，type = LINK 时专用
     */
    @Override
    public String getLinkedPath() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.PARENT_ID</code>. 「parentId」-
     * 父目录ID
     */
    @Override
    public IDirectoryRecord setParentId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.PARENT_ID</code>. 「parentId」-
     * 父目录ID
     */
    @Override
    public String getParentId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.CATEGORY</code>. 「category」-
     * 目录连接的类型树
     */
    @Override
    public IDirectoryRecord setCategory(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.CATEGORY</code>. 「category」-
     * 目录连接的类型树
     */
    @Override
    public String getCategory() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.TYPE</code>. 「type」-
     * 目录类型：INTEGRATION / STORE / LINK
     */
    @Override
    public IDirectoryRecord setType(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.TYPE</code>. 「type」-
     * 目录类型：INTEGRATION / STORE / LINK
     */
    @Override
    public String getType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.OWNER</code>. 「owner」- 目录访问人
     */
    @Override
    public IDirectoryRecord setOwner(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.OWNER</code>. 「owner」- 目录访问人
     */
    @Override
    public String getOwner() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.INTEGRATION_ID</code>.
     * 「integrationId」- 该目录关联的 Integration，不关联则不转存
     */
    @Override
    public IDirectoryRecord setIntegrationId(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.INTEGRATION_ID</code>.
     * 「integrationId」- 该目录关联的 Integration，不关联则不转存
     */
    @Override
    public String getIntegrationId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.RUN_COMPONENT</code>.
     * 「runComponent」- 目录执行组件，抓文件专用
     */
    @Override
    public IDirectoryRecord setRunComponent(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.RUN_COMPONENT</code>.
     * 「runComponent」- 目录执行组件，抓文件专用
     */
    @Override
    public String getRunComponent() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.VISIT</code>. 「visit」- 公有 / 私有
     */
    @Override
    public IDirectoryRecord setVisit(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.VISIT</code>. 「visit」- 公有 / 私有
     */
    @Override
    public Boolean getVisit() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_MODE</code>. 「visitMode」-
     * 目录模式：只读 / 可写，以后扩展为其他
     */
    @Override
    public IDirectoryRecord setVisitMode(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_MODE</code>. 「visitMode」-
     * 目录模式：只读 / 可写，以后扩展为其他
     */
    @Override
    public String getVisitMode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_ROLE</code>. 「visitRole」-
     * 目录访问角色
     */
    @Override
    public IDirectoryRecord setVisitRole(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_ROLE</code>. 「visitRole」-
     * 目录访问角色
     */
    @Override
    public String getVisitRole() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_GROUP</code>. 「visitGroup」-
     * 目录访问组
     */
    @Override
    public IDirectoryRecord setVisitGroup(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_GROUP</code>. 「visitGroup」-
     * 目录访问组
     */
    @Override
    public String getVisitGroup() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_COMPONENT</code>.
     * 「visitComponent」- 目录访问控制专用组件
     */
    @Override
    public IDirectoryRecord setVisitComponent(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_COMPONENT</code>.
     * 「visitComponent」- 目录访问控制专用组件
     */
    @Override
    public String getVisitComponent() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public IDirectoryRecord setSigma(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public IDirectoryRecord setLanguage(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public IDirectoryRecord setActive(Boolean value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public IDirectoryRecord setMetadata(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public IDirectoryRecord setCreatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public IDirectoryRecord setCreatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public IDirectoryRecord setUpdatedAt(LocalDateTime value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public IDirectoryRecord setUpdatedBy(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(23);
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
    public void from(IIDirectory from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setStorePath(from.getStorePath());
        setLinkedPath(from.getLinkedPath());
        setParentId(from.getParentId());
        setCategory(from.getCategory());
        setType(from.getType());
        setOwner(from.getOwner());
        setIntegrationId(from.getIntegrationId());
        setRunComponent(from.getRunComponent());
        setVisit(from.getVisit());
        setVisitMode(from.getVisitMode());
        setVisitRole(from.getVisitRole());
        setVisitGroup(from.getVisitGroup());
        setVisitComponent(from.getVisitComponent());
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
    public <E extends IIDirectory> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IDirectoryRecord
     */
    public IDirectoryRecord() {
        super(IDirectory.I_DIRECTORY);
    }

    /**
     * Create a detached, initialised IDirectoryRecord
     */
    public IDirectoryRecord(String key, String name, String code, String storePath, String linkedPath, String parentId, String category, String type, String owner, String integrationId, String runComponent, Boolean visit, String visitMode, String visitRole, String visitGroup, String visitComponent, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(IDirectory.I_DIRECTORY);

        setKey(key);
        setName(name);
        setCode(code);
        setStorePath(storePath);
        setLinkedPath(linkedPath);
        setParentId(parentId);
        setCategory(category);
        setType(type);
        setOwner(owner);
        setIntegrationId(integrationId);
        setRunComponent(runComponent);
        setVisit(visit);
        setVisitMode(visitMode);
        setVisitRole(visitRole);
        setVisitGroup(visitGroup);
        setVisitComponent(visitComponent);
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
     * Create a detached, initialised IDirectoryRecord
     */
    public IDirectoryRecord(cn.vertxup.integration.domain.tables.pojos.IDirectory value) {
        super(IDirectory.I_DIRECTORY);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setStorePath(value.getStorePath());
            setLinkedPath(value.getLinkedPath());
            setParentId(value.getParentId());
            setCategory(value.getCategory());
            setType(value.getType());
            setOwner(value.getOwner());
            setIntegrationId(value.getIntegrationId());
            setRunComponent(value.getRunComponent());
            setVisit(value.getVisit());
            setVisitMode(value.getVisitMode());
            setVisitRole(value.getVisitRole());
            setVisitGroup(value.getVisitGroup());
            setVisitComponent(value.getVisitComponent());
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

        public IDirectoryRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
