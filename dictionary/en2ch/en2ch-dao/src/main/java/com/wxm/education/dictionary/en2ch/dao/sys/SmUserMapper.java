package com.wxm.education.dictionary.en2ch.dao.sys;

import com.wxm.education.dictionary.en2ch.pojo.dataobject.sm.SmUser;
import com.wxm.education.dictionary.en2ch.pojo.dto.sm.SmUserDTO;
import com.wxm.education.dictionary.en2ch.pojo.query.sm.SmUserQuery;
import com.wxm.education.dictionary.en2ch.pojo.vo.sm.SmUserVO;
import com.wxm.mybatis.mapper.common.Mapper;

public interface SmUserMapper extends Mapper<SmUser, SmUserVO, SmUserDTO, SmUserQuery> {

}
