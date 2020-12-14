package com.phoegel.command.modify;

/**
 * 凉拌菜类：具体命令类角色
 */
public class ColdDish implements Dish {
    private Chef chef;

    public ColdDish(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void order(String dishName) {
        // 调用实际接收者的动作
        chef.cookColdDish(dishName);
    }
}
