package com.feimao.dubbo.contract.service;

public interface MockTestService {

    String timeoutTest() throws InterruptedException;

    String throwExceptionTest();
}
