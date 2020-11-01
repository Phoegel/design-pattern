package com.phoegel.prototype.example;

/**
 * 周报类
 */
public class WeeklyReport {
    // 填写人
    private String name;
    // 周报内容
    private String content;
    // 上报时间
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
