package com.daodao.gulimall.order.dao;

import com.daodao.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lixiaodao
 * @email 601760700@qq.com
 * @date 2024-08-23 02:24:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
