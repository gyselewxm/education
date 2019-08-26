package com.wxm.education.dictionary.en2ch.pojo.sm.entity;

import java.util.Date;

import com.wxm.base.pojo.dataobject.BaseDO;

/**
 * 
 * <b>Title:</b> 系统用户<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年10月30日 上午11:41:34<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class SmUser extends BaseDO {
    /**
     * 用户名
     */
    private String username;
    /**
     * 中文名
     */
    private String cnName;
    /**
     * 英文名
     */
    private String enName;
    /**
     * 生日
     */
    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
