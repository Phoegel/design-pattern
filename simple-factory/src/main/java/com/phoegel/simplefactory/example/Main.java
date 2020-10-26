package com.phoegel.simplefactory.example;

import java.util.Scanner;

/**
 * 客户端使用日志记录器
 */
public class Main {
    public static void main(String[] args) {
        // 客户端输入一个类型
        System.out.println("请输入记录类型：\nconsole:控制台记录\tfile:文件记录");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        Logger logger;
        if ("console".equalsIgnoreCase(type)) {
            System.out.println("初始化控制台记录器");
            logger = new ConsoleLogger();
        } else if ("file".equalsIgnoreCase(type)) {
            System.out.println("初始化文件记录器");
            logger = new FileLogger();
        } else {
            throw new RuntimeException("选择的记录器不存在");
        }
        logger.log("今天天气真好");
    }
}
