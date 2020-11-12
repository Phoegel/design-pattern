package com.phoegel.decorator.example;

/**
 * 材料料水
 */
public class Water {
    private int money = 1;
    public Water() {
        System.out.println("加一份水，价格：" + money + "元");
    }

    public int getMoney() {
        return this.money;
    }
}
