package com.phoegel.bridge.modify;

/**
 * 具体实现类角色：从 oracle 中读取数据
 */
public class OracleDatabase implements Database {
    public void load() {
        System.out.println("从 oracle 数据库读取数据");
    }
}
