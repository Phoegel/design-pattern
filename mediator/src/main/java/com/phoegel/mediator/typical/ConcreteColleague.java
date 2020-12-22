package com.phoegel.mediator.typical;

/**
 * 它是抽象同事类的子类；
 * 每一个同事对象在需要和其他同事对象通信时，先与中介者通信，通过中介者来间接完成与其他同事类的通信；
 * 在具体同事类中实现了在抽象同事类中声明的抽象方法。
 */
public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void method1() {
        // 实现自身方法
    }
}
