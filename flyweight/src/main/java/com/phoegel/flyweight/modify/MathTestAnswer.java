package com.phoegel.flyweight.modify;

/**
 * 具体享元类
 */
public class MathTestAnswer extends TestAnswer {
    public MathTestAnswer() {
        System.out.println("老师从试卷库中取出数学试卷答案带进教室");
        this.setAnswer("答案：C、B、A...");
    }

    @Override
    public void showAnswer(Student student) {
        System.out.println("学生" + student.getName() + "查看数学试卷答案[" + this.getAnswer() + "]");
    }
}
