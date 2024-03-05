package com.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mybatis.entity.OrderEntity;
import com.mybatis.utils.PageUtils;

import java.util.Map;

/**
 * 订单
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 22:23:40
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

