package com.phoegel.state.modify;

public class Player {
    // 初始积分为 0
    private int integral = 0;

    // 初始等级为入门级
    private State state = new PrimaryState();

    public void play() {
        System.out.println("开始游戏");
        System.out.println("当前积分为：" + this.integral + "\t当前等级为：" + this.state.getName());
        System.out.println("游戏进行中");
        changeCards();
        System.out.println("游戏结束");
        // 这里方便演示结果，直接设置为胜利
        System.out.println("游戏胜利，获得100积分");
        score();
        changeGrade();
        System.out.println("当前积分为：" + this.integral + "\t当前等级为：" + this.state.getName());
    }

    // 换牌操作
    private void changeCards() {
        state.changeCards();
    }

    // 计算得分
    private void score() {
        int integral = 100;
        this.integral += state.score(integral);
    }

    // 转换等级
    private void changeGrade() {
        if (this.integral < 100) {
            this.state = new PrimaryState();
        } else if (this.integral < 300) {
            this.state = new SecondaryState();
        } else {
            this.state = new ProfessionalState();
        }
    }
}
