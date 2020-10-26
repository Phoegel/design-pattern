package com.phoegel.abstractfactory.modify;

import java.util.Scanner;

/**
 * 客户端通过选择不同的皮肤，显示不同的皮肤样式
 */
public class Main {
    public static void main(String[] args) {
        // 模拟选择一款皮肤
        System.out.println("请输入皮肤颜色：\nblue:蓝色经典款\tgreen:绿色护眼款");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        SkinFactory skinFactory;
        // 选择生成一族产品的工厂
        if ("blue".equals(type)) {
            skinFactory = new BlueFactory();
        } else if ("green".equals(type)) {
            skinFactory = new GreenFactory();
        } else {
            throw new RuntimeException("选择的皮肤不存在");
        }
        Window window = skinFactory.getWindow();
        Button button = skinFactory.getButton();
        window.show();
        button.click();
    }
}
