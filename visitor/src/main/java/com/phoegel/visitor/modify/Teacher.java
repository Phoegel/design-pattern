package com.phoegel.visitor.modify;

// 老师类
public class Teacher extends Person {
    // 教学反馈分
    private int feedbackScore;

    public Teacher(String name, int paperNums, int feedbackScore) {
        this.setName(name);
        this.setPaperNums(paperNums);
        this.feedbackScore = feedbackScore;
    }

    // 实现访问者访问元素的方法
    @Override
    public void accept(Award award) {
        award.visit(this);
    }

    public int getFeedbackScore() {
        return feedbackScore;
    }

    public void setFeedbackScore(int feedbackScore) {
        this.feedbackScore = feedbackScore;
    }
}
