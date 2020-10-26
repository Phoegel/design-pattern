package com.phoegel.factorymethod.modify;

/**
 * 方形镜子工厂：担当具体工厂角色
 */
public class SquareMirrorFactory implements MirrorFactory {
    public Mirror getMirror() {
        return new SquareMirror();
    }
}
