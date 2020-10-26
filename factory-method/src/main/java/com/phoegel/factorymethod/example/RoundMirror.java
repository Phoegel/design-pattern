package com.phoegel.factorymethod.example;

/**
 * 具体的产品类：圆形镜子
 */
public class RoundMirror implements Mirror {
    public void look() {
        System.out.println("使用圆形镜子看~~~");
    }
}
