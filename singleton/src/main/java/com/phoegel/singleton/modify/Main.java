package com.phoegel.singleton.modify;

public class Main {
    public static void main(String[] args) {
        App app1 = App.getInstance();
        app1.open();
        App app2 = App.getInstance();
        System.out.println(app1 == app2);
    }
}
