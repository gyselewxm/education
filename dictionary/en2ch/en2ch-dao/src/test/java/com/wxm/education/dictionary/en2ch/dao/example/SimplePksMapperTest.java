package com.wxm.education.dictionary.en2ch.dao.example;

import static org.junit.Assert.fail;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.wxm.education.dictionary.en2ch.base.junit.JunitBase;
import com.wxm.education.dictionary.en2ch.pojo.example.bo.SimplePksBO;
import com.wxm.education.dictionary.en2ch.pojo.example.entity.SimplePks;
import com.wxm.education.dictionary.en2ch.pojo.example.query.SimplePksQuery;
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
        SimplePksQuery query = new SimplePksQuery();
        query.setId("a0d695a0-9ead-4538-bf5f-d07e304f4f40");
        query.setVarcharId("4f0ae111-7e2a-4d0b-80f0-3d01709e0930");
        query.setIntegerId(882);
        SimplePks bean = mapper.selectByPrimaryKey(query);
        logger.debug("查询结果：" + JSON.toJSONString(bean));
    }

    @Test
    public void testSelectBOOne() {
        SimplePksQuery query = new SimplePksQuery();
        query.setId("a0d695a0-9ead-4538-bf5f-d07e304f4f40");
        query.setVarcharId("4f0ae111-7e2a-4d0b-80f0-3d01709e0930");
        query.setIntegerId(882);
        SimplePksBO beanBo = mapper.selectBOByPrimaryKey(query);
        logger.debug("查询结果：" + JSON.toJSONString(beanBo));
    }

    @Test
    public void testSelect() {
        SimplePksQuery query = new SimplePksQuery();
        query.setLike_remark("dd");
        List<SimplePks> list = mapper.select(query);
        logger.debug("查询结果：" + JSON.toJSONString(list));
    }

    @Test
    public void testSelectBO() {
        SimplePksQuery query = new SimplePksQuery();
        query.setLike_remark("dd");
        List<SimplePksBO> list = mapper.selectBO(query);
        logger.debug("查询结果：" + JSON.toJSONString(list));
    }

    @Test
    public void testSelectAll() {
        List<SimplePks> list = mapper.selectAll();
        logger.debug("查询结果：" + JSON.toJSONString(list));
    }

    @Test
    public void testSelectAllBO() {
        List<SimplePksBO> list = mapper.selectAllBO();
        logger.debug("查询结果：" + JSON.toJSONString(list));
    }

    @Test
    public void testSelectCount() {
        SimplePksQuery query = new SimplePksQuery();
        query.setRemark("dddsf");
        int count = mapper.selectCount(query);
        logger.debug("相等查询结果：" + count);

        query = new SimplePksQuery();
        query.setLike_remark("dd");
        count = mapper.selectCount(query);
        logger.debug("全模糊查询结果：" + count);

        query = new SimplePksQuery();
        query.setLikeL_remark("ad");
        count = mapper.selectCount(query);
        logger.debug("左模糊查询结果：" + count);

        query = new SimplePksQuery();
        query.setLikeR_remark("dd");
        count = mapper.selectCount(query);
        logger.debug("右模糊查询结果：" + count);
    }

    @Test
    public void testSelectByPrimaryKey() {
        SimplePksQuery query = new SimplePksQuery();
        query.setId("a0d695a0-9ead-4538-bf5f-d07e304f4f40");
        query.setVarcharId("4f0ae111-7e2a-4d0b-80f0-3d01709e0930");
        query.setIntegerId(882);
        SimplePks bean = mapper.selectByPrimaryKey(query);
        logger.debug("查询结果：" + JSON.toJSONString(bean));
    }

    @Test
    public void testSelectBOByPrimaryKey() {
        SimplePksQuery query = new SimplePksQuery();
        query.setId("a0d695a0-9ead-4538-bf5f-d07e304f4f40");
        // query.setVarcharId("4f0ae111-7e2a-4d0b-80f0-3d01709e0930");
        query.setIntegerId(882);
        SimplePksBO beanBo = mapper.selectBOByPrimaryKey(query);
        logger.debug("查询结果：" + JSON.toJSONString(beanBo));
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
        SimplePks bean = new SimplePks();
        bean.setId("a0d695a0-9ead-4538-bf5f-d07e304f4f40");
        bean.setVarcharId("4f0ae111-7e2a-4d0b-80f0-3d01709e0930");
        bean.setIntegerId(882);
        mapper.updateByPrimaryKey(bean);
        logger.debug(JSON.toJSONString(bean));
    }

    @Test
    public void testUpdateByPrimaryKeySelective() {
        SimplePks bean = new SimplePks();
        bean.setId("a0d695a0-9ead-4538-bf5f-d07e304f4f40");
        bean.setVarcharId("4f0ae111-7e2a-4d0b-80f0-3d01709e0930");
        bean.setIntegerId(882);
        bean.setRemark("Update");
        mapper.updateByPrimaryKeySelective(bean);
        logger.debug(JSON.toJSONString(bean));
    }

    @Test
    public void testDelete() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public void testDeleteByPrimaryKey() {
        fail("Not yet implemented"); // TODO
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

}
