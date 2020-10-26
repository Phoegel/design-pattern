package com.phoegel.abstractfactory.example;

/**
 * 具体的工厂类：蓝色按钮工厂类
 */
public class BlueButtonFactory implements ButtonFactory {
    public Button getButton() {
        return new BlueButton();
    }
}
