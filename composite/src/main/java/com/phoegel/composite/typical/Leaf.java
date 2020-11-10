package com.phoegel.composite.typical;

/**
 * 它在组合结构中表示叶子节点对象，叶子节点没有子节点，它实现了在抽象构件中定义的行为。
 * 对于那些访问及管理子构件的方法，可以通过异常等方式进行处理。
 */
public class Leaf extends Component {
    @Override
    public void add(Component c) {
        // 异常处理或错误提示
    }

    @Override
    public void remove(Component c) {
        // 异常处理或错误提示
    }

    @Override
    public Component getChild(int i) {
        // 异常处理或错误提示
        return null;
    }

    @Override
    public void operation() {
        // 叶子构件具体业务方法的实现
    }
}
