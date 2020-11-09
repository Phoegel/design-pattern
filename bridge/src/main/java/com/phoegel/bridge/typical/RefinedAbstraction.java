package com.phoegel.bridge.typical;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    @Override
    public void operation() {
        // 调用实现类的方法
        impl.operationImpl();
        // 业务代码
    }
}
