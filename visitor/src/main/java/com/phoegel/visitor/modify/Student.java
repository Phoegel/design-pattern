package com.phoegel.visitor.modify;

// 学生类
public class Student extends Person {
    // 平均成绩
    private int averageScore;

    public Student(String name, int paperNums, int averageScore) {
        this.setName(name);
        this.setPaperNums(paperNums);
        this.averageScore = averageScore;
    }

    // 实现访问者访问元素的方法
    @Override
    public void accept(Award award) {
        award.visit(this);
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }
}
