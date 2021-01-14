package com.phoegel.visitor.typical;

public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();
        objectStructure.addElement(elementA);
        objectStructure.addElement(elementB);
        Visitor visitor = new ConcreteVisitor();
        objectStructure.accept(visitor);
    }
}
