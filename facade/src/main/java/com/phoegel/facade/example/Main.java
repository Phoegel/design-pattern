package com.phoegel.facade.example;

/**
 * 模拟在家看电影的过程
 */
public class Main {
    public static void main(String[] args) {
        Curtain curtain = new Curtain();
        Lighting lighting = new Lighting();
        Projector projector = new Projector();
        Computer computer = new Computer();
        curtain.draw();
        lighting.close();
        projector.open();
        computer.play();
    }
}
