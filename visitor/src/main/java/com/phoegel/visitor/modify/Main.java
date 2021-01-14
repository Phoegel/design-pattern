package com.phoegel.visitor.modify;

public class Main {
    public static void main(String[] args) {
        AwardCheckSystem awardCheckSystem = new AwardCheckSystem();
        awardCheckSystem.addPerson(new Teacher("张三", 9, 91));
        awardCheckSystem.addPerson(new Teacher("李四", 11, 89));
        awardCheckSystem.addPerson(new Student("王五", 1, 92));
        awardCheckSystem.addPerson(new Student("赵六", 3, 88));
        System.out.println("拥有评选科研奖资格的人有：");
        awardCheckSystem.awardCheck(new ResearchAward());
        System.out.println("----------------------------------------------");
        System.out.println("拥有评选成绩优秀奖资格的人有：");
        awardCheckSystem.awardCheck(new ExcellentAward());
    }
}
