package com.phoegel.factorymethod.typical;

/**
 * 具体工厂类
 * 它是抽象工厂类的子类，实现了抽象工厂中定义的工厂方法，并可由客户端调用，返回一个具体产品类的实例。
 */
public class ConcreteFactoryB implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
