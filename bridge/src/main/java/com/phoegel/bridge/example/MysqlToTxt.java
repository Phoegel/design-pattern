package com.phoegel.bridge.example;

/**
 * 从 mysql 读取数据后转化为 txt 格式的文件类
 */
public class MysqlToTxt extends TxtFile {
    @Override
    public void translate() {
        System.out.println("从 mysql 数据库读取数据");
        super.translate();
    }
}
