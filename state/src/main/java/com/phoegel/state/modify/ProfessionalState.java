package com.phoegel.state.modify;

public class ProfessionalState extends State {
    @Override
    public String getName() {
        return "高手级";
    }

    @Override
    protected void changeCards() {
        System.out.println("换牌成功");
    }

    @Override
    protected int score(int integral) {
        integral *= 2;
        System.out.println("获得双倍积分" + integral + "积分");
        return integral;
    }
}
