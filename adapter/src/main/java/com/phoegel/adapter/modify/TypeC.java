package com.phoegel.adapter.modify;

/**
 * 适配者角色
 */
public class TypeC {
    private String username;

    public TypeC(String username) {
        this.username = username;
        System.out.println("我是" + this.username + "的Type-C数据线接口");
    }

    public void typeC() {
        System.out.println(this.username + "的数据线提供Type-C接口进行充电~~");
    }

    public String getUsername() {
        return username;
    }
}
