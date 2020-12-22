package com.phoegel.mediator.example;

public class UIDesigner {
    private String name;
    private Programmer programmer;
    private ProductManager productManager;

    public UIDesigner(String name) {
        this.name = name;
    }

    public void design() {
        System.out.println("UI设计师[" + this.name + "]开始设计UI界面...");
    }

    public void communicateWithProductManager() {
        System.out.println("UI设计师[" + this.name + "]与产品经理[" + productManager.getName() + "]沟通交流...");
    }

    public void communicateWithProgrammer() {
        System.out.println("UI设计师[" + this.name + "]与程序员[" + programmer.getName() + "]沟通交流...");
    }

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

    public String getName() {
        return name;
    }
}
