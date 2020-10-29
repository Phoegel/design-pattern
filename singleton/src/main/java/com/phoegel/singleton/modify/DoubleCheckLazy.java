package com.phoegel.singleton.modify;

/**
 * 双重检查懒汉式
 */
public class DoubleCheckLazy {
    // 加入 volatile 关键字保证可见性/防止指令重排
    private static volatile DoubleCheckLazy instance;

    private DoubleCheckLazy() {
    }

    public static DoubleCheckLazy getInstance() {
        // 第一个判断：是使得在实例已经初始化了之后，不用继续访问判断里面的内容，直接跳到判断之外 return instance
        if (instance == null) {
            // 通过在代码块中加锁，使得更多的线程能够调用 getInstance() 方法，同时达到线程安全的作用
            synchronized (DoubleCheckLazy.class) {
                // 第二个判断：这个判断是为了保证只创建一次实例
                if (instance == null) {
                    instance = new DoubleCheckLazy();
                }
            }
        }
        return instance;
    }
}
