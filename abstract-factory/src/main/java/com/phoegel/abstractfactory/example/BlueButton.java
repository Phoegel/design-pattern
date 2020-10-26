package com.phoegel.abstractfactory.example;

/**
 * 具体的产品类：蓝色按钮
 */
public class BlueButton implements Button {
    public void click() {
        System.out.println("点击蓝色按钮~~");
    }
}
