package com.phoegel.simplefactory.example;


/**
 * 文件记录器
 */
public class FileLogger implements Logger {

    @Override
    public void log(String info) {
        System.out.println("文件记录:" + info);
    }
}
