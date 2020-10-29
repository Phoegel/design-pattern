package com.phoegel.singleton.modify;

/**
 * 内部类式
 */
public class InternalClass {

    private static class StaticInternalClass {
        // 在 Internal 类被加载的时候，才会创建 instance 对象实例。
        // 因为静态属性只会被初始化一次，这就保证了 instance 对象的唯一性
        private static InternalClass instance = new InternalClass();
    }

    private InternalClass() {
    }

    public static InternalClass getInstance() {
        return StaticInternalClass.instance;
    }

}
