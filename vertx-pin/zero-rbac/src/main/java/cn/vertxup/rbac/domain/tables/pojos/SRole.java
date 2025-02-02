/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.pojos;


import cn.vertxup.rbac.domain.tables.interfaces.ISRole;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SRole implements VertxPojo, ISRole {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private Boolean power;
    private String comment;
    private String modelId;
    private String modelKey;
    private String category;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public SRole() {}

    public SRole(ISRole value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.power = value.getPower();
        this.comment = value.getComment();
        this.modelId = value.getModelId();
        this.modelKey = value.getModelKey();
        this.category = value.getCategory();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public SRole(
        String key,
        String name,
        String code,
        Boolean power,
        String comment,
        String modelId,
        String modelKey,
        String category,
        String sigma,
        String language,
        Boolean active,
        String metadata,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.power = power;
        this.comment = comment;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.category = category;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public SRole(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.KEY</code>. 「key」- 角色ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.KEY</code>. 「key」- 角色ID
     */
    @Override
    public SRole setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.NAME</code>. 「name」- 角色名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.NAME</code>. 「name」- 角色名称
     */
    @Override
    public SRole setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.CODE</code>. 「code」- 角色系统名
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.CODE</code>. 「code」- 角色系统名
     */
    @Override
    public SRole setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.POWER</code>. 「power」- 是否具有定制权限？
     */
    @Override
    public Boolean getPower() {
        return this.power;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.POWER</code>. 「power」- 是否具有定制权限？
     */
    @Override
    public SRole setPower(Boolean power) {
        this.power = power;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.COMMENT</code>. 「comment」- 角色备注信息
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.COMMENT</code>. 「comment」- 角色备注信息
     */
    @Override
    public SRole setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.MODEL_ID</code>. 「modelId」-
     * 组所关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.MODEL_ID</code>. 「modelId」-
     * 组所关联的模型identifier，用于描述
     */
    @Override
    public SRole setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.MODEL_KEY</code>. 「modelKey」-
     * 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.MODEL_KEY</code>. 「modelKey」-
     * 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public SRole setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.CATEGORY</code>. 「category」- 组类型
     */
    @Override
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.CATEGORY</code>. 「category」- 组类型
     */
    @Override
    public SRole setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public SRole setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public SRole setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public SRole setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public SRole setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public SRole setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public SRole setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public SRole setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_ROLE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.S_ROLE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public SRole setUpdatedBy(String updatedBy) {
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
        final SRole other = (SRole) obj;
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
        if (this.power == null) {
            if (other.power != null)
                return false;
        }
        else if (!this.power.equals(other.power))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.modelId == null) {
            if (other.modelId != null)
                return false;
        }
        else if (!this.modelId.equals(other.modelId))
            return false;
        if (this.modelKey == null) {
            if (other.modelKey != null)
                return false;
        }
        else if (!this.modelKey.equals(other.modelKey))
            return false;
        if (this.category == null) {
            if (other.category != null)
                return false;
        }
        else if (!this.category.equals(other.category))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
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
        result = prime * result + ((this.power == null) ? 0 : this.power.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.modelId == null) ? 0 : this.modelId.hashCode());
        result = prime * result + ((this.modelKey == null) ? 0 : this.modelKey.hashCode());
        result = prime * result + ((this.category == null) ? 0 : this.category.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SRole (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(power);
        sb.append(", ").append(comment);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
        sb.append(", ").append(category);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
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
    public void from(ISRole from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setPower(from.getPower());
        setComment(from.getComment());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setCategory(from.getCategory());
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
    public <E extends ISRole> E into(E into) {
        into.from(this);
        return into;
    }
}
