package com.phoegel.visitor.modify;

// 成绩优秀奖资格判断类（具体访问者类角色）
public class ExcellentAward implements Award {
    @Override
    public void visit(Teacher person) {
        if (person.getFeedbackScore() >= 90) {
            System.out.println(person.getName() + "老师发表教学反馈分为：" + person.getFeedbackScore() + "，拥有评选成绩优秀奖资格");
        }
    }

    @Override
    public void visit(Student person) {
        if (person.getAverageScore() >= 90) {
            System.out.println(person.getName() + "同学平均成绩为：" + person.getAverageScore() + "，拥有评选成绩优秀奖资格");
        }
    }
}
