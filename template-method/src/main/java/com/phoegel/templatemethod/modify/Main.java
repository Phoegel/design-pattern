package com.phoegel.templatemethod.modify;

public class Main {
    public static void main(String[] args) {
        MilkTeaShop milkTeaShop = new MilkTeaShop();
        milkTeaShop.makeCoconutMilkTea();
        System.out.println("----------------");
        milkTeaShop.makeBlackTea();
    }
}
