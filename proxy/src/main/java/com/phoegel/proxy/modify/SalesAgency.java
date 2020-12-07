package com.phoegel.proxy.modify;

/**
 * 代理主题角色类：代售处
 */
public class SalesAgency implements TicketOffice {
    private TrainStation trainStation;

    public SalesAgency() {
        this.trainStation = new TrainStation();
    }

    public String buy(String start, String end) {
        return trainStation.buy(start, end);
    }
}
