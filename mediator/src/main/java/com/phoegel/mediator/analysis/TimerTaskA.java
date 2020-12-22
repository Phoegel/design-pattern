package com.phoegel.mediator.analysis;

import java.util.TimerTask;

public class TimerTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("TimerTaskA run" +  System.currentTimeMillis());
    }
}
