package com.phoegel.builder.modify;

/**
 * 汽车
 */
public class Car {
    // 方向盘
    private SteeringWheel steeringWheel;
    // 轮胎
    private Doughnut doughnut;

    @Override
    public String toString() {
        return "汽车{" +
                "方向盘=" + steeringWheel +
                ", 轮胎=" + doughnut +
                '}';
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Doughnut getDoughnut() {
        return doughnut;
    }

    public void setDoughnut(Doughnut doughnut) {
        this.doughnut = doughnut;
    }
}
