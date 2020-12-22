package com.phoegel.mediator.example;

public class Programmer {
    private String name;
    private UIDesigner designer;
    private ProductManager productManager;

    public Programmer(String name) {
        this.name = name;
    }

    public void coding() {
        System.out.println("程序员[" + this.name + "]开始写代码...");
    }

    public void communicateWithUI() {
        System.out.println("程序员[" + this.name + "]与UI设计师[" + designer.getName() + "]沟通交流...");
    }

    public void communicateWithProductManager() {
        System.out.println("程序员[" + this.name + "]与产品经理[" + productManager.getName() + "]沟通交流...");
    }

    public void setDesigner(UIDesigner designer) {
        this.designer = designer;
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

    public String getName() {
        return name;
    }
}
