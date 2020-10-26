package com.phoegel.abstractfactory.example;

/**
 * 具体的产品类：绿色按钮
 */
public class GreenButton implements Button {
    public void click() {
        System.out.println("点击绿色按钮~~");
    }
}
