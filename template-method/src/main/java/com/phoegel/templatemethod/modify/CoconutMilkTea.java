package com.phoegel.templatemethod.modify;

// 椰果奶茶类，具体子类角色
public class CoconutMilkTea extends MilkTea {
    @Override
    public void putMaterials() {
        System.out.println("加入牛奶");
        System.out.println("加入椰果");
    }
}
