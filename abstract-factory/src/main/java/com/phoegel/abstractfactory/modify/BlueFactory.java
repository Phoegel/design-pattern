package com.phoegel.abstractfactory.modify;

/**
 * 蓝色皮肤抽象工厂：担当具体工厂角色，实现生成一族产品的方法
 */
public class BlueFactory implements SkinFactory {
    public Window getWindow() {
        return new BlueWindow();
    }

    public Button getButton() {
        return new BlueButton();
    }
}
