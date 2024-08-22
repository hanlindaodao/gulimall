package com.daodao.gulimall.coupon.dao;

import com.daodao.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author lixiaodao
 * @email 601760700@qq.com
 * @date 2024-08-23 01:05:26
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
