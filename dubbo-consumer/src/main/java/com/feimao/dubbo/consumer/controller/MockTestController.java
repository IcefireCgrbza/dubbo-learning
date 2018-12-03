package com.feimao.dubbo.consumer.controller;

import com.feimao.dubbo.common.response.BaseResponse;
import com.feimao.dubbo.contract.service.MockTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MockTestController {

    @Autowired
    private MockTestService mockTestService;

    @GetMapping(value = "/mocktest/timeout")
    public BaseResponse mockTestTimeoutCall() throws InterruptedException {
        log.info("start invoke mock test service");
        String result = mockTestService.timeoutTest();
        log.info("finish invoke mock test service");
        return BaseResponse.newSuccResponse().result(result).build();
    }

    @GetMapping(value = "/mocktest/exception")
    public BaseResponse mockTestExceptionCall() throws InterruptedException {
        log.info("start invoke mock test service");
        String result = mockTestService.throwExceptionTest();
        log.info("finish invoke mock test service");
        return BaseResponse.newSuccResponse().result(result).build();
    }
}
