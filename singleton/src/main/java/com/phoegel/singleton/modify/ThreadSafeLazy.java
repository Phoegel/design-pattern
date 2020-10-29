package com.phoegel.singleton.modify;

/**
 * 线程安全懒汉式
 */
public class ThreadSafeLazy {
    private static ThreadSafeLazy instance;

    private ThreadSafeLazy() {
    }

    // 在第一次使用时再创建实例,同时使用 synchronized 关键字保证线程安全
    public static synchronized ThreadSafeLazy getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazy();
        }
        return instance;
    }

}
