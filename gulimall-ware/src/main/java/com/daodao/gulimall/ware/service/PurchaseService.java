package com.daodao.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daodao.common.utils.PageUtils;
import com.daodao.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author lixiaodao
 * @email 601760700@qq.com
 * @date 2024-08-23 02:30:04
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

