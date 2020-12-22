package com.phoegel.mediator.modify;

/**
 * 产品经理类：具体同事类角色
 */
public class ProductManager extends Staff {

    public ProductManager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("产品经理[" + this.getName() + "]开始设计原型界面...");
    }

    @Override
    public String getPosition() {
        return "产品经理";
    }
}
