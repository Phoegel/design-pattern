package com.phoegel.mediator.modify;

/**
 * UI设计师类：具体同事类角色
 */
public class UIDesigner extends Staff {

    public UIDesigner(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("UI设计师[" + this.getName() + "]开始设计UI界面...");
    }

    @Override
    public String getPosition() {
        return "UI设计师";
    }
}
