package com.phoegel.mediator.analysis;

import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Timer timer = new Timer("TimerTest");
        // 延迟一秒后，每隔一秒执行
        timer.schedule(new TimerTaskA(), 0, 1000);
        // 延迟一秒后，每隔两秒执行
        timer.schedule(new TimerTaskB(), 0, 2000);
    }
}
