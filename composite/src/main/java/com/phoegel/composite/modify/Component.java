package com.phoegel.composite.modify;

/**
 * 抽象构件类角色
 */
public abstract class Component {
    // 添加成员
    public abstract void add(Component c);
    // 不同的实现类实现不同的展示方式
    public abstract void show(String prefix);
}
