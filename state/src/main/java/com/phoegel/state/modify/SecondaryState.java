package com.phoegel.state.modify;

public class SecondaryState extends State {
    @Override
    public String getName() {
        return "熟练级";
    }

    @Override
    protected void changeCards() {
        System.out.println("该等级太低，不支持换牌操作");
    }

    @Override
    protected int score(int integral) {
        integral *= 2;
        System.out.println("获得双倍积分" + integral + "积分");
        return integral;
    }
}
