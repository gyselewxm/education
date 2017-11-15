package com.wxm.education.dictionary.en2ch.dao.example;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.wxm.education.dictionary.en2ch.base.junit.JunitBase;
import com.wxm.education.dictionary.en2ch.pojo.example.entity.SimplePks;

public class SimplePksMapperTest extends JunitBase {
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
        bean.setIntegerId((int) Math.round(Math.random() * 1000));
        mapper.insert(bean);
        System.out.println(JSON.toJSONString(bean));
    }

    @Test
    public void testInsertSelective() {
        SimplePks bean = new SimplePks();
        bean.setIntegerId((int) Math.round(Math.random() * 1000));
        mapper.insert(bean);
        System.out.println(JSON.toJSONString(bean));
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
        fail("Not yet implemented");
    }

    @Test
    public void testInsertSelectiveList() {
        fail("Not yet implemented");
    }

}
