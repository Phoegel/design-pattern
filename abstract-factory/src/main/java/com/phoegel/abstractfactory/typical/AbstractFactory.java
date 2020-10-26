package com.phoegel.abstractfactory.typical;

/**
 * 抽象工厂类
 * 它声明了一组用于创建一族产品的方法，每一个方法对应一种产品。
 */
public abstract class AbstractFactory {
    // 工厂方法一
    public abstract AbstractProductA createProductA();
    // 工厂方法二
    public abstract AbstractProductB createProductB();
}
