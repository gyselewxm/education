package com.wxm.education.dictionary.en2ch.pojo.example.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.wxm.base.pojo.dataobject.BaseUUIDDO;

/**
 * 
 * <b>Title:</b> 简单示例-两个主键 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月9日 下午5:44:54
 * 
 * @author wuxm
 * @version 1.0.0
 */
@Table(name = "simple_2pk")
public class Simple_2PK extends BaseUUIDDO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -8302067138923608036L;
    /**
     * ID2
     */
    @Id
    @GeneratedValue(generator = "UUID")
    private String id2;
    /**
     * 可变动字符串_非空
     */
    private String varcharNotNull;
    /**
     * 可变动字符串_可空
     */
    private String varcharCanNull;
    /**
     * 定长字符串_非空
     */
    private String charNotNull;
    /**
     * 定长字符串_可空
     */
    private String charCanNull;

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public String getVarcharNotNull() {
        return varcharNotNull;
    }

    public void setVarcharNotNull(String varcharNotNull) {
        this.varcharNotNull = varcharNotNull;
    }

    public String getVarcharCanNull() {
        return varcharCanNull;
    }

    public void setVarcharCanNull(String varcharCanNull) {
        this.varcharCanNull = varcharCanNull;
    }

    public String getCharNotNull() {
        return charNotNull;
    }

    public void setCharNotNull(String charNotNull) {
        this.charNotNull = charNotNull;
    }

    public String getCharCanNull() {
        return charCanNull;
    }

    public void setCharCanNull(String charCanNull) {
        this.charCanNull = charCanNull;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
