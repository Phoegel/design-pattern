package com.phoegel.abstractfactory.example;

/**
 * 具体的工厂类：蓝色窗口工厂类
 */
public class BlueWindowFactory implements WindowFactory {
    public Window getWindow() {
        return new BlueWindow();
    }
}
