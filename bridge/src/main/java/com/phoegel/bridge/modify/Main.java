package com.phoegel.bridge.modify;

public class Main {
    public static void main(String[] args) {
        File file = new TxtFile();
        file.setDataBase(new MysqlDatabase());
        file.translate();
        System.out.println("------------------------");
        file.setDataBase(new OracleDatabase());
        file.translate();
        System.out.println("------------------------");
        file = new XmlFile();
        file.setDataBase(new MysqlDatabase());
        file.translate();
        System.out.println("------------------------");
        file.setDataBase(new OracleDatabase());
        file.translate();
    }
}
