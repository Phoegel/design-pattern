package com.phoegel.visitor.typical;

/**
 * 具体元素类
 * 具体元素实现了accept()方法，在accept()方法中调用访问者的访问方法以便完成对一个元素的操作。
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
