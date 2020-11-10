package com.phoegel.composite.modify;

/**
 * 叶子构件类：按钮组件
 */
public class Button extends Component {
    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        // 这里通过抛异常的方式，拒绝添加子构件
        throw new UnsupportedOperationException();
    }

    public void show(String prefix) {
        System.out.println(prefix + "展示按钮[" + this.name + "]");
    }
}
