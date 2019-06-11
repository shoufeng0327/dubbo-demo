package com.shoufeng.dubboconsumerannotationdemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shoufeng.api.ConsumerDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Reference
    private ConsumerDemoService consumerDemoService;

    @GetMapping("/")
    public void test(){
        System.out.println(consumerDemoService.sayHello("王五"));
    }
}
