package com.phoegel.command.modify;

/**
 * 厨师类：接收者角色
 */
public class Chef {
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public void cookStirFry(String dishName) {
        System.out.println("厨师：" + this.name + "\t做炒菜：" + dishName);
    }

    public void cookColdDish(String dishName) {
        System.out.println("厨师：" + this.name + "\t做凉菜：" + dishName);
    }
}
