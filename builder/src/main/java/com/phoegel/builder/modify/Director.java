package com.phoegel.builder.modify;

/**
 * 指挥者负责汽车的安装过程
 */
public class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public Car create() {
        builder.buildSteeringWheel();
        builder.buildDoughnut();
        return builder.getCar();
    }
}
