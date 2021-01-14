package com.phoegel.visitor.example;

// 父类，主要存放一些公共字段
public class Person {
    // 姓名
    private String name;
    // 论文数
    private int paperNums;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaperNums() {
        return paperNums;
    }

    public void setPaperNums(int paperNums) {
        this.paperNums = paperNums;
    }
}
