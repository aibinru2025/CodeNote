package com.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 22:23:40
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
