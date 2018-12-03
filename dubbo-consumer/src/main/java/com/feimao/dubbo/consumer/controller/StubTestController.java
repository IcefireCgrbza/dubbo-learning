package com.feimao.dubbo.consumer.controller;

import com.feimao.dubbo.common.response.BaseResponse;
import com.feimao.dubbo.contract.service.StubTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StubTestController {

    @Autowired
    private StubTestService stubTestService;

    @GetMapping(value = "/stubtest/timeout")
    public BaseResponse mockTestTimeoutCall() throws InterruptedException {
        log.info("start invoke stub test service");
        String result = stubTestService.timeoutTest();
        log.info("finish invoke stub test service");
        return BaseResponse.newSuccResponse().result(result).build();
    }

    @GetMapping(value = "/stubtest/exception")
    public BaseResponse mockTestExceptionCall() throws InterruptedException {
        log.info("start invoke stub test service");
        String result = stubTestService.throwExceptionTest();
        log.info("finish invoke stub test service");
        return BaseResponse.newSuccResponse().result(result).build();
    }
}
