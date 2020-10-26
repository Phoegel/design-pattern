package com.phoegel.simplefactory.typical;

public class Main {
    public static void main(String args[]) {
        // 通过工厂类创建产品对象
        Product product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();
    }
}
