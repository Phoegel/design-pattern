package com.phoegel.observer.modify;

import java.util.Observable;
import java.util.Observer;

public class EmployeeObserver implements Observer {
    private String name;

    public EmployeeObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + "说：老板好");
        System.out.println(this.name + "调整姿势，认真工作中~~");
    }

    public String getName() {
        return name;
    }
}
