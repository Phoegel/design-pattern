package com.phoegel.prototype.example;

public class Main {
    public static void main(String[] args) {
        WeeklyReport weeklyReport1 = new WeeklyReport();
        weeklyReport1.setName("张三");
        weeklyReport1.setContent("一周都在努力工作~~");
        weeklyReport1.setDate("第一周");
        System.out.println("第一周周报：" + weeklyReport1);

        WeeklyReport weeklyReport2 = new WeeklyReport();
        weeklyReport2.setName("张三");
        weeklyReport2.setContent("一周都在努力工作~~");
        weeklyReport2.setDate("第二周");
        System.out.print("第二周周报：" + weeklyReport2);
    }
}
