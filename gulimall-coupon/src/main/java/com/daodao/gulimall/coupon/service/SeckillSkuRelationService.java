package com.daodao.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daodao.common.utils.PageUtils;
import com.daodao.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author lixiaodao
 * @email 601760700@qq.com
 * @date 2024-08-23 01:05:25
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

