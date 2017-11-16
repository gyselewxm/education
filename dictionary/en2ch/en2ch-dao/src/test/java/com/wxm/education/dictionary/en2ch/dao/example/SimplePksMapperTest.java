package com.wxm.education.dictionary.en2ch.dao.example;

import static org.junit.Assert.fail;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.wxm.education.dictionary.en2ch.base.junit.JunitBase;
import com.wxm.education.dictionary.en2ch.pojo.example.entity.SimplePks;
import com.wxm.mybatis.mapper.util.UUIDUtil;

public class SimplePksMapperTest extends JunitBase {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private SimplePksMapper mapper;

    @Override
    public void before() {
        super.before();
        mapper = getBean(SimplePksMapper.class);
    }

    @Test
    public void testSelectOne() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelect() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectAll() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectCount() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectByPrimaryKey() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectById() {
        fail("Not yet implemented");
    }

    @Test
    public void testExistsWithPrimaryKey() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsert() {
        SimplePks bean = new SimplePks();
        bean.setVarcharId(UUIDUtil.getUUID());
        bean.setIntegerId((int) Math.round(Math.random() * 1000));
        mapper.insert(bean);
        logger.debug(JSON.toJSONString(bean));
    }

    @Test
    public void testInsertSelective() {
        SimplePks bean = new SimplePks();
        bean.setVarcharId(UUIDUtil.getUUID());
        bean.setIntegerId((int) Math.round(Math.random() * 1000));
        mapper.insert(bean);
        logger.debug(JSON.toJSONString(bean));
    }

    @Test
    public void testUpdateByPrimaryKey() {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdateByPrimaryKeySelective() {
        fail("Not yet implemented");
    }

    @Test
    public void testDelete() {
        fail("Not yet implemented");
    }

    @Test
    public void testDeleteByPrimaryKey() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsertList() {
        List<SimplePks> list = new LinkedList<SimplePks>();
        SimplePks bean;
        for (int i = 0; i < 5; i++) {
            bean = new SimplePks();
            bean.setId(UUIDUtil.getUUID());
            bean.setVarcharId(UUIDUtil.getUUID());
            bean.setIntegerId((int) Math.round(Math.random() * 1000));
            list.add(bean);
        }
        mapper.insertList(list);
        logger.debug(JSON.toJSONString(list));
    }

    @Test
    public void testInsertSelectiveList() {
        List<SimplePks> list = new LinkedList<SimplePks>();
        SimplePks bean;
        for (int i = 0; i < 5; i++) {
            bean = new SimplePks();
            bean.setId(UUIDUtil.getUUID());
            bean.setVarcharId(UUIDUtil.getUUID());
            bean.setIntegerId((int) Math.round(Math.random() * 1000));
            list.add(bean);
        }
        mapper.insertList(list);
        logger.debug(JSON.toJSONString(list));
    }

}
