package com.phoegel.prototype.modify;

/**
 * 抽象类
 */
public abstract class Prototype {
    // 实现这个接口，返回自身对象的克隆对象
    public abstract Prototype create();
    private String name;
    private String content;
    private String date;

    @Override
    public String toString() {
        return "姓名='" + name + '\'' +
                ", 内容='" + content + '\'' +
                ", 周次='" + date + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
