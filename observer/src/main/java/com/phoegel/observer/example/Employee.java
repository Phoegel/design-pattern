package com.phoegel.observer.example;

public class Employee {
    private String name;

    public void work() {
        System.out.println(this.name + "说：老板好");
        System.out.println(this.name + "调整姿势，认真工作中~~");
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
