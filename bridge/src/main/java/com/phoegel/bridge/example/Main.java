package com.phoegel.bridge.example;

/**
 * 测试类
 */
public class Main {
    public static void main(String[] args) {
        File file = new MysqlToTxt();
        file.translate();
        System.out.println("------------------------");
        file = new MysqlToXml();
        file.translate();
        System.out.println("------------------------");
        file = new OracleToTxt();
        file.translate();
        System.out.println("------------------------");
        file = new OracleToXml();
        file.translate();
    }
}
