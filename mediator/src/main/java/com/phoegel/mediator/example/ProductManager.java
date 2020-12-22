package com.phoegel.mediator.example;

public class ProductManager {
    private String name;
    private Programmer programmer;
    private UIDesigner designer;

    public ProductManager(String name) {
        this.name = name;
    }

    public void designPrototype() {
        System.out.println("产品经理[" + this.name + "]开始设计原型界面...");
    }

    public void communicateWithProgrammer() {
        System.out.println("产品经理[" + this.name + "]与程序员[" + programmer.getName() + "]沟通交流...");
    }

    public void communicateWithUI() {
        System.out.println("产品经理[" + this.name + "]与UI设计师[" + designer.getName() + "]沟通交流...");
    }

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void setDesigner(UIDesigner designer) {
        this.designer = designer;
    }

    public String getName() {
        return name;
    }
}
