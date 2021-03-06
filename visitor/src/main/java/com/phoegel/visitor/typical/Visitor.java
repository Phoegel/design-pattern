package com.phoegel.visitor.typical;

/**
 * 抽象访问者类
 * 抽象访问者为对象结构中每一个具体元素类ConcreteElement声明一个访问操作，
 * 从这个操作的名称或参数类型可以清楚知道需要访问的具体元素的类型，具体访问者需要实现这些操作方法，定义对这些元素的访问操作。
 */
public abstract class Visitor {
    public abstract void visit(ConcreteElementA elementA);

    public abstract void visit(ConcreteElementB elementB);
}
