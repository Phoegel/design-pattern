package com.phoegel.visitor.typical;

/**
 * 具体访问者类
 * 具体访问者实现了每个由抽象访问者声明的操作，每一个操作用于访问对象结构中一种类型的元素。
 */
public class ConcreteVisitor extends Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        // 元素ConcreteElementA操作代码
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        // 元素ConcreteElementB操作代码
    }
}
