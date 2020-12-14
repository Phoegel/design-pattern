package com.phoegel.command.example;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("张三");
        Chef chef = new Chef("李四");
        customer.orderStirFry("回锅肉", chef);
        customer.orderColdDish("凉拌三丝", chef);
    }
}
