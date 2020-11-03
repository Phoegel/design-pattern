package com.phoegel.builder.modify;

/**
 * 客户端通过指挥者来获取汽车
 */
public class Main {
    public static void main(String[] args) {
        // 制造汽车
        Car car1 = new Director(new SedanCarBuilder()).create();
        System.out.println(car1);
        // 制造货车
        Car car2 = new Director(new FreightCarBuilder()).create();
        System.out.println(car2);
    }
}
