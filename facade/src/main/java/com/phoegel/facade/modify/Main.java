package com.phoegel.facade.modify;

public class Main {
    public static void main(String[] args) {
        // 直接调用外观角色的方法即可
        Facade facade = new Facade();
        facade.start();
    }
}
