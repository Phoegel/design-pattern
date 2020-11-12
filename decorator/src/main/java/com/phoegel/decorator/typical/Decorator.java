package com.phoegel.decorator.typical;

/**
 * 它也是抽象构件类的子类，用于给具体构件增加职责，但是具体职责在其子类中实现。
 * 它维护一个指向抽象构件对象的引用，通过该引用可以调用装饰之前构件对象的方法，并通过其子类扩展该方法，以达到装饰的目的。
 */
public class Decorator implements Component {
    // 维持一个对抽象构件对象的引用
    private Component component;

    // 注入一个抽象构件类型的对象
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 调用原有业务方法
        component.operation();
    }
}
