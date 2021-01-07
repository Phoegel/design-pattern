package com.phoegel.strategy.example;

public class Main {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        int money = 100;
        consumer.pay(money);
        consumer.setPayType("WeChatPay");
        consumer.pay(money);
        consumer.setPayType("BankCardPay");
        consumer.pay(money);
    }
}
