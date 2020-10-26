package com.phoegel.factorymethod.modify;

/**
 * 方形镜子：担当具体产品角色
 */
public class SquareMirror implements Mirror {
    public void look() {
        System.out.println("使用方形镜子看~~~");
    }
}
