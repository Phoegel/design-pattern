package com.phoegel.flyweight.modify;

/**
 * 抽象享元类
 */
public abstract class TestAnswer {
    // 试卷答案内容
    private String answer;

    public abstract void showAnswer(Student student);

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
