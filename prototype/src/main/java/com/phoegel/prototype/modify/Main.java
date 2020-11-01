package com.phoegel.prototype.modify;

public class Main {
    public static void main(String[] args) {
        Prototype weeklyReport1 = new WeeklyReport();
        weeklyReport1.setName("张三");
        weeklyReport1.setContent("一周都在努力工作~~");
        weeklyReport1.setDate("第一周");
        System.out.println("第一周周报：" + weeklyReport1);

        // 直接克隆使用，减少常见的属性赋值操作
        Prototype weeklyReport2 = weeklyReport1.create();
        weeklyReport2.setDate("第二周");
        System.out.println("第一周周报：" + weeklyReport2);
    }
}
