package com.daodao.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daodao.common.utils.PageUtils;
import com.daodao.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lixiaodao
 * @email 601760700@qq.com
 * @date 2024-08-23 02:24:10
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

