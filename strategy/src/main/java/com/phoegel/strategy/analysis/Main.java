package com.phoegel.strategy.analysis;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame jf = new JFrame("layout example");
        // 设置宽高
        jf.setSize(500, 400);
        // 设置在窗口中间打开
        jf.setLocationRelativeTo(null);
        // 设置默认关闭操作
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 边界布局
        // 默认为0，0；水平间距10，垂直间距5
        JPanel borderLayoutPanel = new JPanel(new BorderLayout(10, 5));
        TitledBorder titledBorder = new TitledBorder("BorderLayout");
        borderLayoutPanel.setBorder(titledBorder);
        JButton north = new JButton("东");
        JButton south = new JButton("南");
        JButton east = new JButton("西");
        JButton west = new JButton("北");
        JButton middle = new JButton("中");
        borderLayoutPanel.add(north, BorderLayout.EAST);
        borderLayoutPanel.add(south, BorderLayout.SOUTH);
        borderLayoutPanel.add(east, BorderLayout.WEST);
        borderLayoutPanel.add(west, BorderLayout.NORTH);
        borderLayoutPanel.add(middle, BorderLayout.CENTER);
        // 将面板添加到窗体中
        jf.add(borderLayoutPanel, BorderLayout.WEST);

        // 变换布局按钮
        JButton changeToGridLayout = new JButton("changeToGridLayout");
        // 设置监听器
        changeToGridLayout.addActionListener(e -> {
            // 将边界布局改变为网格布局
            // 默认为1行，n列；设置为2行3列，水平间距10，垂直间距5
            borderLayoutPanel.setLayout(new GridLayout(2, 3, 10, 5));
            titledBorder.setTitle("GridLayout");
            // 更新之后界面才会发生改变
            borderLayoutPanel.updateUI();
        });
        // 将按钮添加进窗体中
        jf.add(changeToGridLayout, BorderLayout.EAST);

        // 设置界面可见
        jf.setVisible(true);
    }
}
