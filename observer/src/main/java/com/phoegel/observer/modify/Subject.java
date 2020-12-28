package com.phoegel.observer.modify;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    // 保存观察者
    protected List<Observer> observers = new ArrayList<>();

    // 增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    // 通知观察者方法
    public abstract void notifyObserver();
}
