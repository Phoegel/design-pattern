package com.phoegel.observer.analysis;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame jf = new JFrame();
        // 设置宽高
        jf.setSize(200, 100);
        // 设置在窗口中间打开
        jf.setLocationRelativeTo(null);
        // 设置默认关闭操作
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建一个按钮
        JButton jb = new JButton("click me");
        // 创建两个监听器
        ButtonListener buttonListenerA = new ButtonListener("监听器A");
        ButtonListener buttonListenerB = new ButtonListener("监听器B");
        // 注册监听器
        jb.addActionListener(buttonListenerA);
        jb.addActionListener(buttonListenerB);
        // 添加到窗体中
        jf.add(jb);
        // 设置界面可见
        jf.setVisible(true);
    }
}
