package com.phoegel.flyweight.modify;

/**
 * 具体享元类
 */
public class ChineseTestAnswer extends TestAnswer {
    public ChineseTestAnswer() {
        System.out.println("老师从试卷库中取出语文试卷答案带进教室");
        this.setAnswer("答案：A、B、C...");
    }

    @Override
    public void showAnswer(Student student) {
        System.out.println("学生" + student.getName() + "查看语文试卷答案[" + this.getAnswer() + "]");
    }
}
