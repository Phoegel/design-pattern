package com.phoegel.builder.modify;

/**
 * 轮胎
 */
public class Doughnut {
    // 大小
    private String size;
    // 类型
    private String type;

    public Doughnut(String size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return " 轮胎{" +
                "大小='" + size + '\'' +
                ", 类型='" + type + '\'' +
                '}';
    }
}
