package com.feimao.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo/*")
public class DubboComsumerContext {

    public static void main(String[] args) {
        SpringApplication.run(DubboComsumerContext.class, args);
    }
}
