package com.phoegel.prototype.modify;

/**
 * 具体实现类
 */
public class WeeklyReport extends Prototype {
    // 实现接口，返回自身对象的克隆对象
    public Prototype create() {
        WeeklyReport weeklyReport = new WeeklyReport();
        weeklyReport.setName(this.getName());
        weeklyReport.setContent(this.getContent());
        weeklyReport.setDate(this.getDate());
        return weeklyReport;
    }
}
