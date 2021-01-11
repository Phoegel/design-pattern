package com.phoegel.templatemethod.modify;

// 抽象奶茶类，抽象类角色
public abstract class MilkTea {
    // 模板方法
    public void makeMilkTea() {
        System.out.println("准备调制杯");
        putMaterials();
        System.out.println("调制奶茶");
        System.out.println("包装入奶茶杯");
    }

    // 抽象方法，需子类实现具体细节
    public abstract void putMaterials();
}
