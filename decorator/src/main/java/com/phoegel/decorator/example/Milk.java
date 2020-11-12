package com.phoegel.decorator.example;

/**
 * 材料牛奶
 */
public class Milk {
    private int money = 2;
    public Milk() {
        System.out.println("加一份牛奶，价值格：" + money + "元");
    }

    public int getMoney() {
        return money;
    }
}
