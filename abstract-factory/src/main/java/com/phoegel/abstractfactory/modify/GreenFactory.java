package com.phoegel.abstractfactory.modify;

/**
 * 绿色皮肤抽象工厂：担当具体工厂角色，实现生成一族产品的方法
 */
public class GreenFactory implements SkinFactory {
    public Window getWindow() {
        return new GreenWindow();
    }

    public Button getButton() {
        return new GreenButton();
    }
}
