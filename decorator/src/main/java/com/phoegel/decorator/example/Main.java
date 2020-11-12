package com.phoegel.decorator.example;

/**
 * 模拟买一杯珍珠椰果奶茶
 */
public class Main {
    public static void main(String[] args) {
        // 奶茶的默认必备材料：水
        Water water = new Water();
        // 加入牛奶
        Milk milk = new Milk();
        // 加入珍珠
        Pearl pearl = new Pearl();
        // 加入椰果
        Coconut coconut = new Coconut();
        // 计算价格
        int total = water.getMoney() + milk.getMoney() + pearl.getMoney() + coconut.getMoney();
        System.out.println("总价格：" + total + "元");
    }
}
