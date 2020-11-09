package com.phoegel.bridge.modify;

/**
 * 具体实现类角色：从 mysql 中读取数据
 */
public class MysqlDatabase implements Database {
    public void load() {
        System.out.println("从 mysql 数据库读取数据");
    }
}
