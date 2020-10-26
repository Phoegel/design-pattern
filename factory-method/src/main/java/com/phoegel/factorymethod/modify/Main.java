package com.phoegel.factorymethod.modify;

/**
 * 客户端通过不同的镜子工厂来生成镜子，从而使用不同的镜子
 */
public class Main {
    public static void main(String[] args) {
        // 通过使用不同的镜子工厂来创建实际镜子对象
        MirrorFactory mirrorFactory = new RoundMirrorFactory();
//        MirrorFactory mirrorFactory = new SquareMirrorFactory();
        Mirror mirror = mirrorFactory.getMirror();
        mirror.look();
    }
}
