package com.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.dao.CategoryDao;
import com.mybatis.entity.CategoryEntity;
import com.mybatis.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-27 11:13
 * @description:
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

}
