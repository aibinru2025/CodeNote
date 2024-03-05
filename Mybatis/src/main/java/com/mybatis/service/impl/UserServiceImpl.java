package com.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.dao.UserDao;
import com.mybatis.entity.UserEntity;
import com.mybatis.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-29 15:16
 * @description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

}
