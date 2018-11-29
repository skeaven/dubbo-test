package com.skeaven.provider.trace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingApplication {
    /**
     * To get ipv6 address to work, add
     * System.setProperty("java.net.preferIPv6Addresses", "true");
     * before running your application.
     */
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/greeting-service.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }

}
