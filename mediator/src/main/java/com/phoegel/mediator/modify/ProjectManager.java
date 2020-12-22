package com.phoegel.mediator.modify;

/**
 * 项目经理类：具体中介者类角色
 */
public class ProjectManager extends Mediator {
    public ProjectManager(String name) {
        super(name);
    }

    // 实现与其他同事类沟通的逻辑：这里是根据想沟通的具体职位来协调
    @Override
    public void communicateWithStaff(String position) {
        for (Staff staff : staffList) {
            if (staff.getPosition().equals(position)) {
                System.out.println("项目经理[" + this.getName() + "]与" + staff.getPosition() + "[" + staff.getName() + "]沟通交流...");
            }
        }
    }
}
