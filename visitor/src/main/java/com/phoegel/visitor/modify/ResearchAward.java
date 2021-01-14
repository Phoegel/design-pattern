package com.phoegel.visitor.modify;

// 科研奖资格判断类（具体访问者类角色）
public class ResearchAward implements Award {
    @Override
    public void visit(Teacher person) {
        int paperNums = person.getPaperNums();
        if (paperNums > 10) {
            System.out.println(person.getName() + "老师发表论文数为：" + paperNums + "，拥有评选科研奖资格");
        }
    }

    @Override
    public void visit(Student person) {
        int paperNums = person.getPaperNums();
        if (paperNums > 2) {
            System.out.println(person.getName() + "同学发表论文数为：" + paperNums + "，拥有评选科研奖资格");
        }
    }
}
