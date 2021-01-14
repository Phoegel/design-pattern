package com.phoegel.visitor.modify;

// 抽象访问者，定义访问具体元素的方法
public interface Award {
    // 提供访问老师类接口
    void visit(Teacher person);
    // 提供访问学生类接口
    void visit(Student person);
}
