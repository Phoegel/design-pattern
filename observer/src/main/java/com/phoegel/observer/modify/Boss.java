package com.phoegel.observer.modify;

public class Boss extends Subject {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public void inspect() {
        System.out.println("老板" + this.name + "来巡查工作~~");
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        System.out.println("老板说：大家好~~");
        for (Observer observer : observers) {
            observer.work();
        }
    }

    public String getName() {
        return name;
    }
}
