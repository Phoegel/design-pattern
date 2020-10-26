package com.phoegel.factorymethod.example;

/**
 * 具体的产品类：方形镜子
 */
public class SquareMirror implements Mirror {
    public void look() {
        System.out.println("使用方形镜子看~~~");
    }
}
