package com.phoegel.state.typical;

/**
 * 环境类
 * 环境类又称为上下文类，它是拥有多种状态的对象。
 * 由于环境类的状态存在多样性且在不同状态下对象的行为有所不同，因此将状态独立出去形成单独的状态类。
 * 在环境类中维护一个抽象状态类State的实例，这个实例定义当前状态，在具体实现时，它是一个State子类的对象。
 */
public class Context {
    // 维持一个对抽象状态对象的引用
    private State state;
    // 其他属性值，该属性值的变化可能会导致对象状态发生变化
    private int value;

    // 设置状态对象
    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        // 调用状态对象的业务方法
        state.handle();
        // 其他代码
    }
}
