package com.wxm.mybatis.mapper.code;

/**
 * 
 * <b>Title:</b>数据库方言 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月7日 下午4:13:34<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public enum IdentityDialectEnum {
    DB2("VALUES IDENTITY_VAL_LOCAL()"),
    MYSQL("SELECT LAST_INSERT_ID()"),
    SQLSERVER("SELECT SCOPE_IDENTITY()"),
    CLOUDSCAPE("VALUES IDENTITY_VAL_LOCAL()"),
    DERBY("VALUES IDENTITY_VAL_LOCAL()"),
    HSQLDB("CALL IDENTITY()"),
    SYBASE("SELECT @@IDENTITY"),
    DB2_MF("SELECT IDENTITY_VAL_LOCAL() FROM SYSIBM.SYSDUMMY1"),
    INFORMIX("select dbinfo('sqlca.sqlerrd1') from systables where tabid=1");

    private String identityRetrievalStatement;

    private IdentityDialectEnum(String identityRetrievalStatement) {
        this.identityRetrievalStatement = identityRetrievalStatement;
    }

    public static IdentityDialectEnum getDatabaseDialect(String database) {
        IdentityDialectEnum returnValue = null;
        if ("DB2".equalsIgnoreCase(database)) {
            returnValue = DB2;
        } else if ("MySQL".equalsIgnoreCase(database)) {
            returnValue = MYSQL;
        } else if ("SqlServer".equalsIgnoreCase(database)) {
            returnValue = SQLSERVER;
        } else if ("Cloudscape".equalsIgnoreCase(database)) {
            returnValue = CLOUDSCAPE;
        } else if ("Derby".equalsIgnoreCase(database)) {
            returnValue = DERBY;
        } else if ("HSQLDB".equalsIgnoreCase(database)) {
            returnValue = HSQLDB;
        } else if ("SYBASE".equalsIgnoreCase(database)) {
            returnValue = SYBASE;
        } else if ("DB2_MF".equalsIgnoreCase(database)) {
            returnValue = DB2_MF;
        } else if ("Informix".equalsIgnoreCase(database)) {
            returnValue = INFORMIX;
        }
        return returnValue;
    }

    public String getIdentityRetrievalStatement() {
        return identityRetrievalStatement;
    }
}
