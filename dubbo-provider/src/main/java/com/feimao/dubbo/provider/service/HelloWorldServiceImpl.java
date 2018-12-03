package com.feimao.dubbo.provider.service;

import com.feimao.dubbo.contract.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public void sayHello() {
        log.info("hello world!");
    }
}
