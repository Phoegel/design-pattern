package com.phoegel.strategy.modify;

// 银行卡支付，具体策略类角色
public class BankCardPay implements Pay {
    @Override
    public void deduction(int money) {
        System.out.println("使用银行卡支付~~");
        // 调用银行卡支付接口。。。
        System.out.println("扣款成功，消费：" + money + "元");
    }
}
