package com.shoufeng.dubboconsumerannotationdemo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboConsumerAnnotationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerAnnotationDemoApplication.class, args);
    }

}
