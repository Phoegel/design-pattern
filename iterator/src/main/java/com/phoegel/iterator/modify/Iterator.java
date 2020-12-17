package com.phoegel.iterator.modify;

/**
 * 抽象迭代器角色
 */
public interface Iterator {
    // 判断是否存在下一个元素
    boolean hasNext();
    // 获取下一个元素
    Object next();
}
