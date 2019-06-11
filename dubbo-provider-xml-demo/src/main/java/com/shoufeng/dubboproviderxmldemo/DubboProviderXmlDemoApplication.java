package com.shoufeng.dubboproviderxmldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = "classpath:provider.xml")
@SpringBootApplication
public class DubboProviderXmlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderXmlDemoApplication.class, args);
    }

}
