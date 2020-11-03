package com.phoegel.builder.modify;

/**
 * 具体构造者：构造货车
 */
public class FreightCarBuilder extends CarBuilder {
    public void buildSteeringWheel() {
        car.setSteeringWheel(new SteeringWheel("大号", "三幅"));
    }

    public void buildDoughnut() {
        car.setDoughnut(new Doughnut("大号", "货车轮胎"));
    }
}
