package com.phoegel.strategy.modify;

// 支付宝支付，具体策略类角色
public class AliPay implements Pay {
    @Override
    public void deduction(int money) {
        System.out.println("使用支付宝支付~~");
        // 调用支付宝支付接口。。。
        System.out.println("扣款成功，消费：" + money + "元");
    }
}
