package com.phoegel.command.example;

/**
 * 顾客类
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    // 点炒菜
    public void orderStirFry(String dishName, Chef chef){
        System.out.println(this.name + "点了炒菜：" + dishName);
        chef.cookStirFry(dishName);
    }

    // 点凉菜
    public void orderColdDish(String dishName, Chef chef){
        System.out.println(this.name + "点了凉菜：" + dishName);
        chef.cookColdDish(dishName);
    }
}
