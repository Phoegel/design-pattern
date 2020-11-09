package com.phoegel.bridge.modify;

/**
 * 扩充抽象类角色：txt 文件格式类
 */
public class TxtFile extends File {
    public void translate() {
        dataBase.load();
        System.out.println("转化为 txt 文件格式");
    }
}
