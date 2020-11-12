package com.phoegel.decorator.example;

/**
 * 材料珍珠
 */
public class Pearl {
    private int money = 3;
    public Pearl() {
        System.out.println("加一份珍珠，价值格：" + money + "元");
    }

    public int getMoney() {
        return money;
    }
}
