package com.phoegel.prototype.typical;

/**
 * 具体原型类
 * 它实现在抽象原型类中声明的克隆方法，在克隆方法中返回自己的一个克隆对象。
 */
public class ConcretePrototype extends Prototype {
    @Override
    public Prototype duplicate() {
        // 创建新对象
        Prototype prototype = new ConcretePrototype();
        prototype.setAttr(getAttr());
        return prototype;
    }
}
