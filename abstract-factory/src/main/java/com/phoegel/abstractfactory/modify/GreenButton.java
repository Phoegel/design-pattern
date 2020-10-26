package com.phoegel.abstractfactory.modify;

/**
 * 绿色窗口产品：担当具体产品角色
 */
public class GreenButton implements Button {
    public void click() {
        System.out.println("点击绿色按钮~~");
    }
}
