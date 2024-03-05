package com.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-29 15:08
 * @description:
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

    /**
     * 根据id查询用户
     */
    public UserEntity queryByUserId(Integer id);


}
