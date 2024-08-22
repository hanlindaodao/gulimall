package com.daodao.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存工作单详情
 * 
 * @author lixiaodao
 * @email 601760700@qq.com
 * @date 2024-08-23 02:30:04
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * 购买个数
	 */
	private Integer skuNum;
	/**
	 * 工作单id
	 */
	private Long taskId;
	/**
	 * 库存id
	 */
	private Long wareId;
	/**
	 * 锁定状态 1-锁定 2-解锁 3-扣减
	 */
	private Integer lockStatus;

}
