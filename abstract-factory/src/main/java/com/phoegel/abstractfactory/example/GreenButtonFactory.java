package com.phoegel.abstractfactory.example;

/**
 * 具体的工厂类：绿色按钮工厂类
 */
public class GreenButtonFactory implements ButtonFactory {
    public Button getButton() {
        return new GreenButton();
    }
}
