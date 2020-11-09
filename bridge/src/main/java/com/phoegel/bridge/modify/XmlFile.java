package com.phoegel.bridge.modify;

/**
 * 扩充抽象类角色：xml 文件格式类
 */
public class XmlFile extends File {
    public void translate() {
        dataBase.load();
        System.out.println("转化为 xml 文件格式");
    }
}
