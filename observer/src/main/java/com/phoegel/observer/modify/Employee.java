package com.phoegel.observer.modify;

public class Employee implements Observer {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(this.name + "说：老板好");
        System.out.println(this.name + "调整姿势，认真工作中~~");
    }

    public String getName() {
        return name;
    }
}
