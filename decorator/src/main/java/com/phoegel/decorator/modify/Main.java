package com.phoegel.decorator.modify;

/**
 * 模拟点一杯珍珠椰果奶茶
 */
public class Main {
    public static void main(String[] args) {
        Coconut coconut = new Coconut(new Coconut(new Pearl(new Milk(new Water()))));
        System.out.println("总价格：" + coconut.sum());
    }
}
