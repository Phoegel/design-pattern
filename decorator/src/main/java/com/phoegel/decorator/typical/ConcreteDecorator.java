package com.phoegel.decorator.typical;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        // 调用原有业务方法
        super.operation();
        // 调用新增业务方法
        addedBehavior();
    }

    //新增业务方法
    public void addedBehavior() {
         // ...
    }
}
