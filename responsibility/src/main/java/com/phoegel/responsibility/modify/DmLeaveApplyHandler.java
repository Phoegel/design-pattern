package com.phoegel.responsibility.modify;

// 部门经理处理类
public class DmLeaveApplyHandler extends LeaveApplyHandler {
    @Override
    public void handlerApply(Integer day) {
        if (day <= 5) {
            String result = (random.nextInt(5)) % 3 == 0 ? "通过" : "不通过";
            System.out.println("部门经理审批，结果：" + result);
        } else {
            handler.handlerApply(day);
        }
    }
}
