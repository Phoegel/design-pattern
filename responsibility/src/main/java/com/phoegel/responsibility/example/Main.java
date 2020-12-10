package com.phoegel.responsibility.example;

public class Main {
    public static void main(String[] args) {
        Integer day = 10;
        System.out.println("张三请假：" + day + "天");
        LeaveApplyHandler applyHandler = new LeaveApplyHandler();
        applyHandler.handlerApply(day);
    }
}
