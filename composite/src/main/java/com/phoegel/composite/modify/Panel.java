package com.phoegel.composite.modify;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件类角色
 */
public class Panel extends Component {
    private String name;
    private List<Component> list = new ArrayList<>();

    public Panel(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void show(String prefix) {
        System.out.println(prefix + "展示面板[" + this.name + "]");
        for (Component component : list) {
            component.show(prefix + "--");
        }
    }
}
