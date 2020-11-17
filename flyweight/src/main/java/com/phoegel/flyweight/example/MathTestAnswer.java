package com.phoegel.flyweight.example;

/**
 * 数学书卷答案类
 */
public class MathTestAnswer {
    // 试卷答案内容
    private String answer;

    public MathTestAnswer() {
        System.out.println("老师从试卷库中取出数学试卷答案带进教室");
        this.answer = "答案：C、B、A...";;
    }

    public String showAnswer() {
        return this.answer;
    }
}
