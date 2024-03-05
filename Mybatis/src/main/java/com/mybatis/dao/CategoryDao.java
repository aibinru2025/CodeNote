package com.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-27 11:13
 * @description:
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {


    /**
     * 保存商品类型信息
     * @param params：传入的参数
     * @return 是否保存成功
     */
    boolean saveAll(@Param("params") Map<String,Object> params);



}
