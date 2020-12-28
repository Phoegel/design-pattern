package com.phoegel.observer.example;

public class Main {
    public static void main(String[] args) {
        Employee zs = new Employee("张三");
        Employee ls = new Employee("李四");
        Employee ww = new Employee("王五");
        Boss zl = new Boss("赵六");
        System.out.println("大家都在上班摸鱼中~~");
        zl.inspect();
        System.out.println(zs.getName() + "看到老板" + zl.getName() + "来巡查工作");
        zs.work();
        System.out.println(ls.getName() + "看到老板" + zl.getName() + "来巡查工作");
        ls.work();
        System.out.println(ww.getName() + "看到老板" + zl.getName() + "来巡查工作");
        ww.work();
    }
}
