package com.phoegel.composite.modify;

/**
 * 叶子构件类：文本框组件
 */
public class TextBox extends Component {
    private String name;

    public TextBox(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        // 这里通过抛异常的方式，拒绝添加子构件
        throw new UnsupportedOperationException();
    }

    public void show(String prefix) {
        System.out.println(prefix + "展示文本框[" + this.name + "]");
    }
}
