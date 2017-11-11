package com.wxm.education.dictionary.en2ch.pojo.example.query;

import com.wxm.education.dictionary.en2ch.pojo.example.entity.Simple_2PK;

/**
 * 
 * <b>Title:</b> 简单示例-两个主键查询条件 <br>
 * <b>Description:</b> <br>
 * <b>Date:</b> 2017年11月9日 下午6:48:13
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class Simple_2PKQuery extends Simple_2PK {

    /**
     * 
     */
    private static final long serialVersionUID = 8080992767034434575L;

    public Simple_2PKQuery() {
        super();
    }

    /**
     * 初始化设置主键（主要用于快速生生成删除条件）
     * 
     * @param id
     *            示例ID
     * @param id2
     *            ID2
     */
    public Simple_2PKQuery(String id, String id2) {
        super();
        setId(id);
        setId2(id2);
    }
}
