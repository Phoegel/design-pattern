package com.phoegel.decorator.example;

/**
 * 材料椰果
 */
public class Coconut {
    private int money = 3;
    public Coconut() {
        System.out.println("加一份椰果，价值格：" + money + "元");
    }

    public int getMoney() {
        return money;
    }
}
