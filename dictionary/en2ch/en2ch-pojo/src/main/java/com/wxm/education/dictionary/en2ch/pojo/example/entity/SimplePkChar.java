package com.wxm.education.dictionary.en2ch.pojo.example.entity;

import javax.persistence.Table;

import com.wxm.base.pojo.dataobject.BaseUUIDDO;

/**
 * 
 * <b>Title:</b> 简单示例-单个主键-定长字符串<br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月15日 下午2:49:31<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
@Table(name="simple_pk_char")
public class SimplePkChar extends BaseUUIDDO {
    /**
     * 备注
     */
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
