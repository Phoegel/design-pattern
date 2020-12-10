package com.phoegel.responsibility.modify;

public class Main {
    public static void main(String[] args) {
        PmLeaveApplyHandler pmLeaveApplyHandler = new PmLeaveApplyHandler();
        DmLeaveApplyHandler dmLeaveApplyHandler = new DmLeaveApplyHandler();
        GmLeaveApplyHandler gmLeaveApplyHandler = new GmLeaveApplyHandler();
        pmLeaveApplyHandler.setHandler(dmLeaveApplyHandler);
        dmLeaveApplyHandler.setHandler(gmLeaveApplyHandler);

        Integer day = 10;
        System.out.println("张三请假：" + day + "天");
        pmLeaveApplyHandler.handlerApply(day);
    }
}
