package com.phoegel.responsibility.modify;

// 项目经理处理类
public class PmLeaveApplyHandler extends LeaveApplyHandler {
    @Override
    public void handlerApply(Integer day) {
        if (day <= 3) {
            String result = (random.nextInt(3)) % 2 == 0 ? "通过" : "不通过";
            System.out.println("项目经理审批，结果：" + result);
        } else {
            handler.handlerApply(day);
        }
    }
}
