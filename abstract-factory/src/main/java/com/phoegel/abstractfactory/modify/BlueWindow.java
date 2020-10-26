package com.phoegel.abstractfactory.modify;

/**
 * 蓝色窗口产品：担当具体产品角色
 */
public class BlueWindow implements Window {
    public void show() {
        System.out.println("显示蓝色窗口~~");
    }
}
