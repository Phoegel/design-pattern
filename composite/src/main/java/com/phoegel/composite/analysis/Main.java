package com.phoegel.composite.analysis;


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

        // 创建面板，类似于 html 中的 div
        JPanel panel = new JPanel();

        // 创建一个输入框
        JTextField textField = new JTextField(8);
        // 添加到面板中
        //panel.add(textField);

        // 创建一个按钮
        JButton btn = new JButton("提交");
        // 添加到面板中
        panel.add(btn);

        // 添加面板到 JFrame 中
        jf.add(panel);
        // 设置界面可见
        jf.setVisible(true);
    }
}
