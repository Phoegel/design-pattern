package com.phoegel.strategy.typical;

/**
 * 抽象策略类
 * 它为所支持的算法声明了抽象方法，是所有策略类的父类，它可以是抽象类或具体类，也可以是接口。
 * 环境类通过抽象策略类中声明的方法在运行时调用具体策略类中实现的算法。
 */
public abstract class AbstractStrategy {
    // 声明抽象算法
    public abstract void algorithm();
}
