package com.phoegel.builder.example;

/**
 * 方向盘
 */
public class SteeringWheel {
    // 大小
    private String size;
    // 类型
    private String type;

    public SteeringWheel(String size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return " 方向盘{" +
                "大小='" + size + '\'' +
                ", 类型='" + type + '\'' +
                '}';
    }
}
