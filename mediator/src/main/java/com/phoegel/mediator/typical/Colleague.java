package com.phoegel.mediator.typical;

/**
 * 它定义各个同事类公有的方法，并声明了一些抽象方法来供子类实现，同时它维持了一个对抽象中介者类的引用，其子类可以通过该引用来与中介者通信。
 */
public abstract class Colleague {
    // 维持一个抽象中介者的引用
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    // 声明自身方法，处理自己的行为
    public abstract void method1();

    // 定义依赖方法，与中介者进行通信
    public void method2() {
        mediator.operation();
    }
}
