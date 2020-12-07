package com.phoegel.proxy.modify;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------静态代理-----------");
        TicketOffice salesAgency = new SalesAgency();
        String ticket = salesAgency.buy("北京", "上海");
        System.out.println("张三花了5分钟来到家楼下的火车票代售点，买了：" + ticket);

        System.out.println("-----------动态代理-----------");
        DynamicProxy dynamicProxy = new DynamicProxy(new TrainStation());
        TicketOffice ticketOffice = (TicketOffice) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{TicketOffice.class}, dynamicProxy);
        System.out.println("张三花了5分钟来到家楼下的火车票代售点，买了：" + ticketOffice.buy("北京", "上海"));
    }
}
