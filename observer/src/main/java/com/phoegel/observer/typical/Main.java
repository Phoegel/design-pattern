package com.phoegel.observer.typical;

public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.attach(observer);
        subject.notifySubject();
    }
}
