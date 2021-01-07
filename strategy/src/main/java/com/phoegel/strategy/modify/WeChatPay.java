package com.phoegel.strategy.modify;

// 微信支付，具体策略类角色
public class WeChatPay implements Pay {
    @Override
    public void deduction(int money) {
        System.out.println("使用微信支付~~");
        // 调用微信支付接口。。。
        System.out.println("扣款成功，消费：" + money + "元");
    }
}
