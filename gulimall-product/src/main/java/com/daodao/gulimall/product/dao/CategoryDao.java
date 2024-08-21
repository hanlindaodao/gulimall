package com.daodao.gulimall.product.dao;

import com.daodao.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lixiaodao
 * @email 601760700@qq.com
 * @date 2024-08-21 00:54:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
