package com.phoegel.builder.modify;

/**
 * 抽象构造者
 */
public abstract class CarBuilder {
    //创建产品对象
    protected Car car = new Car();

    public abstract void buildSteeringWheel();

    public abstract void buildDoughnut();

    //返回产品对象
    public Car getCar() {
        return car;
    }
}
