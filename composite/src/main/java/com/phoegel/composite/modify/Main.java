package com.phoegel.composite.modify;

public class Main {
    // 这里我们只用针对抽象类 Component 编程
    public static void main(String[] args) {
        // 面板 A
        Component panelA = new Panel("A");
        // 面板 A 放入了一个按钮
        panelA.add(new Button("A-1"));
        // 面板 A 放入了一个文本框
        panelA.add(new TextBox("A-2"));
        // 面板 A 放入了另一个面板 B
        Component panelB = new Panel("A-B");
        // 面板 B 放入了另一个按钮
        panelB.add(new Button("A-B-1"));
        // 面板 B 放入了另一个文本框
        panelB.add(new TextBox("A-B-2"));
        panelA.add(panelB);
        // 展示面板 A 的内容
        panelA.show("");
    }
}
