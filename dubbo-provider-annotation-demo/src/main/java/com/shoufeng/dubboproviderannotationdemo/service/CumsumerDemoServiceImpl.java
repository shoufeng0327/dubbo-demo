package com.shoufeng.dubboproviderannotationdemo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.shoufeng.api.ConsumerDemoService;

@Service
public class CumsumerDemoServiceImpl implements ConsumerDemoService {

    @Override
    public String sayHello(String name) {
        return "annotation: 你好啊 " + name;
    }

}

