package com.phoegel.visitor.modify;

// 父类，主要存放一些公共字段
public abstract class Person {
    // 姓名
    private String name;
    // 论文数
    private int paperNums;

    // 定义用于访问者访问的方法
    public abstract void accept(Award award);

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
