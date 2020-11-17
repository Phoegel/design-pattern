package com.phoegel.flyweight.example;

/**
 * 学生类
 */
public class Student {
    private String name;
    private ChineseTestAnswer chineseTestAnswer;
    private MathTestAnswer mathTestAnswer;

    public Student(String name) {
        this.name = name;
    }

    public void showChineseAnswer() {
        System.out.println("学生" + this.name + "查看语文试卷答案[" + chineseTestAnswer.showAnswer() + "]");
    }

    public void showMathTestAnswer() {
        System.out.println("学生" + this.name + "查看语文试卷答案[" + mathTestAnswer.showAnswer() + "]");
        mathTestAnswer.showAnswer();
    }

    public void setChineseTestAnswer(ChineseTestAnswer chineseTestAnswer) {
        System.out.println("老师把语文试卷答案发给学生：" + this.name);
        this.chineseTestAnswer = chineseTestAnswer;
    }

    public void setMathTestAnswer(MathTestAnswer mathTestAnswer) {
        System.out.println("老师把数学试卷答案发给学生：" + this.name);
        this.mathTestAnswer = mathTestAnswer;
    }
}
