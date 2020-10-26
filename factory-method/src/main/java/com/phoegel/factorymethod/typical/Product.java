package com.phoegel.factorymethod.typical;

/**
 * 抽象产品类
 * 它是定义产品的接口，是工厂方法模式所创建对象的超类型，也就是产品对象的公共父类。
 */
public abstract class Product {
    // 所有产品类的公共业务方法
    public void methodSame() {
        // 公共方法的实现
    }

    // 声明抽象业务方法
    public abstract void methodDiff();
}
