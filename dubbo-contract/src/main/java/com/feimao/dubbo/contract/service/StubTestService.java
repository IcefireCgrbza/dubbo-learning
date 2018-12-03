package com.feimao.dubbo.contract.service;

public interface StubTestService {

    String timeoutTest() throws InterruptedException;

    String throwExceptionTest();
}
