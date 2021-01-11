package com.phoegel.templatemethod.modify;

// 红茶类，具体子类角色
public class BlackTea extends MilkTea {
    @Override
    public void putMaterials() {
        System.out.println("加入红茶");
        System.out.println("加入水");
    }
}
