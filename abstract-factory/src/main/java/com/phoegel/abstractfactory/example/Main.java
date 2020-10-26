package com.phoegel.abstractfactory.example;

import java.util.Scanner;

/**
 * 客户端使用不同款式的皮肤界面
 */
public class Main {
    public static void main(String[] args) {
        // 模拟选择一款皮肤
        System.out.println("请输入皮肤颜色：\nblue:蓝色经典款\tgreen:绿色护眼款");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        Window window;
        Button button;
        if ("blue".equals(type)) {
            window = new BlueWindowFactory().getWindow();
            button = new BlueButtonFactory().getButton();
        } else if ("green".equals(type)) {
            window = new GreenWindowFactory().getWindow();
            button = new GreenButtonFactory().getButton();
        } else {
            throw new RuntimeException("选择的皮肤不存在");
        }
        window.show();
        button.click();
    }
}
