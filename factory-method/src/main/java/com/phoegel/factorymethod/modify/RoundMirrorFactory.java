package com.phoegel.factorymethod.modify;

/**
 * 圆形镜子工厂：担当具体工厂角色
 */
public class RoundMirrorFactory implements MirrorFactory {
    public Mirror getMirror() {
        return new RoundMirror();
    }
}
