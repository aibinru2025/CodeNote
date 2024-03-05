package com.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mybatis.entity.OrderItemEntity;
import com.mybatis.utils.PageUtils;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:49:53
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

