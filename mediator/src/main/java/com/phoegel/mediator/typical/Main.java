package com.phoegel.mediator.typical;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ConcreteColleague(mediator);
        Colleague colleagueB = new ConcreteColleague(mediator);
        colleagueA.method2();
        colleagueB.method2();
    }
}
