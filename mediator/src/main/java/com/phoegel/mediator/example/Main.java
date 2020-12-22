package com.phoegel.mediator.example;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("张三");
        UIDesigner designer = new UIDesigner("李四");
        ProductManager productManager = new ProductManager("王五");
        // 张三、李四和王五要相互交流，设置具体人员
        programmer.setDesigner(designer);
        programmer.setProductManager(productManager);
        designer.setProgrammer(programmer);
        designer.setProductManager(productManager);
        productManager.setDesigner(designer);
        productManager.setProgrammer(programmer);

        productManager.designPrototype();
        designer.design();
        programmer.coding();

        productManager.communicateWithUI();
        productManager.communicateWithProgrammer();
        designer.communicateWithProductManager();
        designer.communicateWithProgrammer();
        programmer.communicateWithProductManager();
        programmer.communicateWithUI();
    }
}
