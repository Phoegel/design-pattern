package com.phoegel.mediator.modify;

/**
 * 员工类：抽象同事类角色
 */
public abstract class Staff {
    private String name;
    private ProjectManager projectManager;

    public Staff(String name) {
        this.name = name;
    }

    // 有事就只与项目经理沟通，让项目经理协调具体事宜
    public void communicateWithProjectManager(String position) {
        System.out.println(this.getPosition() + "[" + this.name + "]与项目经理[" + projectManager.getName() + "]沟通交流...");
        projectManager.communicateWithStaff(position);
    }

    // 抽象方法，便于统一调用
    public abstract void work();

    // 这里设计了返回职位的抽象方法，使得具体中介者根据这一返回值做出相应协调逻辑
    public abstract String getPosition();

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
        projectManager.addStaff(this);
    }

    public String getName() {
        return name;
    }
}
