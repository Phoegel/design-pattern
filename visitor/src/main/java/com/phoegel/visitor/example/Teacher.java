package com.phoegel.visitor.example;

// 老师类
public class Teacher extends Person {
    // 教学反馈分
    private int feedbackScore;

    public Teacher(String name, int paperNums, int feedbackScore) {
        this.setName(name);
        this.setPaperNums(paperNums);
        this.feedbackScore = feedbackScore;
    }

    public int getFeedbackScore() {
        return feedbackScore;
    }

    public void setFeedbackScore(int feedbackScore) {
        this.feedbackScore = feedbackScore;
    }
}
