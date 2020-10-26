package com.phoegel.factorymethod.modify;

/**
 * 圆形镜子：担当具体产品角色
 */
public class RoundMirror implements Mirror {
    public void look() {
        System.out.println("使用圆形镜子看~~~");
    }
}
