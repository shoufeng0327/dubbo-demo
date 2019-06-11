package com.shoufeng.dubboconsumerxmldemo.controller;

import com.shoufeng.api.CumsumerDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerXmlDemoController {

    @Autowired
    private CumsumerDemoService cumsumerDemoService;

    @GetMapping("/")
    public void test(){
        System.out.println(cumsumerDemoService.sayHello("张三"));
    }
}
