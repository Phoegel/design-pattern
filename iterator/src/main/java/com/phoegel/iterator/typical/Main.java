package com.phoegel.iterator.typical;

public class Main {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }
}
