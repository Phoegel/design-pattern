package com.phoegel.simplefactory.example;


/**
 * 控制台记录器
 */
public class ConsoleLogger implements Logger {

    @Override
    public void log(String info) {
        System.out.println("控制台记录:" + info);
    }
}
