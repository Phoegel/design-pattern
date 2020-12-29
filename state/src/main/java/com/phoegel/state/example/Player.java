package com.phoegel.state.example;

public class Player {
    // 初始积分为 0
    private int integral = 0;

    // 初始等级为入门级
    private String grade = "入门级";

    public void play() {
        System.out.println("开始游戏");
        System.out.println("当前积分为：" + this.integral + "\t当前等级为：" + this.grade);
        System.out.println("游戏进行中");
        changeCards();
        System.out.println("游戏结束");
        // 这里方便演示结果，直接设置为胜利
        System.out.println("游戏胜利，获得100积分");
        score();
        changeGrade();
        System.out.println("当前积分为：" + this.integral + "\t当前等级为：" + this.grade);
    }

    // 换牌操作
    private void changeCards() {
        if (grade.equals("入门级") || grade.equals("熟练级")) {
            System.out.println("该等级太低，不支持换牌操作");
        } else if (grade.equals("高手级")) {
            System.out.println("换牌成功");
        }
    }

    // 计算得分
    private void score() {
        int integral = 100;
        if (grade.equals("入门级")) {
            System.out.println("正常累加" + integral + "积分");
        } else if (grade.equals("熟练级") || grade.equals("高手级")) {
            integral *= 2;
            System.out.println("获得双倍积分" + integral + "积分");
        }
        this.integral += integral;
    }

    // 转换等级
    private void changeGrade() {
        // 这里假设小于 100 积分为入门级，100-300 为熟练级，大于等于 300 为高手级
        if (this.integral < 100) {
            this.grade = "入门级";
        } else if (this.integral < 300) {
            this.grade = "熟练级";
        } else {
            this.grade = "高手级";
        }
    }
}
