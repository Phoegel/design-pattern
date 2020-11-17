package com.phoegel.flyweight.example;

public class Main {
    public static void main(String[] args) {
        Student zs = new Student("张三");
        zs.setChineseTestAnswer(new ChineseTestAnswer());
        zs.showChineseAnswer();
        zs.setMathTestAnswer(new MathTestAnswer());
        zs.showMathTestAnswer();
        System.out.println("-----------------------------------------");
        Student ls = new Student("李四");
        ls.setChineseTestAnswer(new ChineseTestAnswer());
        ls.showChineseAnswer();
        ls.setMathTestAnswer(new MathTestAnswer());
        ls.showMathTestAnswer();
    }
}
