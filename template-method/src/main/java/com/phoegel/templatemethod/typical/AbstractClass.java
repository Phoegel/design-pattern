package com.phoegel.templatemethod.typical;

/**
 * 抽象类
 * 在抽象类中定义了一系列基本操作(PrimitiveOperations)，这些基本操作可以是具体的，也可以是抽象的，
 * 每一个基本操作对应算法的一个步骤，在其子类中可以重定义或实现这些步骤。
 * 同时，在抽象类中实现了一个模板方法(Template Method)，用于定义一个算法的框架，
 * 模板方法不仅可以调用在抽象类中实现的基本方法，也可以调用在抽象类的子类中实现的基本方法，还可以调用其他对象中的方法。
 */
public abstract class AbstractClass {
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        primitiveOperation3();
    }

    // 基本方法—具体方法
    public void primitiveOperation1() {
        // 实现代码
    }

    // 基本方法—抽象方法
    public abstract void primitiveOperation2();

    // 基本方法—钩子方法
    public void primitiveOperation3() {
    }
}
