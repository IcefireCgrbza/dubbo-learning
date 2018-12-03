package com.feimao.dubbo.consumer.controller;

import com.feimao.dubbo.common.response.BaseResponse;
import com.feimao.dubbo.contract.service.RetryTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RetryTestController {

    @Autowired
    private RetryTestService retryTestService;

    @GetMapping(value = "/retrytest")
    public BaseResponse retryTestCall() throws InterruptedException {
        log.info("start invoke retry test service");
        retryTestService.randomWait();
        log.info("finish invoke retry test service");
        return BaseResponse.newSuccResponse().build();
    }
}
