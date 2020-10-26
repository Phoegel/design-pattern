package com.phoegel.abstractfactory.modify;

/**
 * 皮肤抽象工厂：担当抽象工厂角色，定义生成一族产品的方法
 */
public interface SkinFactory {
    Window getWindow();
    Button getButton();
}
