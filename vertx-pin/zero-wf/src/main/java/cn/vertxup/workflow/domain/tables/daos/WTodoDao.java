/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.daos;


import cn.vertxup.workflow.domain.tables.WTodo;
import cn.vertxup.workflow.domain.tables.records.WTodoRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WTodoDao extends AbstractVertxDAO<WTodoRecord, cn.vertxup.workflow.domain.tables.pojos.WTodo, String, Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>>, Future<cn.vertxup.workflow.domain.tables.pojos.WTodo>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<WTodoRecord,cn.vertxup.workflow.domain.tables.pojos.WTodo,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public WTodoDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(WTodo.W_TODO, cn.vertxup.workflow.domain.tables.pojos.WTodo.class, new JDBCClassicQueryExecutor<WTodoRecord,cn.vertxup.workflow.domain.tables.pojos.WTodo,String>(configuration,cn.vertxup.workflow.domain.tables.pojos.WTodo.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.workflow.domain.tables.pojos.WTodo object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyBySerial(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.SERIAL.in(values));
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyBySerial(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.SERIAL.in(values),limit);
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByName(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByCode(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByIcon(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.ICON.in(values));
        }

        /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByIcon(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.ICON.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>TODO_URL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByTodoUrl(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.TODO_URL.in(values));
        }

        /**
     * Find records that have <code>TODO_URL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByTodoUrl(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.TODO_URL.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByType(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByModelId(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.MODEL_ID.in(values));
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByModelId(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.MODEL_ID.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByModelKey(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.MODEL_KEY.in(values));
        }

        /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByModelKey(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.MODEL_KEY.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_CATEGORY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByModelCategory(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.MODEL_CATEGORY.in(values));
        }

        /**
     * Find records that have <code>MODEL_CATEGORY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByModelCategory(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.MODEL_CATEGORY.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_FORM IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByModelForm(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.MODEL_FORM.in(values));
        }

        /**
     * Find records that have <code>MODEL_FORM IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByModelForm(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.MODEL_FORM.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByModelComponent(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.MODEL_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>MODEL_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByModelComponent(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.MODEL_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>INSTANCE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByInstance(Collection<Boolean> values) {
                return findManyByCondition(WTodo.W_TODO.INSTANCE.in(values));
        }

        /**
     * Find records that have <code>INSTANCE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByInstance(Collection<Boolean> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.INSTANCE.in(values),limit);
        }

        /**
     * Find records that have <code>TRACE_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByTraceId(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.TRACE_ID.in(values));
        }

        /**
     * Find records that have <code>TRACE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByTraceId(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.TRACE_ID.in(values),limit);
        }

        /**
     * Find records that have <code>TRACE_TASK_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByTraceTaskId(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.TRACE_TASK_ID.in(values));
        }

        /**
     * Find records that have <code>TRACE_TASK_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByTraceTaskId(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.TRACE_TASK_ID.in(values),limit);
        }

        /**
     * Find records that have <code>TRACE_ORDER IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByTraceOrder(Collection<Integer> values) {
                return findManyByCondition(WTodo.W_TODO.TRACE_ORDER.in(values));
        }

        /**
     * Find records that have <code>TRACE_ORDER IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByTraceOrder(Collection<Integer> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.TRACE_ORDER.in(values),limit);
        }

        /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByParentId(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.PARENT_ID.in(values));
        }

        /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByParentId(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.PARENT_ID.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByComment(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.COMMENT.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT_APPROVAL IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByCommentApproval(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.COMMENT_APPROVAL.in(values));
        }

        /**
     * Find records that have <code>COMMENT_APPROVAL IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByCommentApproval(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.COMMENT_APPROVAL.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT_REJECT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByCommentReject(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.COMMENT_REJECT.in(values));
        }

        /**
     * Find records that have <code>COMMENT_REJECT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByCommentReject(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.COMMENT_REJECT.in(values),limit);
        }

        /**
     * Find records that have <code>TO_GROUP_MODE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByToGroupMode(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.TO_GROUP_MODE.in(values));
        }

        /**
     * Find records that have <code>TO_GROUP_MODE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByToGroupMode(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.TO_GROUP_MODE.in(values),limit);
        }

        /**
     * Find records that have <code>TO_GROUP IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByToGroup(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.TO_GROUP.in(values));
        }

        /**
     * Find records that have <code>TO_GROUP IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByToGroup(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.TO_GROUP.in(values),limit);
        }

        /**
     * Find records that have <code>TO_USER IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByToUser(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.TO_USER.in(values));
        }

        /**
     * Find records that have <code>TO_USER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByToUser(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.TO_USER.in(values),limit);
        }

        /**
     * Find records that have <code>TO_ROLE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByToRole(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.TO_ROLE.in(values));
        }

        /**
     * Find records that have <code>TO_ROLE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByToRole(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.TO_ROLE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(WTodo.W_TODO.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByOwner(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.OWNER.in(values));
        }

        /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByOwner(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.OWNER.in(values),limit);
        }

        /**
     * Find records that have <code>SUPERVISOR IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyBySupervisor(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.SUPERVISOR.in(values));
        }

        /**
     * Find records that have <code>SUPERVISOR IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyBySupervisor(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.SUPERVISOR.in(values),limit);
        }

        /**
     * Find records that have <code>ASSIGNED_BY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByAssignedBy(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.ASSIGNED_BY.in(values));
        }

        /**
     * Find records that have <code>ASSIGNED_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByAssignedBy(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.ASSIGNED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>ASSIGNED_AT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByAssignedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(WTodo.W_TODO.ASSIGNED_AT.in(values));
        }

        /**
     * Find records that have <code>ASSIGNED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByAssignedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.ASSIGNED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>ACCEPTED_BY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByAcceptedBy(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.ACCEPTED_BY.in(values));
        }

        /**
     * Find records that have <code>ACCEPTED_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByAcceptedBy(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.ACCEPTED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>ACCEPTED_AT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByAcceptedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(WTodo.W_TODO.ACCEPTED_AT.in(values));
        }

        /**
     * Find records that have <code>ACCEPTED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByAcceptedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.ACCEPTED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>FINISHED_BY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByFinishedBy(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.FINISHED_BY.in(values));
        }

        /**
     * Find records that have <code>FINISHED_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByFinishedBy(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.FINISHED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>FINISHED_AT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByFinishedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(WTodo.W_TODO.FINISHED_AT.in(values));
        }

        /**
     * Find records that have <code>FINISHED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByFinishedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.FINISHED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>EXPIRED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByExpiredAt(Collection<LocalDateTime> values) {
                return findManyByCondition(WTodo.W_TODO.EXPIRED_AT.in(values));
        }

        /**
     * Find records that have <code>EXPIRED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByExpiredAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.EXPIRED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(WTodo.W_TODO.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(WTodo.W_TODO.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(WTodo.W_TODO.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WTodo>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(WTodo.W_TODO.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<WTodoRecord,cn.vertxup.workflow.domain.tables.pojos.WTodo,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<WTodoRecord,cn.vertxup.workflow.domain.tables.pojos.WTodo,String>) super.queryExecutor();
        }
}
