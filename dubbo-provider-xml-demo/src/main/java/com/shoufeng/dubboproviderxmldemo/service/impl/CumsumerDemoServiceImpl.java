package com.shoufeng.dubboproviderxmldemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shoufeng.api.CumsumerDemoService;

@Service
public class CumsumerDemoServiceImpl implements CumsumerDemoService {
    @Override
    public String sayHello(String name) {
        return "你好啊 " + name;
    }
}
