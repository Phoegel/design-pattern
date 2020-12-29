package com.phoegel.state.modify;

public class PrimaryState extends State {
    @Override
    public String getName() {
        return "入门级";
    }

    @Override
    protected void changeCards() {
        System.out.println("该等级太低，不支持换牌操作");
    }

    @Override
    protected int score(int integral) {
        System.out.println("正常累加100积分");
        return integral;
    }
}
