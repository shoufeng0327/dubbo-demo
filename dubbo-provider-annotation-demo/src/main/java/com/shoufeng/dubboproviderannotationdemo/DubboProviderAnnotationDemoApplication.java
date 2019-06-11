package com.shoufeng.dubboproviderannotationdemo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboProviderAnnotationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderAnnotationDemoApplication.class, args);
    }

}
