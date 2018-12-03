package com.feimao.dubbo.provider.service;

import com.feimao.dubbo.contract.service.StubTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StubTestServiceImpl implements StubTestService {

    @Override
    public String timeoutTest() throws InterruptedException {
        log.info("start wait 1500ms");
        Thread.sleep(1500);
        return "impl";
    }

    @Override
    public String throwExceptionTest() {
        log.error("start throw npe");
        throw new NullPointerException();
    }
}
