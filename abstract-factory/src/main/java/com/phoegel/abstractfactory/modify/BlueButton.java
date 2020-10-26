package com.phoegel.abstractfactory.modify;

/**
 * 蓝色按钮产品：担当具体产品角色
 */
public class BlueButton implements Button {
    public void click() {
        System.out.println("点击蓝色按钮~~");
    }
}
