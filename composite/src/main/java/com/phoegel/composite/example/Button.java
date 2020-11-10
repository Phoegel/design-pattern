package com.phoegel.composite.example;

/**
 * 按钮组件
 */
public class Button {
    private String name;

    public Button(String name) {
        this.name = name;
    }

    public void show(String prefix) {
        System.out.println(prefix + "展示按钮[" + this.name + "]");
    }
}
