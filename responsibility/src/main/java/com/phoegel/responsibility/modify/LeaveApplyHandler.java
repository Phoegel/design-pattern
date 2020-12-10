package com.phoegel.responsibility.modify;

import java.util.Random;

/**
 * 抽象处理者角色
 */
public abstract class LeaveApplyHandler {
    protected Random random = new Random(10);
    // 定义下一个处理者的引用
    protected LeaveApplyHandler handler;

    // 这只下一个处理者
    public void setHandler(LeaveApplyHandler handler) {
        this.handler = handler;
    }

    // 处理逻辑方法
    public abstract void handlerApply(Integer day);
}
