package com.wxm.education.dictionary.en2ch.pojo.dataobject.sm;

import java.util.Date;

import javax.persistence.Column;

import com.wxm.base.pojo.dataobject.BaseDO;

/**
 * 系统用户
 * 
 * @author wuxm
 * @date 2017年10月27日 下午4:57:49
 * @see 1.0.0
 */
public class SMUserDO extends BaseDO {
    /**
     * 用户名
     */
    @Column
    private String username;
    /**
     * 中文名
     */
    @Column
    private String cnName;
    /**
     * 英文名
     */
    @Column
    private String enName;
    /**
     * 生日
     */
    @Column
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
