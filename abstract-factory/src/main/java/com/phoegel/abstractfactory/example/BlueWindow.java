package com.phoegel.abstractfactory.example;

/**
 * 具体的产品类：蓝色窗口
 */
public class BlueWindow implements Window {
    public void show() {
        System.out.println("显示蓝色窗口~~");
    }
}
