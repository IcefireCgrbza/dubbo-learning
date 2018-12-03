package com.feimao.dubbo.provider.service;

import com.feimao.dubbo.contract.service.RetryTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RetryTestServiceImpl implements RetryTestService {

    @Override
    public void randomWait() throws InterruptedException {
        if (Math.random() > 0.5) {
            Thread.sleep(1500);
            log.info("wait 1500ms");
        } else {
            log.info("direct return");
        }
    }
}
