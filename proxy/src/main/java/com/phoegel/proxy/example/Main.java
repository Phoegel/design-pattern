package com.phoegel.proxy.example;

public class Main {
    public static void main(String[] args) {
        TrainStation trainStation = new TrainStation();
        String ticket = trainStation.buy("北京", "上海");
        System.out.println("张三的家离火车站很远，于是坐了两个小时的车来到火车站，买了：" + ticket);
    }
}
