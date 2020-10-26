package com.phoegel.factorymethod.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 客户端输入一个类型
        System.out.println("请输入记录类型：\nround:圆形镜子\tsquare:方形镜子");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        Mirror mirror = MirrorFactory.getMirror(type);
        mirror.look();
    }
}
