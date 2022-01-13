/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.pojos;


import cn.vertxup.ui.domain.tables.interfaces.IUiVisitor;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UiVisitor implements VertxPojo, IUiVisitor {

    private static final long serialVersionUID = 1L;

    private String identifier;
    private String page;
    private String path;
    private String controlId;
    private String resourceId;
    private String sigma;
    private String metadata;
    private String runComponent;

    public UiVisitor() {}

    public UiVisitor(IUiVisitor value) {
        this.identifier = value.getIdentifier();
        this.page = value.getPage();
        this.path = value.getPath();
        this.controlId = value.getControlId();
        this.resourceId = value.getResourceId();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.runComponent = value.getRunComponent();
    }

    public UiVisitor(
        String identifier,
        String page,
        String path,
        String controlId,
        String resourceId,
        String sigma,
        String metadata,
        String runComponent
    ) {
        this.identifier = identifier;
        this.page = page;
        this.path = path;
        this.controlId = controlId;
        this.resourceId = resourceId;
        this.sigma = sigma;
        this.metadata = metadata;
        this.runComponent = runComponent;
    }

        public UiVisitor(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.UI_VISITOR.IDENTIFIER</code>. 「identifier」-
     * 维度1：标识模型
     */
    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_VISITOR.IDENTIFIER</code>. 「identifier」-
     * 维度1：标识模型
     */
    @Override
    public UiVisitor setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_VISITOR.PAGE</code>. 「page」- 维度2：页面ID
     */
    @Override
    public String getPage() {
        return this.page;
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_VISITOR.PAGE</code>. 「page」- 维度2：页面ID
     */
    @Override
    public UiVisitor setPage(String page) {
        this.page = page;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_VISITOR.PATH</code>. 「path」- 维度3：路径信息，view
     * + position
     */
    @Override
    public String getPath() {
        return this.path;
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_VISITOR.PATH</code>. 「path」- 维度3：路径信息，view
     * + position
     */
    @Override
    public UiVisitor setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_VISITOR.CONTROL_ID</code>. 「controlId」-
     * 挂载专用的ID：List / Form 都可用
     */
    @Override
    public String getControlId() {
        return this.controlId;
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_VISITOR.CONTROL_ID</code>. 「controlId」-
     * 挂载专用的ID：List / Form 都可用
     */
    @Override
    public UiVisitor setControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_VISITOR.RESOURCE_ID</code>. 「resourceId」-
     * 关联资源ID
     */
    @Override
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_VISITOR.RESOURCE_ID</code>. 「resourceId」-
     * 关联资源ID
     */
    @Override
    public UiVisitor setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_VISITOR.SIGMA</code>. 「sigma」- 高维度：统一标识符
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_VISITOR.SIGMA</code>. 「sigma」- 高维度：统一标识符
     */
    @Override
    public UiVisitor setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_VISITOR.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_VISITOR.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public UiVisitor setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_VISITOR.RUN_COMPONENT</code>.
     * 「runComponent」- 执行组件，扩展时专用
     */
    @Override
    public String getRunComponent() {
        return this.runComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_VISITOR.RUN_COMPONENT</code>.
     * 「runComponent」- 执行组件，扩展时专用
     */
    @Override
    public UiVisitor setRunComponent(String runComponent) {
        this.runComponent = runComponent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UiVisitor (");

        sb.append(identifier);
        sb.append(", ").append(page);
        sb.append(", ").append(path);
        sb.append(", ").append(controlId);
        sb.append(", ").append(resourceId);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
        sb.append(", ").append(runComponent);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUiVisitor from) {
        setIdentifier(from.getIdentifier());
        setPage(from.getPage());
        setPath(from.getPath());
        setControlId(from.getControlId());
        setResourceId(from.getResourceId());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setRunComponent(from.getRunComponent());
    }

    @Override
    public <E extends IUiVisitor> E into(E into) {
        into.from(this);
        return into;
    }
}
