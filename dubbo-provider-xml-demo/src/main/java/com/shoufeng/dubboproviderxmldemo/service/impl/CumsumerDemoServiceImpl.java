package com.shoufeng.dubboproviderxmldemo.service.impl;

import com.shoufeng.api.ConsumerDemoService;

//@Service
public class CumsumerDemoServiceImpl implements ConsumerDemoService {
    @Override
    public String sayHello(String name) {
        return "xml: 你好啊 " + name;
    }
}
