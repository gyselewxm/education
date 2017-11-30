package com.wxm.education.dictionary.en2ch.pojo.example.query;

/**
 * 
 * <b>Title:</b> 示例-是否为空-默认[查询条件]<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月27日 下午5:21:17<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class ExIsnullDefaultQuery {

    /**
     * ID
     */
    private String id;
    /**
     * 变长字符串_非空_默认
     */
    private String varcharNotnullDefault;
    /**
     * 变长字符串_非空_默认（全模糊）
     */
    private String like_varcharNotnullDefault;

    public ExIsnullDefaultQuery(String id) {
        super();
        this.id = id;
    }

    public ExIsnullDefaultQuery(String id, String varcharNotnullDefault) {
        super();
        this.id = id;
        this.varcharNotnullDefault = varcharNotnullDefault;
    }

    public ExIsnullDefaultQuery(String id, String varcharNotnullDefault, String like_varcharNotnullDefault) {
        super();
        this.id = id;
        this.varcharNotnullDefault = varcharNotnullDefault;
        this.like_varcharNotnullDefault = like_varcharNotnullDefault;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVarcharNotnullDefault() {
        return varcharNotnullDefault;
    }

    public void setVarcharNotnullDefault(String varcharNotnullDefault) {
        this.varcharNotnullDefault = varcharNotnullDefault;
    }

    public String getLike_varcharNotnullDefault() {
        return like_varcharNotnullDefault;
    }

    public void setLike_varcharNotnullDefault(String like_varcharNotnullDefault) {
        this.like_varcharNotnullDefault = like_varcharNotnullDefault;
    }
}
