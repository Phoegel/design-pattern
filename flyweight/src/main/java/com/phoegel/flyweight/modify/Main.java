package com.phoegel.flyweight.modify;

public class Main {
    public static void main(String[] args) {
        TestAnswer chinese = TestAnswerFactory.getTestAnswer("chinese");
        TestAnswer math = TestAnswerFactory.getTestAnswer("math");
        Student zs = new Student("张三");
        chinese.showAnswer(zs);
        math.showAnswer(zs);
        System.out.println("-----------------------------------------");
        Student ls = new Student("李四");
        chinese.showAnswer(ls);
        math.showAnswer(ls);
    }
}
