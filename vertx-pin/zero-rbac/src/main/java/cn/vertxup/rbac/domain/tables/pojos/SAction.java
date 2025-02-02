/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.pojos;


import cn.vertxup.rbac.domain.tables.interfaces.ISAction;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SAction implements VertxPojo, ISAction {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String resourceId;
    private String permissionId;
    private Integer level;
    private String uri;
    private String method;
    private String sigma;
    private String renewalCredit;
    private String language;
    private Boolean active;
    private String metadata;
    private String comment;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public SAction() {}

    public SAction(ISAction value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.resourceId = value.getResourceId();
        this.permissionId = value.getPermissionId();
        this.level = value.getLevel();
        this.uri = value.getUri();
        this.method = value.getMethod();
        this.sigma = value.getSigma();
        this.renewalCredit = value.getRenewalCredit();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.comment = value.getComment();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public SAction(
        String key,
        String name,
        String code,
        String resourceId,
        String permissionId,
        Integer level,
        String uri,
        String method,
        String sigma,
        String renewalCredit,
        String language,
        Boolean active,
        String metadata,
        String comment,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.resourceId = resourceId;
        this.permissionId = permissionId;
        this.level = level;
        this.uri = uri;
        this.method = method;
        this.sigma = sigma;
        this.renewalCredit = renewalCredit;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.comment = comment;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public SAction(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.KEY</code>. 「key」- 操作ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.KEY</code>. 「key」- 操作ID
     */
    @Override
    public SAction setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.NAME</code>. 「name」- 操作名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.NAME</code>. 「name」- 操作名称
     */
    @Override
    public SAction setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.CODE</code>. 「code」- 操作码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.CODE</code>. 「code」- 操作码
     */
    @Override
    public SAction setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.RESOURCE_ID</code>. 「resourceId」-
     * 操作关联资源ID
     */
    @Override
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.RESOURCE_ID</code>. 「resourceId」-
     * 操作关联资源ID
     */
    @Override
    public SAction setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.PERMISSION_ID</code>.
     * 「permissionId」- 操作所属权限
     */
    @Override
    public String getPermissionId() {
        return this.permissionId;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.PERMISSION_ID</code>.
     * 「permissionId」- 操作所属权限
     */
    @Override
    public SAction setPermissionId(String permissionId) {
        this.permissionId = permissionId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.LEVEL</code>. 「level」- 操作级别, ACL控制
     */
    @Override
    public Integer getLevel() {
        return this.level;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.LEVEL</code>. 「level」- 操作级别, ACL控制
     */
    @Override
    public SAction setLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.URI</code>. 「uri」- 资源地址
     */
    @Override
    public String getUri() {
        return this.uri;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.URI</code>. 「uri」- 资源地址
     */
    @Override
    public SAction setUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.METHOD</code>. 「method」- 资源方法
     */
    @Override
    public String getMethod() {
        return this.method;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.METHOD</code>. 「method」- 资源方法
     */
    @Override
    public SAction setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public SAction setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.RENEWAL_CREDIT</code>.
     * 「renewalCredit」- 被刷新的凭证
     */
    @Override
    public String getRenewalCredit() {
        return this.renewalCredit;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.RENEWAL_CREDIT</code>.
     * 「renewalCredit」- 被刷新的凭证
     */
    @Override
    public SAction setRenewalCredit(String renewalCredit) {
        this.renewalCredit = renewalCredit;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public SAction setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public SAction setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public SAction setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.COMMENT</code>. 「action」- 操作说明
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.COMMENT</code>. 「action」- 操作说明
     */
    @Override
    public SAction setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public SAction setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public SAction setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public SAction setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ACTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ACTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public SAction setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SAction other = (SAction) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.code == null) {
            if (other.code != null)
                return false;
        }
        else if (!this.code.equals(other.code))
            return false;
        if (this.resourceId == null) {
            if (other.resourceId != null)
                return false;
        }
        else if (!this.resourceId.equals(other.resourceId))
            return false;
        if (this.permissionId == null) {
            if (other.permissionId != null)
                return false;
        }
        else if (!this.permissionId.equals(other.permissionId))
            return false;
        if (this.level == null) {
            if (other.level != null)
                return false;
        }
        else if (!this.level.equals(other.level))
            return false;
        if (this.uri == null) {
            if (other.uri != null)
                return false;
        }
        else if (!this.uri.equals(other.uri))
            return false;
        if (this.method == null) {
            if (other.method != null)
                return false;
        }
        else if (!this.method.equals(other.method))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.renewalCredit == null) {
            if (other.renewalCredit != null)
                return false;
        }
        else if (!this.renewalCredit.equals(other.renewalCredit))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        }
        else if (!this.language.equals(other.language))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!this.updatedBy.equals(other.updatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.resourceId == null) ? 0 : this.resourceId.hashCode());
        result = prime * result + ((this.permissionId == null) ? 0 : this.permissionId.hashCode());
        result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
        result = prime * result + ((this.uri == null) ? 0 : this.uri.hashCode());
        result = prime * result + ((this.method == null) ? 0 : this.method.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.renewalCredit == null) ? 0 : this.renewalCredit.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SAction (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(resourceId);
        sb.append(", ").append(permissionId);
        sb.append(", ").append(level);
        sb.append(", ").append(uri);
        sb.append(", ").append(method);
        sb.append(", ").append(sigma);
        sb.append(", ").append(renewalCredit);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
        sb.append(", ").append(comment);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISAction from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setResourceId(from.getResourceId());
        setPermissionId(from.getPermissionId());
        setLevel(from.getLevel());
        setUri(from.getUri());
        setMethod(from.getMethod());
        setSigma(from.getSigma());
        setRenewalCredit(from.getRenewalCredit());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setComment(from.getComment());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends ISAction> E into(E into) {
        into.from(this);
        return into;
    }
}
