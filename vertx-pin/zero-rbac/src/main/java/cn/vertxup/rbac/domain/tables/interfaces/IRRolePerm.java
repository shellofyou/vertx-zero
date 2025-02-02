/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IRRolePerm extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.R_ROLE_PERM.PERM_ID</code>. 「permId」- 关联权限ID
     */
    public IRRolePerm setPermId(String value);

    /**
     * Getter for <code>DB_ETERNAL.R_ROLE_PERM.PERM_ID</code>. 「permId」- 关联权限ID
     */
    public String getPermId();

    /**
     * Setter for <code>DB_ETERNAL.R_ROLE_PERM.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public IRRolePerm setRoleId(String value);

    /**
     * Getter for <code>DB_ETERNAL.R_ROLE_PERM.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public String getRoleId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IRRolePerm
     */
    public void from(IRRolePerm from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IRRolePerm
     */
    public <E extends IRRolePerm> E into(E into);

        @Override
        public default IRRolePerm fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setPermId,json::getString,"PERM_ID","java.lang.String");
                setOrThrow(this::setRoleId,json::getString,"ROLE_ID","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("PERM_ID",getPermId());
                json.put("ROLE_ID",getRoleId());
                return json;
        }

}
