package com.feimao.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo/*")
public class DubboProviderContext {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderContext.class, args);
    }
}
