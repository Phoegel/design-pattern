package com.phoegel.visitor.example;

import java.util.ArrayList;
import java.util.List;

// 奖励审批系统
public class AwardCheckSystem {
    // 存放元素的容器
    private List<Person> personList = new ArrayList<>();

    // 添加元素方法
    public void addPerson(Person person) {
        personList.add(person);
    }

    // 系统判断评选资格核心代码
    public void awardCheck(String prize) {
        if (prize.equals("research")) {
            for (Person person : personList) {
                int paperNums = person.getPaperNums();
                if (person instanceof Teacher && paperNums > 10) {
                    System.out.println(person.getName() + "老师发表论文数为：" + paperNums + "，拥有评选科研奖资格");
                } else if (person instanceof Student && paperNums > 2) {
                    System.out.println(person.getName() + "同学发表论文数为：" + paperNums + "，拥有评选科研奖资格");
                }
            }
        } else if (prize.equals("excellent")) {
            for (Person person : personList) {
                if (person instanceof Teacher && ((Teacher) person).getFeedbackScore() >= 90) {
                    System.out.println(person.getName() + "老师发表教学反馈分为：" + ((Teacher) person).getFeedbackScore() + "，拥有评选成绩优秀奖资格");
                } else if (person instanceof Student && ((Student) person).getAverageScore() >= 90) {
                    System.out.println(person.getName() + "同学平均成绩为：" + ((Student) person).getAverageScore() + "，拥有评选成绩优秀奖资格");
                }
            }
        }
    }
}
