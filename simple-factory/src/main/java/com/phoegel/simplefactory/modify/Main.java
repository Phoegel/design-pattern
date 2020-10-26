package com.phoegel.simplefactory.modify;

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
        Logger logger = LoggerFactory.getLogger(type);
        logger.log("今天天气真好");
    }
}
