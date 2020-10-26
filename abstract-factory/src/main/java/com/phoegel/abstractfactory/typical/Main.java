package com.phoegel.abstractfactory.typical;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactoryA();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
    }
}
