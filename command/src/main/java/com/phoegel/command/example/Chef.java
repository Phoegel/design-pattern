package com.phoegel.command.example;

/**
 * 厨师类
 */
public class Chef {
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    // 做炒菜
    public void cookStirFry(String dishName){
        System.out.println("厨师：" + this.name + "\t做炒菜：" + dishName);
    }

    // 做凉菜
    public void cookColdDish(String dishName){
        System.out.println("厨师：" + this.name + "\t做凉菜：" + dishName);
    }
}
