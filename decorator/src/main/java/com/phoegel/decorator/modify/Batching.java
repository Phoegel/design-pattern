package com.phoegel.decorator.modify;

/**
 * 抽象装饰类：配料类
 */
public abstract class Batching implements Material {
    protected Material material;

    public Batching(Material material) {
        this.material = material;
    }

    // 实现接口中的方法，实际调用的是具体构件类中的方法
    public int sum() {
        return material.sum();
    }
}
