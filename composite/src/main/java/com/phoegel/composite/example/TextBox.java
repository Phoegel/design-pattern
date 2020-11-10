package com.phoegel.composite.example;

/**
 * 文本框组件
 */
public class TextBox {
    private String name;

    public TextBox(String name) {
        this.name = name;
    }

    public void show(String prefix) {
        System.out.println(prefix + "展示文本框[" + this.name + "]");
    }
}
