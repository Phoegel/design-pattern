package com.phoegel.singleton.analysis;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // 返回 cpu 处理器核数
        System.out.println(runtime.availableProcessors());
    }
}
