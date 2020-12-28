package com.phoegel.observer.modify;

public class Main {
    public static void main(String[] args) {
        /*Employee zs = new Employee("张三");
        Employee ls = new Employee("李四");
        Employee ww = new Employee("王五");
        Boss zl = new Boss("赵六");
        zl.add(zs);
        zl.add(ls);
        zl.add(ww);
        System.out.println("大家都在上班摸鱼中~~");
        zl.inspect();*/

        EmployeeObserver zs = new EmployeeObserver("张三");
        EmployeeObserver ls = new EmployeeObserver("李四");
        EmployeeObserver ww = new EmployeeObserver("王五");
        BossObservable zl = new BossObservable("赵六");
        zl.addObserver(zs);
        zl.addObserver(ls);
        zl.addObserver(ww);
        System.out.println("大家都在上班摸鱼中~~");
        zl.inspect();
    }
}
