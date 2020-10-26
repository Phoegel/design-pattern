package com.phoegel.factorymethod.typical;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactoryA();
        Product product = factory.factoryMethod();
    }
}
