package com.phoegel.command.modify;

/**
 * 服务员类：请求者角色
 */
public class Waiter {
    private String name;
    private Dish dish;

    public Waiter(String name) {
        this.name = name;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public void orderDish(String dishName) {
        this.dish.order(dishName);
    }
}
