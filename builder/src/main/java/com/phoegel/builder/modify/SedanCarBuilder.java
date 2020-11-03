package com.phoegel.builder.modify;

/**
 * 具体构造者：构造小轿车
 */
public class SedanCarBuilder extends CarBuilder {
    public void buildSteeringWheel() {
        car.setSteeringWheel(new SteeringWheel("中号", "三幅"));
    }

    public void buildDoughnut() {
        car.setDoughnut(new Doughnut("中号", "轿车轮胎"));
    }
}
