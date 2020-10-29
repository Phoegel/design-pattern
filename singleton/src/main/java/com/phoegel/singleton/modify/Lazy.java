package com.phoegel.singleton.modify;

/**
 * 懒汉式
 */
public class Lazy {
    private static Lazy instance;

    private Lazy() {
    }

    public static Lazy getInstance() {
        // 在第一次使用时再创建实例
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
