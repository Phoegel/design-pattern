package com.phoegel.strategy.example;

public class Hero {
    private String state = "人类形态";

    // 标枪投掷
    public void javelin() {
        if ("人类形态".equals(state)) {
            System.out.println("使用标枪投掷目标进行攻击~~");
        } else if ("美洲狮形态".equals(state)) {
            System.out.println("攻击会试图对目标造成致命伤害~~");
        }
    }

    // 丛林伏击
    public void bushwhack() {
        if ("人类形态".equals(state)) {
            System.out.println("在指定位置放置陷阱，踩到陷阱的单位将会暴露出来并受到持续伤害~~");
        } else if ("美洲狮形态".equals(state)) {
            System.out.println("猛扑向目标，落地时造成伤害~~");
        }
    }

    // 野性奔腾
    public void wildGallop() {
        if ("人类形态".equals(state)) {
            System.out.println("治疗友方单位，并短暂提升他们的攻击速度");
        } else if ("美洲狮形态".equals(state)) {
            System.out.println("迅速的挥爪攻击面前的敌人");
        }
    }

    public void setState(String state) {
        this.state = state;
    }
}
