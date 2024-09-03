package com.daodao.gulimall.product;

// 换到第三方服务里了,所以这里注释掉了,不用了
//import com.aliyun.oss.OSS;
//import com.aliyun.oss.OSSClient;
//import com.aliyun.oss.OSSClientBuilder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.daodao.gulimall.product.entity.BrandEntity;
import com.daodao.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

/*
	@Autowired
	OSSClient ossClient;

	@Test
	public void testUploadUseStarter() throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("D:\\daodao\\bilibili\\谷粒商城资料整理课件\\基础篇\\资料\\pics\\xiaomi.png");
		ossClient.putObject("gulimall-daodao", "xiaomi.png", inputStream);
		ossClient.shutdown();
		System.out.println("上传完成了...");
	}

	@Test
	public void testUpload() throws FileNotFoundException {
		// Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
		String endpoint = "oss-cn-beijing.aliyuncs.com";
		// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常
		String accessKeyId = "LTAI5t9X16vH8XuwoJYyRxkB";
		String accessKeySecret = "hwsyWPm4lWvQKCG1zpVFMTTYAjmNoa";

		// 创建OSSClient实例
		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

		// 上传文件流
		InputStream inputStream = new FileInputStream("D:\\daodao\\bilibili\\谷粒商城资料整理课件\\基础篇\\资料\\pics\\huawei.png");
		ossClient.putObject("gulimall-daodao", "huawei.png", inputStream);

		// 关闭OSSClient
		ossClient.shutdown();

		System.out.println("上传成功...");
	}
*/
	@Test
	public void contextLoads() {

//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setBrandId(32L);
//		brandEntity.setDescript("huawei");

//		brandEntity.setName("华为");
//		brandService.save(brandEntity);
//		System.out.println("保存成功....");
//		brandService.updateById(brandEntity);


		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 32L));
		list.forEach(System.out::println);
	}

}
