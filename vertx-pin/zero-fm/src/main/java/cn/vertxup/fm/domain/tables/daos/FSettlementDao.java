/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.daos;


import cn.vertxup.fm.domain.tables.FSettlement;
import cn.vertxup.fm.domain.tables.records.FSettlementRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.math.BigDecimal;
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
public class FSettlementDao extends AbstractVertxDAO<FSettlementRecord, cn.vertxup.fm.domain.tables.pojos.FSettlement, String, Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>>, Future<cn.vertxup.fm.domain.tables.pojos.FSettlement>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<FSettlementRecord,cn.vertxup.fm.domain.tables.pojos.FSettlement,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public FSettlementDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(FSettlement.F_SETTLEMENT, cn.vertxup.fm.domain.tables.pojos.FSettlement.class, new JDBCClassicQueryExecutor<FSettlementRecord,cn.vertxup.fm.domain.tables.pojos.FSettlement,String>(configuration,cn.vertxup.fm.domain.tables.pojos.FSettlement.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.fm.domain.tables.pojos.FSettlement object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByCode(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyBySerial(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.SERIAL.in(values));
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyBySerial(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.SERIAL.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByAmount(Collection<BigDecimal> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.AMOUNT.in(values));
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByAmount(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.AMOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByComment(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.COMMENT.in(values),limit);
        }

        /**
     * Find records that have <code>ROUNDED IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByRounded(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.ROUNDED.in(values));
        }

        /**
     * Find records that have <code>ROUNDED IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByRounded(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.ROUNDED.in(values),limit);
        }

        /**
     * Find records that have <code>FINISHED IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByFinished(Collection<Boolean> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.FINISHED.in(values));
        }

        /**
     * Find records that have <code>FINISHED IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByFinished(Collection<Boolean> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.FINISHED.in(values),limit);
        }

        /**
     * Find records that have <code>FINISHED_AT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByFinishedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.FINISHED_AT.in(values));
        }

        /**
     * Find records that have <code>FINISHED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByFinishedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.FINISHED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>SIGN_NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyBySignName(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.SIGN_NAME.in(values));
        }

        /**
     * Find records that have <code>SIGN_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyBySignName(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.SIGN_NAME.in(values),limit);
        }

        /**
     * Find records that have <code>SIGN_MOBILE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyBySignMobile(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.SIGN_MOBILE.in(values));
        }

        /**
     * Find records that have <code>SIGN_MOBILE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyBySignMobile(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.SIGN_MOBILE.in(values),limit);
        }

        /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByCustomerId(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.CUSTOMER_ID.in(values));
        }

        /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByCustomerId(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.CUSTOMER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ORDER_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByOrderId(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.ORDER_ID.in(values));
        }

        /**
     * Find records that have <code>ORDER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByOrderId(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.ORDER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>BOOK_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByBookId(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.BOOK_ID.in(values));
        }

        /**
     * Find records that have <code>BOOK_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByBookId(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.BOOK_ID.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.fm.domain.tables.pojos.FSettlement>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(FSettlement.F_SETTLEMENT.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<FSettlementRecord,cn.vertxup.fm.domain.tables.pojos.FSettlement,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<FSettlementRecord,cn.vertxup.fm.domain.tables.pojos.FSettlement,String>) super.queryExecutor();
        }
}
