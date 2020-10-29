package com.phoegel.singleton.typical;

public class Singleton {
    // 静态私有对象
    private static Singleton instance = new Singleton();

    // 私有的构造函数
    private Singleton() {
    }

    // 静态的公有的函数用于创建或获取它本身的静态私有对象
    public static Singleton getInstance() {
        return instance;
    }
}
