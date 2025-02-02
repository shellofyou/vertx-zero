/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.daos;


import cn.vertxup.erp.domain.tables.RTeamEmployee;
import cn.vertxup.erp.domain.tables.records.RTeamEmployeeRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RTeamEmployeeDao extends AbstractVertxDAO<RTeamEmployeeRecord, cn.vertxup.erp.domain.tables.pojos.RTeamEmployee, Record2<String, String>, Future<List<cn.vertxup.erp.domain.tables.pojos.RTeamEmployee>>, Future<cn.vertxup.erp.domain.tables.pojos.RTeamEmployee>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<RTeamEmployeeRecord,cn.vertxup.erp.domain.tables.pojos.RTeamEmployee,Record2<String, String>> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public RTeamEmployeeDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(RTeamEmployee.R_TEAM_EMPLOYEE, cn.vertxup.erp.domain.tables.pojos.RTeamEmployee.class, new JDBCClassicQueryExecutor<RTeamEmployeeRecord,cn.vertxup.erp.domain.tables.pojos.RTeamEmployee,Record2<String, String>>(configuration,cn.vertxup.erp.domain.tables.pojos.RTeamEmployee.class,vertx));
        }

        @Override
        protected Record2<String, String> getId(cn.vertxup.erp.domain.tables.pojos.RTeamEmployee object) {
                return compositeKeyRecord(object.getTeamId(), object.getEmployeeId());
        }

        /**
     * Find records that have <code>EMPLOYEE_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.RTeamEmployee>> findManyByEmployeeId(Collection<String> values) {
                return findManyByCondition(RTeamEmployee.R_TEAM_EMPLOYEE.EMPLOYEE_ID.in(values));
        }

        /**
     * Find records that have <code>EMPLOYEE_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.RTeamEmployee>> findManyByEmployeeId(Collection<String> values, int limit) {
                return findManyByCondition(RTeamEmployee.R_TEAM_EMPLOYEE.EMPLOYEE_ID.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.RTeamEmployee>> findManyByComment(Collection<String> values) {
                return findManyByCondition(RTeamEmployee.R_TEAM_EMPLOYEE.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.RTeamEmployee>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(RTeamEmployee.R_TEAM_EMPLOYEE.COMMENT.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<RTeamEmployeeRecord,cn.vertxup.erp.domain.tables.pojos.RTeamEmployee,Record2<String, String>> queryExecutor(){
                return (JDBCClassicQueryExecutor<RTeamEmployeeRecord,cn.vertxup.erp.domain.tables.pojos.RTeamEmployee,Record2<String, String>>) super.queryExecutor();
        }
}
