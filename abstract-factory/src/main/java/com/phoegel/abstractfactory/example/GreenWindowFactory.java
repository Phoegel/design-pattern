package com.phoegel.abstractfactory.example;

/**
 * 具体的工厂类：绿色窗口工厂类
 */
public class GreenWindowFactory implements WindowFactory {
    public Window getWindow() {
        return new GreenWindow();
    }
}
