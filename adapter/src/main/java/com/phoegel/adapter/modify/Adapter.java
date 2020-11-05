package com.phoegel.adapter.modify;

/**
 * 接口转接头：适配器角色
 */
public class Adapter extends Lightning {
    private TypeC typeC;

    public Adapter(String username, TypeC typeC) {
        this.typeC = typeC;
        System.out.println("我是" + username + "的转接头");
    }

    @Override
    public void lightning() {
        System.out.println("我的一头适配了" + typeC.getUsername() + "的数据线");
        typeC.typeC();
        System.out.println("我的另一头提供Lightning接口连接手机进行充电~~");
    }
}
