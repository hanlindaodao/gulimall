package com.daodao.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author lixiaodao
 * @email 601760700@qq.com
 * @date 2024-08-23 02:24:11
 */
@Data
@TableName("mq_message")
public class MqMessageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 消息id
	 */
	@TableId
	private String messageId;
	/**
	 * 消息内容json格式
	 */
	private String content;
	/**
	 * 发送的交换机
	 */
	private String toExchane;
	/**
	 * 路由键
	 */
	private String routingKey;
	/**
	 * 类型
	 */
	private String classType;
	/**
	 * 0-新建 1-已发送 2-错误抵达 3-已抵达
	 */
	private Integer messageStatus;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
