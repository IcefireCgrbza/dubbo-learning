package com.feimao.dubbo.consumer.controller;

import com.feimao.dubbo.common.response.BaseResponse;
import com.feimao.dubbo.consumer.response.HelloWorldResponse;
import com.feimao.dubbo.contract.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping(value = "/helloworld")
    public BaseResponse helloWorldCall() throws InterruptedException {
        log.info("start invoke hello world service");
        helloWorldService.sayHello();
        log.info("finish invoke hello world service");
        return BaseResponse.newSuccResponse().result(new HelloWorldResponse()).build();
    }
}
