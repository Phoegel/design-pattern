package com.phoegel.proxy.modify;

/**
 * 真实主题角色类：火车站
 */
public class TrainStation implements TicketOffice {
    public String buy(String start, String end) {
        return "车票：[起点：" + start + "\t终点：" + end + "]";
    }
}
