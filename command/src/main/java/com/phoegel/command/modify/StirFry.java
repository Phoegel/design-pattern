package com.phoegel.command.modify;

/**
 * 炒菜类：具体命令类角色
 */
public class StirFry implements Dish {
    private Chef chef;

    public StirFry(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void order(String dishName) {
        // 调用实际接收者的动作
        chef.cookStirFry(dishName);
    }
}
