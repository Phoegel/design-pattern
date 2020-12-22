package com.phoegel.mediator.analysis;

import java.util.TimerTask;

public class TimerTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("TimerTaskB run" +  System.currentTimeMillis());
    }
}
