package com.phoegel.decorator.modify;

/**
 * 具体构件类角色
 */
public class Water implements Material {
    private int money = 1;

    public Water() {
        System.out.println("加一份水，价格：" + money + "元");
    }

    // 这里实现接口中的方法，返回自身的价格
    public int sum() {
        return this.getMoney();
    }

    public int getMoney() {
        return money;
    }
}
