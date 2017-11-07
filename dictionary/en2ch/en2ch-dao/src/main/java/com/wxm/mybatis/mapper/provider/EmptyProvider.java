package com.wxm.mybatis.mapper.provider;

import com.wxm.mybatis.mapper.mapperhelper.MapperHelper;
import com.wxm.mybatis.mapper.mapperhelper.MapperTemplate;

/**
 * 
 * <b>Title:</b> 空方法Mapper接口默认MapperTemplate<br>
 * <b>Description:</b> 如BaseSelectMapper，接口纯继承，不包含任何方法<br>
 * <b>Date:</b> 2017年11月7日 下午4:46:54<br>
 * 
 * @author wuxm
 * @version 1.0.0
 */
public class EmptyProvider extends MapperTemplate {

    public EmptyProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    @Override
    public boolean supportMethod(String msId) {
        return false;
    }
}
