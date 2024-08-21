package com.daodao.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.daodao.gulimall.product.entity.BrandEntity;
import com.daodao.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

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
