package com.phoegel.flyweight.example;

/**
 * 语文试卷答案类
 */
public class ChineseTestAnswer {
    // 试卷答案内容
    private String answer;

    public ChineseTestAnswer() {
        System.out.println("老师从试卷库中取出语文试卷答案带进教室");
        this.answer = "答案：A、B、C...";
    }

    public String showAnswer() {
        return this.answer;
    }
}
