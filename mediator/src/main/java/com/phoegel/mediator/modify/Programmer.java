package com.phoegel.mediator.modify;

/**
 * 程序员类：具体同事类角色
 */
public class Programmer extends Staff {

    public Programmer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("程序员[" + this.getName() + "]开始写代码...");
    }

    @Override
    public String getPosition() {
        return "程序员";
    }
}
