package com.daodao.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daodao.common.utils.PageUtils;
import com.daodao.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单详情
 *
 * @author lixiaodao
 * @email 601760700@qq.com
 * @date 2024-08-23 02:30:04
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

