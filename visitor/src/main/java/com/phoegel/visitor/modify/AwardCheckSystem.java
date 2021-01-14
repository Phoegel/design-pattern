package com.phoegel.visitor.modify;

import java.util.ArrayList;
import java.util.List;

// 奖励审批系统（对象结构类角色）
public class AwardCheckSystem {
    // 存放元素的容器
    private List<Person> personList = new ArrayList<>();

    // 添加元素方法
    public void addPerson(Person person) {
        personList.add(person);
    }

    // 系统判断评选资格核心代码
    public void awardCheck(Award award) {
        for (Person person : personList) {
            person.accept(award);
        }
    }
}
