package com.phoegel.visitor.example;

// 学生类
public class Student extends Person {
    // 平均成绩
    private int averageScore;

    public Student(String name, int paperNums, int averageScore) {
        this.setName(name);
        this.setPaperNums(paperNums);
        this.averageScore = averageScore;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }
}
