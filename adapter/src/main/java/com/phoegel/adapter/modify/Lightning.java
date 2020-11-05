package com.phoegel.adapter.modify;

/**
 * 目标类角色
 */
public class Lightning {
    private String username;

    public Lightning() {
    }

    public Lightning(String username) {
        this.username = username;
        System.out.println("我是" + this.username + "的Lighting数据线接口");
    }

    public void lightning() {
        System.out.println(this.username + "的数据线提供Lightning接口进行充电~~");
    }
}
