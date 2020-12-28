package com.phoegel.observer.example;

public class Boss {
    private String name;

    public void inspect() {
        System.out.println("老板" + this.name + "来巡查工作~~");
        System.out.println("老板说：大家好");
    }

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
