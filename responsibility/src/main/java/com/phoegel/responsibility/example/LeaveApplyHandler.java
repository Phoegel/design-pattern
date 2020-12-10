package com.phoegel.responsibility.example;

import java.util.Random;

/**
 * 处理请假申请类
 */
public class LeaveApplyHandler {
    private Random random = new Random(10);

    public void handlerApply(Integer day) {
        if (day <= 3) {
            pmHandler(day);
        } else if (day <= 5) {
            dmHandler(day);
        } else {
            gmHandler(day);
        }
    }

    // 总经理审批
    private void gmHandler(Integer day) {
        String result = (random.nextInt(10)) % 4 == 0 ? "通过" : "不通过";
        System.out.println("总经理审批，结果：" + result);
    }

    // 部门经理审批
    private void dmHandler(Integer day) {
        String result = (random.nextInt(5)) % 3 == 0 ? "通过" : "不通过";
        System.out.println("部门经理审批，结果：" + result);
    }

    // 项目经理审批
    private void pmHandler(Integer day) {
        String result = (random.nextInt(3)) % 2 == 0 ? "通过" : "不通过";
        System.out.println("项目经理审批，结果：" + result);
    }
}
