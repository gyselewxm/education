package com.wxm.education.dictionary.en2ch.dao.sys;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.wxm.education.dictionary.en2ch.base.junit.JunitBase;
import com.wxm.education.dictionary.en2ch.pojo.sm.entity.SmUser;
import com.wxm.education.dictionary.en2ch.pojo.sm.vo.SmUserVO;

public class SmUserMapperTest extends JunitBase {
    private SmUserMapper smUserMapper;

    @Override
    public void before() {
        super.before();
        smUserMapper = getBean(SmUserMapper.class);
    }

    @Test
    public void testSelectOne() {
        SmUser smUser = new SmUser();
        smUser.setId("11");
        smUser = smUserMapper.selectOne(smUser);
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
        SmUser smUser = smUserMapper.selectByPrimaryKey("a3d862ee-4db6-43ef-9233-39adf14a6fa7");
        System.out.println(JSON.toJSONString(smUser));
    }

    @Test
    public void testSelectById() {
        SmUser smUser = smUserMapper.selectById("a3d862ee-4db6-43ef-9233-39adf14a6fa7");
        System.out.println(JSON.toJSONString(smUser));
    }

    @Test
    public void testSelectVById() {
        SmUserVO smUser = smUserMapper.selectVById("a3d862ee-4db6-43ef-9233-39adf14a6fa7");
        System.out.println(JSON.toJSONString(smUser));
    }

    @Test
    public void testExistsWithPrimaryKey() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsert() {
        SmUser smUser = new SmUser();
        smUser.setUsername("admin");
        smUser.setCnName("管理员");
        smUser.setEnName("Administrator");
        smUser.setCreatedBy("00");
        smUser.setModifiedBy("00");
        smUserMapper.insert(smUser);
    }

    @Test
    public void testInsertSelective() {
        SmUser smUser;
        for (int i = 1; i <= 10; i++) {
            smUser = new SmUser();
            smUser.setUsername("user_" + i);
            smUser.setCnName("用户");
            // smUser.setEnName("User");
            smUser.setCreatedBy("00");
            smUser.setModifiedBy("00");
            smUserMapper.insertSelective(smUser);
        }
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

}
