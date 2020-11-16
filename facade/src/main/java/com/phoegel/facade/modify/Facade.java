package com.phoegel.facade.modify;

/**
 * 外观角色类
 */
public class Facade {
    private Curtain curtain;
    private Lighting lighting;
    private Projector projector;
    private Computer computer;

    public Facade() {
        curtain = new Curtain();
        lighting = new Lighting();
        projector = new Projector();
        computer = new Computer();
    }

    public void start() {
        curtain.draw();
        lighting.close();
        projector.open();
        computer.play();
    }
}
