package com.phoegel.builder.example;

public class Main {
    public static void main(String[] args) {
        // 生成一个轿车
        // 制造汽车方向盘
        SteeringWheel steeringWheel1 = new SteeringWheel("中号", "三幅");
        // 制造轮胎
        Doughnut doughnut1 = new Doughnut("中号", "轿车轮胎");
        // 制造汽车
        Car car1 = new Car();
        car1.setSteeringWheel(steeringWheel1);
        car1.setDoughnut(doughnut1);
        System.out.println(car1);

        // 生成一个货车
        SteeringWheel steeringWheel2 = new SteeringWheel("大号", "三幅");
        // 制造轮胎
        Doughnut doughnut2 = new Doughnut("大号", "货车轮胎");
        // 制造汽车
        Car car2 = new Car();
        car2.setSteeringWheel(steeringWheel2);
        car2.setDoughnut(doughnut2);
        System.out.println(car2);
    }
}
