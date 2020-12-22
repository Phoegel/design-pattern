package com.phoegel.mediator.modify;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("张三");
        UIDesigner designer = new UIDesigner("李四");
        ProductManager productManager = new ProductManager("王五");
        ProjectManager projectManager = new ProjectManager("赵六");

        programmer.setProjectManager(projectManager);
        designer.setProjectManager(projectManager);
        productManager.setProjectManager(projectManager);

        productManager.work();
        designer.work();
        programmer.work();
        productManager.communicateWithProjectManager("UI设计师");
        designer.communicateWithProjectManager("程序员");
        programmer.communicateWithProjectManager("产品经理");
    }
}
