/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.jet.domain.tables.pojos;


import cn.vertxup.jet.domain.tables.interfaces.IIJob;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;
import java.time.LocalTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IJob implements VertxPojo, IIJob {

    private static final long serialVersionUID = 1L;

    private String key;
    private String namespace;
    private String name;
    private String code;
    private String group;
    private String comment;
    private String additional;
    private String proxy;
    private Integer threshold;
    private String type;
    private LocalTime runAt;
    private String runFormula;
    private Long duration;
    private String durationComponent;
    private String durationConfig;
    private String incomeComponent;
    private String incomeAddress;
    private String outcomeComponent;
    private String outcomeAddress;
    private String serviceId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public IJob() {}

    public IJob(IIJob value) {
        this.key = value.getKey();
        this.namespace = value.getNamespace();
        this.name = value.getName();
        this.code = value.getCode();
        this.group = value.getGroup();
        this.comment = value.getComment();
        this.additional = value.getAdditional();
        this.proxy = value.getProxy();
        this.threshold = value.getThreshold();
        this.type = value.getType();
        this.runAt = value.getRunAt();
        this.runFormula = value.getRunFormula();
        this.duration = value.getDuration();
        this.durationComponent = value.getDurationComponent();
        this.durationConfig = value.getDurationConfig();
        this.incomeComponent = value.getIncomeComponent();
        this.incomeAddress = value.getIncomeAddress();
        this.outcomeComponent = value.getOutcomeComponent();
        this.outcomeAddress = value.getOutcomeAddress();
        this.serviceId = value.getServiceId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public IJob(
        String key,
        String namespace,
        String name,
        String code,
        String group,
        String comment,
        String additional,
        String proxy,
        Integer threshold,
        String type,
        LocalTime runAt,
        String runFormula,
        Long duration,
        String durationComponent,
        String durationConfig,
        String incomeComponent,
        String incomeAddress,
        String outcomeComponent,
        String outcomeAddress,
        String serviceId,
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
        this.namespace = namespace;
        this.name = name;
        this.code = code;
        this.group = group;
        this.comment = comment;
        this.additional = additional;
        this.proxy = proxy;
        this.threshold = threshold;
        this.type = type;
        this.runAt = runAt;
        this.runFormula = runFormula;
        this.duration = duration;
        this.durationComponent = durationComponent;
        this.durationConfig = durationConfig;
        this.incomeComponent = incomeComponent;
        this.incomeAddress = incomeAddress;
        this.outcomeComponent = outcomeComponent;
        this.outcomeAddress = outcomeAddress;
        this.serviceId = serviceId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public IJob(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.KEY</code>. 「key」- 任务ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.KEY</code>. 「key」- 任务ID
     */
    @Override
    public IJob setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.NAMESPACE</code>. 「namespace」- 任务所在名空间
     */
    @Override
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.NAMESPACE</code>. 「namespace」- 任务所在名空间
     */
    @Override
    public IJob setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.NAME</code>. 「name」- 任务名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.NAME</code>. 「name」- 任务名称
     */
    @Override
    public IJob setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.CODE</code>. 「comment」- 任务编码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.CODE</code>. 「comment」- 任务编码
     */
    @Override
    public IJob setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.GROUP</code>. 「group」- 任务组（按组查询），自由字符串
     */
    @Override
    public String getGroup() {
        return this.group;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.GROUP</code>. 「group」- 任务组（按组查询），自由字符串
     */
    @Override
    public IJob setGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public IJob setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.ADDITIONAL</code>. 「additional」- 额外配置信息
     */
    @Override
    public String getAdditional() {
        return this.additional;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.ADDITIONAL</code>. 「additional」- 额外配置信息
     */
    @Override
    public IJob setAdditional(String additional) {
        this.additional = additional;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.PROXY</code>. 「proxy」- 代理类，带有@On/@Off
     */
    @Override
    public String getProxy() {
        return this.proxy;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.PROXY</code>. 「proxy」- 代理类，带有@On/@Off
     */
    @Override
    public IJob setProxy(String proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.THRESHOLD</code>. 「threshold」- 默认值 300
     * s，（秒为单位）
     */
    @Override
    public Integer getThreshold() {
        return this.threshold;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.THRESHOLD</code>. 「threshold」- 默认值 300
     * s，（秒为单位）
     */
    @Override
    public IJob setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.TYPE</code>. 「type」- 任务类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.TYPE</code>. 「type」- 任务类型
     */
    @Override
    public IJob setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.RUN_AT</code>. 「runAt」- 定时任务中的JOB时间
     */
    @Override
    public LocalTime getRunAt() {
        return this.runAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.RUN_AT</code>. 「runAt」- 定时任务中的JOB时间
     */
    @Override
    public IJob setRunAt(LocalTime runAt) {
        this.runAt = runAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.RUN_FORMULA</code>. 「runFormula」-
     * 运行周期专用的表达式
     */
    @Override
    public String getRunFormula() {
        return this.runFormula;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.RUN_FORMULA</code>. 「runFormula」-
     * 运行周期专用的表达式
     */
    @Override
    public IJob setRunFormula(String runFormula) {
        this.runFormula = runFormula;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.DURATION</code>. 「duration」-
     * JOB的间隔时间，（秒为单位）
     */
    @Override
    public Long getDuration() {
        return this.duration;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.DURATION</code>. 「duration」-
     * JOB的间隔时间，（秒为单位）
     */
    @Override
    public IJob setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.DURATION_COMPONENT</code>.
     * 「durationComponent」对应复杂调度问题
     */
    @Override
    public String getDurationComponent() {
        return this.durationComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.DURATION_COMPONENT</code>.
     * 「durationComponent」对应复杂调度问题
     */
    @Override
    public IJob setDurationComponent(String durationComponent) {
        this.durationComponent = durationComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.DURATION_CONFIG</code>.
     * 「durationConfig」复杂调度配置
     */
    @Override
    public String getDurationConfig() {
        return this.durationConfig;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.DURATION_CONFIG</code>.
     * 「durationConfig」复杂调度配置
     */
    @Override
    public IJob setDurationConfig(String durationConfig) {
        this.durationConfig = durationConfig;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.INCOME_COMPONENT</code>.
     * 「incomeComponent」对应income，必须是JobIncome，@On -&gt; input
     */
    @Override
    public String getIncomeComponent() {
        return this.incomeComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.INCOME_COMPONENT</code>.
     * 「incomeComponent」对应income，必须是JobIncome，@On -&gt; input
     */
    @Override
    public IJob setIncomeComponent(String incomeComponent) {
        this.incomeComponent = incomeComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.INCOME_ADDRESS</code>.
     * 「incomeAddress」对应incomeAddress，字符串，@On -&gt; address
     */
    @Override
    public String getIncomeAddress() {
        return this.incomeAddress;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.INCOME_ADDRESS</code>.
     * 「incomeAddress」对应incomeAddress，字符串，@On -&gt; address
     */
    @Override
    public IJob setIncomeAddress(String incomeAddress) {
        this.incomeAddress = incomeAddress;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.OUTCOME_COMPONENT</code>.
     * 「outcomeComponent」对应outcome，必须是JobOutcome，@Off -&gt; outcome
     */
    @Override
    public String getOutcomeComponent() {
        return this.outcomeComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.OUTCOME_COMPONENT</code>.
     * 「outcomeComponent」对应outcome，必须是JobOutcome，@Off -&gt; outcome
     */
    @Override
    public IJob setOutcomeComponent(String outcomeComponent) {
        this.outcomeComponent = outcomeComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.OUTCOME_ADDRESS</code>.
     * 「outcomeAddress」对应outcomeAddress，字符串，@Off -&gt; address
     */
    @Override
    public String getOutcomeAddress() {
        return this.outcomeAddress;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.OUTCOME_ADDRESS</code>.
     * 「outcomeAddress」对应outcomeAddress，字符串，@Off -&gt; address
     */
    @Override
    public IJob setOutcomeAddress(String outcomeAddress) {
        this.outcomeAddress = outcomeAddress;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.SERVICE_ID</code>. 「serviceId」- 关联的服务ID
     */
    @Override
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.SERVICE_ID</code>. 「serviceId」- 关联的服务ID
     */
    @Override
    public IJob setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public IJob setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public IJob setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public IJob setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public IJob setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public IJob setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public IJob setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public IJob setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_JOB.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.I_JOB.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public IJob setUpdatedBy(String updatedBy) {
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
        final IJob other = (IJob) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.namespace == null) {
            if (other.namespace != null)
                return false;
        }
        else if (!this.namespace.equals(other.namespace))
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
        if (this.group == null) {
            if (other.group != null)
                return false;
        }
        else if (!this.group.equals(other.group))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.additional == null) {
            if (other.additional != null)
                return false;
        }
        else if (!this.additional.equals(other.additional))
            return false;
        if (this.proxy == null) {
            if (other.proxy != null)
                return false;
        }
        else if (!this.proxy.equals(other.proxy))
            return false;
        if (this.threshold == null) {
            if (other.threshold != null)
                return false;
        }
        else if (!this.threshold.equals(other.threshold))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        if (this.runAt == null) {
            if (other.runAt != null)
                return false;
        }
        else if (!this.runAt.equals(other.runAt))
            return false;
        if (this.runFormula == null) {
            if (other.runFormula != null)
                return false;
        }
        else if (!this.runFormula.equals(other.runFormula))
            return false;
        if (this.duration == null) {
            if (other.duration != null)
                return false;
        }
        else if (!this.duration.equals(other.duration))
            return false;
        if (this.durationComponent == null) {
            if (other.durationComponent != null)
                return false;
        }
        else if (!this.durationComponent.equals(other.durationComponent))
            return false;
        if (this.durationConfig == null) {
            if (other.durationConfig != null)
                return false;
        }
        else if (!this.durationConfig.equals(other.durationConfig))
            return false;
        if (this.incomeComponent == null) {
            if (other.incomeComponent != null)
                return false;
        }
        else if (!this.incomeComponent.equals(other.incomeComponent))
            return false;
        if (this.incomeAddress == null) {
            if (other.incomeAddress != null)
                return false;
        }
        else if (!this.incomeAddress.equals(other.incomeAddress))
            return false;
        if (this.outcomeComponent == null) {
            if (other.outcomeComponent != null)
                return false;
        }
        else if (!this.outcomeComponent.equals(other.outcomeComponent))
            return false;
        if (this.outcomeAddress == null) {
            if (other.outcomeAddress != null)
                return false;
        }
        else if (!this.outcomeAddress.equals(other.outcomeAddress))
            return false;
        if (this.serviceId == null) {
            if (other.serviceId != null)
                return false;
        }
        else if (!this.serviceId.equals(other.serviceId))
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
        result = prime * result + ((this.namespace == null) ? 0 : this.namespace.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.group == null) ? 0 : this.group.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.additional == null) ? 0 : this.additional.hashCode());
        result = prime * result + ((this.proxy == null) ? 0 : this.proxy.hashCode());
        result = prime * result + ((this.threshold == null) ? 0 : this.threshold.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.runAt == null) ? 0 : this.runAt.hashCode());
        result = prime * result + ((this.runFormula == null) ? 0 : this.runFormula.hashCode());
        result = prime * result + ((this.duration == null) ? 0 : this.duration.hashCode());
        result = prime * result + ((this.durationComponent == null) ? 0 : this.durationComponent.hashCode());
        result = prime * result + ((this.durationConfig == null) ? 0 : this.durationConfig.hashCode());
        result = prime * result + ((this.incomeComponent == null) ? 0 : this.incomeComponent.hashCode());
        result = prime * result + ((this.incomeAddress == null) ? 0 : this.incomeAddress.hashCode());
        result = prime * result + ((this.outcomeComponent == null) ? 0 : this.outcomeComponent.hashCode());
        result = prime * result + ((this.outcomeAddress == null) ? 0 : this.outcomeAddress.hashCode());
        result = prime * result + ((this.serviceId == null) ? 0 : this.serviceId.hashCode());
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
        StringBuilder sb = new StringBuilder("IJob (");

        sb.append(key);
        sb.append(", ").append(namespace);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(group);
        sb.append(", ").append(comment);
        sb.append(", ").append(additional);
        sb.append(", ").append(proxy);
        sb.append(", ").append(threshold);
        sb.append(", ").append(type);
        sb.append(", ").append(runAt);
        sb.append(", ").append(runFormula);
        sb.append(", ").append(duration);
        sb.append(", ").append(durationComponent);
        sb.append(", ").append(durationConfig);
        sb.append(", ").append(incomeComponent);
        sb.append(", ").append(incomeAddress);
        sb.append(", ").append(outcomeComponent);
        sb.append(", ").append(outcomeAddress);
        sb.append(", ").append(serviceId);
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
    public void from(IIJob from) {
        setKey(from.getKey());
        setNamespace(from.getNamespace());
        setName(from.getName());
        setCode(from.getCode());
        setGroup(from.getGroup());
        setComment(from.getComment());
        setAdditional(from.getAdditional());
        setProxy(from.getProxy());
        setThreshold(from.getThreshold());
        setType(from.getType());
        setRunAt(from.getRunAt());
        setRunFormula(from.getRunFormula());
        setDuration(from.getDuration());
        setDurationComponent(from.getDurationComponent());
        setDurationConfig(from.getDurationConfig());
        setIncomeComponent(from.getIncomeComponent());
        setIncomeAddress(from.getIncomeAddress());
        setOutcomeComponent(from.getOutcomeComponent());
        setOutcomeAddress(from.getOutcomeAddress());
        setServiceId(from.getServiceId());
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
    public <E extends IIJob> E into(E into) {
        into.from(this);
        return into;
    }
}
