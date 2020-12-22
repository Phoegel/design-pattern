package com.phoegel.mediator.modify;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象中介者类
 */
public abstract class Mediator {
    private String name;
    // 存放同事类对象
    protected List<Staff> staffList = new ArrayList<>();

    public Mediator(String name) {
        this.name = name;
    }

    // 添加同事类
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    // 与同事类沟通交流
    abstract void communicateWithStaff(String position);

    public String getName() {
        return name;
    }
}
