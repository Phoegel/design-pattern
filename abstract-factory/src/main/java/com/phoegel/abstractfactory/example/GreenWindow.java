package com.phoegel.abstractfactory.example;

/**
 * 具体的产品类：绿色窗口
 */
public class GreenWindow implements Window {
    public void show() {
        System.out.println("显示绿色窗口~~");
    }
}
