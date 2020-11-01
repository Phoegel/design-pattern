package com.phoegel.prototype.modify;

public class WeeklyReportJDKDeep implements Cloneable {
    public static void main(String[] args) {
        WeeklyReportJDKDeep weeklyReport1 = new WeeklyReportJDKDeep();
        weeklyReport1.setName("张三");
        weeklyReport1.setContent("一周都在努力工作~~");
        Attachment attachment = new Attachment();
        attachment.setName("附件一");
        weeklyReport1.setAttachment(attachment);
        weeklyReport1.setDate("第一周");
        System.out.println("第一周周报：" + weeklyReport1);

        // 直接使用jdk克隆，减少常见的属性赋值操作
        WeeklyReportJDKDeep weeklyReport2 = weeklyReport1.clone();
        weeklyReport2.setDate("第二周");
        System.out.println("第一周周报：" + weeklyReport2);
        // 这里使用深克隆之后，是两个对象，所以 false
        System.out.println(weeklyReport1.getAttachment() == weeklyReport2.getAttachment());
    }
    // 填写人
    private String name;
    // 周报内容
    private String content;
    // 上报时间
    private String date;
    // 周报附件
    private Attachment attachment;

    // 重写 Object 中的方法
    public WeeklyReportJDKDeep clone() {
        WeeklyReportJDKDeep clone = null;
        try {
            clone = (WeeklyReportJDKDeep) super.clone();
            clone.setAttachment(attachment.clone());
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

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
class Attachment implements Cloneable {
    private String name;

    @Override
    public Attachment clone() {
        Attachment clone = null;
        try {
            clone = (Attachment) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
