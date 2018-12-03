package com.feimao.dubbo.consumer.mock;

import com.feimao.dubbo.contract.service.MockTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MockTestServiceMock implements MockTestService {

    @Override
    public String timeoutTest() throws InterruptedException {
        log.info("mock timeout");
        return "mock";
    }

    @Override
    public String throwExceptionTest() {
        log.info("mock runtime exception");
        return "mock";
    }
}
