package com.phoegel.responsibility.typical;

public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandler();
        Handler handlerB = new ConcreteHandler();
        handlerA.setSuccessor(handlerB);
        Handler handlerC = new ConcreteHandler();
        handlerB.setSuccessor(handlerC);
        handlerA.handleRequest(null);
    }
}
