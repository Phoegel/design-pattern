package com.phoegel.observer.modify;

import java.util.Observable;

public class BossObservable extends Observable {
    private String name;

    public BossObservable(String name) {
        this.name = name;
    }

    public void inspect() {
        System.out.println("老板" + this.name + "来巡查工作~~");
        System.out.println("老板说：大家好~~");
        // 设置状态已改变才会通知到观察者
        super.setChanged();
        // 通知注册的观察者
        super.notifyObservers();
    }

    public String getName() {
        return name;
    }
}
