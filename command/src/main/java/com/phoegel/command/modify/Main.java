package com.phoegel.command.modify;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("李四");
        ColdDish coldDish = new ColdDish(chef);
        StirFry stirFry = new StirFry(chef);

        Customer customer = new Customer("张三");
        Waiter waiter = new Waiter("王五");
        waiter.setDish(stirFry);
        customer.orderStirFry("回锅肉", waiter);
        waiter.setDish(coldDish);
        customer.orderColdDishes("凉拌三丝", waiter);
    }
}
