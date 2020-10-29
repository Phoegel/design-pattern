package com.phoegel.singleton.modify;

/**
 * 饿汉式
 */
public class App {
    // 静态私有对象
    private static App app = new App();

    // 私有的构造函数
    private App() {
    }

    // 静态的公有的函数用于创建或获取它本身的静态私有对象
    public static App getInstance() {
        return app;
    }

    public void open() {
        System.out.println("软件打开中~~");
    }
}
