package com.wxm.education.dictionary.en2ch.dao.example;

import static org.junit.Assert.fail;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.wxm.education.dictionary.en2ch.base.junit.JunitBase;
import com.wxm.education.dictionary.en2ch.pojo.example.bo.SimplePkCharBO;
import com.wxm.education.dictionary.en2ch.pojo.example.entity.SimplePkChar;
import com.wxm.education.dictionary.en2ch.pojo.example.query.SimplePkCharQuery;
import com.wxm.mybatis.mapper.util.UUIDUtil;

public class SimplePkCharMapperTest extends JunitBase {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private SimplePkCharMapper mapper;

    @Override
    public void before() {
        super.before();
        mapper = getBean(SimplePkCharMapper.class);
    }

    @Test
    public void testSelectOne() {
        SimplePkCharQuery query = new SimplePkCharQuery();
        query.setId("34f1788e-29fe-486b-b052-175dbf9eba1d");
        SimplePkChar bean = mapper.selectByPrimaryKey(query);
        logger.debug("查询结果：" + JSON.toJSONString(bean));
    }

    @Test
    public void testSelectBOOne() {
        SimplePkCharQuery query = new SimplePkCharQuery();
        query.setId("34f1788e-29fe-486b-b052-175dbf9eba1d");
        SimplePkCharBO bean = mapper.selectBOByPrimaryKey(query);
        logger.debug("查询结果：" + JSON.toJSONString(bean));
    }

    @Test
    public void testSelect() {
        fail("Not yet implemented");
    }

    @Test
    public void testSelectAll() {
        List<SimplePkChar> list = mapper.selectAll();
        logger.debug("查询结果：" + JSON.toJSONString(list));
    }

    @Test
    public void testSelectAllBO() {
        List<SimplePkCharBO> list = mapper.selectAllBO();
        logger.debug("查询结果：" + JSON.toJSONString(list));
    }

    @Test
    public void testSelectCount() {
        SimplePkCharQuery query = new SimplePkCharQuery();
        query.setRemark("dddsf");
        int count = mapper.selectCount(query);
        logger.debug("相等查询结果：" + count);

        query = new SimplePkCharQuery();
        query.setLike_remark("dd");
        count = mapper.selectCount(query);
        logger.debug("全模糊查询结果：" + count);

        query = new SimplePkCharQuery();
        query.setLikeL_remark("ad");
        count = mapper.selectCount(query);
        logger.debug("左模糊查询结果：" + count);

        query = new SimplePkCharQuery();
        query.setLikeR_remark("dd");
        count = mapper.selectCount(query);
        logger.debug("右模糊查询结果：" + count);
    }

    @Test
    public void testSelectByPrimaryKey() {
        SimplePkCharQuery query = new SimplePkCharQuery();
        query.setId("34f1788e-29fe-486b-b052-175dbf9eba1d");
        SimplePkChar bean = mapper.selectByPrimaryKey(query);
        logger.debug("查询结果：" + JSON.toJSONString(bean));
    }

    @Test
    public void testSelectBOByPrimaryKey() {
        SimplePkCharQuery query = new SimplePkCharQuery();
        query.setId("34f1788e-29fe-486b-b052-175dbf9eba1d");
        SimplePkCharBO beanBo = mapper.selectBOByPrimaryKey(query);
        logger.debug("查询结果：" + JSON.toJSONString(beanBo));
    }

    @Test
    public void testInsert() {
        SimplePkChar bean = new SimplePkChar();
        mapper.insert(bean);
        logger.debug(JSON.toJSONString(bean));
    }

    @Test
    public void testInsertSelective() {
        SimplePkChar bean = new SimplePkChar();
        mapper.insertSelective(bean);
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
        List<SimplePkChar> list = new LinkedList<SimplePkChar>();
        SimplePkChar bean;
        for (int i = 0; i < 5; i++) {
            bean = new SimplePkChar();
            bean.setId(UUIDUtil.getUUID());
            list.add(bean);
        }
        mapper.insertList(list);
        logger.debug(JSON.toJSONString(list));
    }

}
