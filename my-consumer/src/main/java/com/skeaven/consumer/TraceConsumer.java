package com.skeaven.consumer;

import com.skeaven.api.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TraceConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/trace-consumer.xml");
        context.start();
        // 获取远程代理并发起调用
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        System.out.println(greetingService.greeting("world"));
    }
}
