package com.phoegel.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 面板内，可以添加按钮、文本框和其他的面板
 */
public class Panel {
    private String name;
    // 存放面板的容器
    private List<Panel> panelList = new ArrayList<>();
    // 存放按钮的容器
    private List<Button> buttonList = new ArrayList<>();
    // 存放文本框的容器
    private List<TextBox> textBoxList = new ArrayList<>();

    public Panel(String name) {
        this.name = name;
    }

    // 三个添加面板、按钮和文本框的方法
    public void addPanel(Panel panel) {
        panelList.add(panel);
    }

    public void addButton(Button button) {
        buttonList.add(button);
    }

    public void addTextBox(TextBox textBox) {
        textBoxList.add(textBox);
    }

    // 分别调用展示面板、按钮和文本框的方法
    public void show(String prefix) {
        System.out.println(prefix + "展示面板[" + this.name + "]");
        for (Button button : buttonList) {
            button.show(prefix + "--");
        }
        for (TextBox textBox : textBoxList) {
            textBox.show(prefix + "--");
        }
        for (Panel panel : panelList) {
            panel.show(prefix + "--");
        }
    }
}
