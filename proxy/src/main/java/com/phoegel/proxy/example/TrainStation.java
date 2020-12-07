package com.phoegel.proxy.example;

/**
 * 模拟火车站，提供购票的方法
 */
public class TrainStation {
    public String buy(String start, String end) {
        return "车票：[起点：" + start + "\t终点：" + end + "]";
    }
}
