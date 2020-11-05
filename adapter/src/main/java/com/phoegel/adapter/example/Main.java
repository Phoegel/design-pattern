package com.phoegel.adapter.example;

/**
 * 模拟手机充电过程
 */
public class Main {
    public static void main(String[] args) {
        String zs = "张三";
        String ls = "李四";
        IPhone iPhone = new IPhone(zs);
        System.out.println("我没电了");
        System.out.println();

        System.out.println(zs + "说：‘手机没电了，找数据线充电’");
        System.out.println();

        Lightning lightning = new Lightning(zs);
        lightning.lightning();
        System.out.println("今天" + zs + "忘了带上我>_<");
        lightning = null;
        iPhone.charge(lightning);
        System.out.println();

        System.out.println(ls + "说：‘我有数据线’");
        TypeC typeC = new TypeC(ls);
        typeC.typeC();
        System.out.println();

        System.out.println(zs + "的iPhone不能使用" + ls + "的数据线，不能继续玩手机了╯﹏╰");
    }
}
