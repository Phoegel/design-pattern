package com.phoegel.prototype.modify;

public class WeeklyReportJDK implements Cloneable {
    public static void main(String[] args) {
        WeeklyReportJDK weeklyReport1 = new WeeklyReportJDK();
        weeklyReport1.setName("张三");
        weeklyReport1.setContent("一周都在努力工作~~");
        weeklyReport1.setDate("第一周");
        System.out.println("第一周周报：" + weeklyReport1);

        // 直接使用jdk克隆，减少常见的属性赋值操作
        WeeklyReportJDK weeklyReport2 = weeklyReport1.clone();
        weeklyReport2.setDate("第二周");
        System.out.println("第一周周报：" + weeklyReport2);
    }
    // 填写人
    private String name;
    // 周报内容
    private String content;
    // 上报时间
    private String date;

    // 重写 Object 中的方法
    public WeeklyReportJDK clone() {
        WeeklyReportJDK clone = null;
        try {
            clone = (WeeklyReportJDK) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

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
