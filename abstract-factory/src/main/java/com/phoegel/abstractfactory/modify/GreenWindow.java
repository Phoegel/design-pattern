package com.phoegel.abstractfactory.modify;

/**
 * 绿色窗口产品：担当具体产品角色
 */
public class GreenWindow implements Window {
    public void show() {
        System.out.println("显示绿色窗口~~");
    }
}
