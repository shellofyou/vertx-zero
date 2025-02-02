/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.records;


import cn.vertxup.ui.domain.tables.UiColumn;
import cn.vertxup.ui.domain.tables.interfaces.IUiColumn;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UiColumnRecord extends UpdatableRecordImpl<UiColumnRecord> implements VertxPojo, IUiColumn {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.KEY</code>. 「key」- 列主键
     */
    @Override
    public UiColumnRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.KEY</code>. 「key」- 列主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.TITLE</code>. 「title」- 列标题
     */
    @Override
    public UiColumnRecord setTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.TITLE</code>. 「title」- 列标题
     */
    @Override
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.DATA_INDEX</code>. 「dataIndex」- 列名
     */
    @Override
    public UiColumnRecord setDataIndex(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.DATA_INDEX</code>. 「dataIndex」- 列名
     */
    @Override
    public String getDataIndex() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.POSITION</code>. 「position」- 当前列的位置
     */
    @Override
    public UiColumnRecord setPosition(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.POSITION</code>. 「position」- 当前列的位置
     */
    @Override
    public Integer getPosition() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.RENDER</code>. 「render」-
     * 使用的Render函数
     */
    @Override
    public UiColumnRecord setRender(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.RENDER</code>. 「render」-
     * 使用的Render函数
     */
    @Override
    public String getRender() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.WIDTH</code>. 「width」- 当前列的宽度
     */
    @Override
    public UiColumnRecord setWidth(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.WIDTH</code>. 「width」- 当前列的宽度
     */
    @Override
    public Integer getWidth() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.FIXED</code>. 「fixed」- 当前列是否固定
     */
    @Override
    public UiColumnRecord setFixed(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.FIXED</code>. 「fixed」- 当前列是否固定
     */
    @Override
    public Boolean getFixed() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.CLASS_NAME</code>. 「className」-
     * 当前列的特殊CSS类
     */
    @Override
    public UiColumnRecord setClassName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.CLASS_NAME</code>. 「className」-
     * 当前列的特殊CSS类
     */
    @Override
    public String getClassName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.SORTER</code>. 「sorter」- 当前列是否支持排序
     */
    @Override
    public UiColumnRecord setSorter(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.SORTER</code>. 「sorter」- 当前列是否支持排序
     */
    @Override
    public Boolean getSorter() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.FILTER_TYPE</code>. 「filterType」-
     * $filter.type 支持列搜索时的搜索类型
     */
    @Override
    public UiColumnRecord setFilterType(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.FILTER_TYPE</code>. 「filterType」-
     * $filter.type 支持列搜索时的搜索类型
     */
    @Override
    public String getFilterType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.FILTER_CONFIG</code>.
     * 「filterConfig」- $filter.config 列搜索支持时的搜索配置
     */
    @Override
    public UiColumnRecord setFilterConfig(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.FILTER_CONFIG</code>.
     * 「filterConfig」- $filter.config 列搜索支持时的搜索配置
     */
    @Override
    public String getFilterConfig() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.EMPTY</code>. 「empty」- $empty 专用
     */
    @Override
    public UiColumnRecord setEmpty(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.EMPTY</code>. 「empty」- $empty 专用
     */
    @Override
    public String getEmpty() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.MAPPING</code>. 「mapping」-
     * $mapping专用
     */
    @Override
    public UiColumnRecord setMapping(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.MAPPING</code>. 「mapping」-
     * $mapping专用
     */
    @Override
    public String getMapping() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.CONFIG</code>. 「config」- $config专用
     */
    @Override
    public UiColumnRecord setConfig(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.CONFIG</code>. 「config」- $config专用
     */
    @Override
    public String getConfig() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.OPTION</code>. 「option」-
     * $option专用，executor时
     */
    @Override
    public UiColumnRecord setOption(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.OPTION</code>. 「option」-
     * $option专用，executor时
     */
    @Override
    public String getOption() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.FORMAT</code>. 「format」-
     * $format时间格式专用
     */
    @Override
    public UiColumnRecord setFormat(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.FORMAT</code>. 「format」-
     * $format时间格式专用
     */
    @Override
    public String getFormat() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.DATUM</code>. 「datum」- $datum专用
     */
    @Override
    public UiColumnRecord setDatum(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.DATUM</code>. 「datum」- $datum专用
     */
    @Override
    public String getDatum() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.CONTROL_ID</code>. 「controlId」-
     * 关联的控件ID
     */
    @Override
    public UiColumnRecord setControlId(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.CONTROL_ID</code>. 「controlId」-
     * 关联的控件ID
     */
    @Override
    public String getControlId() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public UiColumnRecord setActive(Boolean value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public UiColumnRecord setSigma(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public UiColumnRecord setMetadata(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public UiColumnRecord setLanguage(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public UiColumnRecord setCreatedAt(LocalDateTime value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public UiColumnRecord setCreatedBy(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public UiColumnRecord setUpdatedAt(LocalDateTime value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public UiColumnRecord setUpdatedBy(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(25);
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
    public void from(IUiColumn from) {
        setKey(from.getKey());
        setTitle(from.getTitle());
        setDataIndex(from.getDataIndex());
        setPosition(from.getPosition());
        setRender(from.getRender());
        setWidth(from.getWidth());
        setFixed(from.getFixed());
        setClassName(from.getClassName());
        setSorter(from.getSorter());
        setFilterType(from.getFilterType());
        setFilterConfig(from.getFilterConfig());
        setEmpty(from.getEmpty());
        setMapping(from.getMapping());
        setConfig(from.getConfig());
        setOption(from.getOption());
        setFormat(from.getFormat());
        setDatum(from.getDatum());
        setControlId(from.getControlId());
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
    public <E extends IUiColumn> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UiColumnRecord
     */
    public UiColumnRecord() {
        super(UiColumn.UI_COLUMN);
    }

    /**
     * Create a detached, initialised UiColumnRecord
     */
    public UiColumnRecord(String key, String title, String dataIndex, Integer position, String render, Integer width, Boolean fixed, String className, Boolean sorter, String filterType, String filterConfig, String empty, String mapping, String config, String option, String format, String datum, String controlId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(UiColumn.UI_COLUMN);

        setKey(key);
        setTitle(title);
        setDataIndex(dataIndex);
        setPosition(position);
        setRender(render);
        setWidth(width);
        setFixed(fixed);
        setClassName(className);
        setSorter(sorter);
        setFilterType(filterType);
        setFilterConfig(filterConfig);
        setEmpty(empty);
        setMapping(mapping);
        setConfig(config);
        setOption(option);
        setFormat(format);
        setDatum(datum);
        setControlId(controlId);
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
     * Create a detached, initialised UiColumnRecord
     */
    public UiColumnRecord(cn.vertxup.ui.domain.tables.pojos.UiColumn value) {
        super(UiColumn.UI_COLUMN);

        if (value != null) {
            setKey(value.getKey());
            setTitle(value.getTitle());
            setDataIndex(value.getDataIndex());
            setPosition(value.getPosition());
            setRender(value.getRender());
            setWidth(value.getWidth());
            setFixed(value.getFixed());
            setClassName(value.getClassName());
            setSorter(value.getSorter());
            setFilterType(value.getFilterType());
            setFilterConfig(value.getFilterConfig());
            setEmpty(value.getEmpty());
            setMapping(value.getMapping());
            setConfig(value.getConfig());
            setOption(value.getOption());
            setFormat(value.getFormat());
            setDatum(value.getDatum());
            setControlId(value.getControlId());
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

        public UiColumnRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
