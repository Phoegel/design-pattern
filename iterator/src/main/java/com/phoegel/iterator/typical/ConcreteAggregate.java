package com.phoegel.iterator.typical;

/**
 * 它实现了在抽象聚合类中声明的createIterator()方法，该方法返回一个与该具体聚合类对应的具体迭代器ConcreteIterator实例。
 */
public class ConcreteAggregate implements Aggregate {
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
