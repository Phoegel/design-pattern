package com.phoegel.decorator.modify;

/**
 * 具体装饰类
 */
public class Coconut extends Batching {
    private int money = 3;

    public Coconut(Material material) {
        super(material);
        System.out.println("加一份椰果，价值格：" + money + "元");
    }

    // 重写抽象类中的方法，主要是做一些额外的操作，在这里是用于返回自身的价格
    public int sum() {
        return super.sum() + this.getMoney();
    }

    public int getMoney() {
        return money;
    }
}
