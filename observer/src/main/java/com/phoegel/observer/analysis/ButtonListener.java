package com.phoegel.observer.analysis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 这里相当于模式中的观察者
public class ButtonListener implements ActionListener {
    private String name;

    public ButtonListener(String name) {
        this.name = name;
    }

    // 被点击时被调用
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("触发了事件" + this.name);
    }
}
