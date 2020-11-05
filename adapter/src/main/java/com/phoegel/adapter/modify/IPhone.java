package com.phoegel.adapter.modify;

/**
 * 手机：客户端使用方
 */
public class IPhone {
    private String username;

    public IPhone(String username) {
        this.username = username;
        System.out.println("我是" + this.username + "的iPhone");
    }

    public void charge(Lightning lightning) {
        System.out.println(this.username + "的iPhone需要Lightning接口进行充电~~");
        if (lightning == null) {
            System.out.println("没带数据线，不能充电");
            return;
        }
        lightning.lightning();
    }
}
