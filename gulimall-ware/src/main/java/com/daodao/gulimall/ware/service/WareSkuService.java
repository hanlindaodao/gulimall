package com.daodao.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daodao.common.utils.PageUtils;
import com.daodao.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author lixiaodao
 * @email 601760700@qq.com
 * @date 2024-08-23 02:30:03
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

