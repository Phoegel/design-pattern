package com.phoegel.strategy.modify;

public class Main {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        int money = 100;
        consumer.pay(money);
        consumer.setPay(new WeChatPay());
        consumer.pay(money);
        consumer.setPay(new BankCardPay());
        consumer.pay(money);
    }
}
