package com.phoegel.strategy.modify;

// 消费者类，环境类角色
public class Consumer {
    // 设置默认支付方式
    private Pay pay = new AliPay();

    public void pay(int money) {
        pay.deduction(money);
    }

    // 切换支付方式
    public void setPay(Pay pay) {
        this.pay = pay;
    }
}
