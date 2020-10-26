package com.phoegel.factorymethod.example;

/**
 * 生产产品的工厂类：镜子工厂
 */
public class MirrorFactory {
    public static Mirror getMirror(String type) {
        if("round".equalsIgnoreCase(type)){
            return new RoundMirror();
        }else if("square".equalsIgnoreCase(type)){
            return new SquareMirror();
        }else{
            throw new RuntimeException("选择的类型不存在");
        }
    }
}
