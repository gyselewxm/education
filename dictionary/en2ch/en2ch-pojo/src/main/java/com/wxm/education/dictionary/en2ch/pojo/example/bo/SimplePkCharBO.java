package com.wxm.education.dictionary.en2ch.pojo.example.bo;

import com.wxm.base.annotation.ColumnSql;
import com.wxm.education.dictionary.en2ch.pojo.example.entity.SimplePkChar;

/**
 * <b>Title:</b> 简单示例-单个主键-定长字符串[业务对象] <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年12月4日 上午9:42:39 <br>
 * <b>Author:</b> Gysele <br>
 * <b>Version:</b> 1.0.0
 */
public class SimplePkCharBO extends SimplePkChar {

    @ColumnSql("SELECT COUNT(1) FROM simple_pks")
    private String totalCount;

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }
}
