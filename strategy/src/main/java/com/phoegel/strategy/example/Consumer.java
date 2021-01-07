package com.phoegel.strategy.example;

// 消费者类
public class Consumer {
    // 设置默认支付方式
    private String payType = "AliPay";

    public void pay(int money) {
        if ("AliPay".equals(payType)) {
            System.out.println("使用支付宝支付~~");
            // 调用支付宝支付接口。。。
            System.out.println("扣款成功，消费：" + money + "元");
        } else if ("WeChatPay".equals(payType)) {
            System.out.println("使用微信支付~~");
            // 调用微信支付接口。。。
            System.out.println("扣款成功，消费：" + money + "元");
        } else if ("BankCardPay".equals(payType)) {
            System.out.println("使用银行卡支付~~");
            // 调用银行卡支付接口。。。
            System.out.println("扣款成功，消费：" + money + "元");
        }
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }
}
