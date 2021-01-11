package com.phoegel.templatemethod.modify;

public class MilkTeaShop {
    private BlackTea blackTea = new BlackTea();
    private CoconutMilkTea coconutMilkTea = new CoconutMilkTea();

    public void makeCoconutMilkTea() {
        coconutMilkTea.makeMilkTea();
    }

    public void makeBlackTea() {
        blackTea.makeMilkTea();
    }
}
