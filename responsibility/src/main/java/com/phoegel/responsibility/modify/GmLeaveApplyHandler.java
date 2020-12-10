package com.phoegel.responsibility.modify;

// 总经理处理类
public class GmLeaveApplyHandler extends LeaveApplyHandler {
    @Override
    public void handlerApply(Integer day) {
        String result = (random.nextInt(3)) % 2 == 0 ? "通过" : "不通过";
        System.out.println("项目经理审批，结果：" + result);
    }
}
