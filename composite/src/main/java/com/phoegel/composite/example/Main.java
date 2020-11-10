package com.phoegel.composite.example;

public class Main {
    public static void main(String[] args) {
        // 面板 A
        Panel panelA = new Panel("A");
        // 面板 A 放入了一个按钮
        panelA.addButton(new Button("A-1"));
        // 面板 A 放入了一个文本框
        panelA.addTextBox(new TextBox("A-2"));
        // 面板 A 放入了另一个面板 B
        Panel panelB = new Panel("A-B");
        // 面板 B 放入了另一个按钮
        panelB.addButton(new Button("A-B-1"));
        // 面板 B 放入了另一个文本框
        panelB.addTextBox(new TextBox("A-B-2"));
        panelA.addPanel(panelB);
        // 展示面板 A 的内容
        panelA.show("");
    }
}
