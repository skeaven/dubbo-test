package com.skeaven.provider.trace;

import com.skeaven.api.HelloService;

import java.util.Random;

public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String message) {
        try {
            // 通过 sleep 模拟业务逻辑处理时间
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(1000));
        } catch (InterruptedException e) {
            // no op
        }
        return "hello, " + message;
    }
}
