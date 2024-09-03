package com.daodao.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    public void testUploadUseStarter() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("D:\\daodao\\bilibili\\谷粒商城资料整理课件\\基础篇\\资料\\pics\\xiaomi.png");
        ossClient.putObject("gulimall-daodao", "xiaomi2.png", inputStream);
        ossClient.shutdown();
        System.out.println("上传完成了...");
    }

    @Test
    public void contextLoads() {
    }

}
