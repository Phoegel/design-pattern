package com.phoegel.command.modify;

/**
 * 客户实用类
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void orderStirFry(String dishName, Waiter waiter) {
        System.out.println(this.name + "点了炒菜：" + dishName);
        waiter.orderDish(dishName);
    }

    public void orderColdDishes(String dishName, Waiter waiter) {
        System.out.println(this.name + "点了凉菜：" + dishName);
        waiter.orderDish(dishName);
    }
}
