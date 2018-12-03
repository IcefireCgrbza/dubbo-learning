package com.feimao.dubbo.consumer.stub;

import com.feimao.dubbo.contract.service.StubTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StubTestServiceStub implements StubTestService {

    private final StubTestService stubTestService;

    public StubTestServiceStub(StubTestService stubTestService) {
        this.stubTestService = stubTestService;
    }

    @Override
    public String timeoutTest() throws InterruptedException {
        log.info("before call stubTestService");
        String result = stubTestService.timeoutTest();
        log.info("after call stubTestService");
        return result;
    }

    @Override
    public String throwExceptionTest() {
        log.info("before call stubTestService");
        try {
            return stubTestService.throwExceptionTest();
        } catch (NullPointerException npe) {
            log.error("npe: ", npe);
        }
        log.info("after call stubTestService");
        return "stub";
    }
}
