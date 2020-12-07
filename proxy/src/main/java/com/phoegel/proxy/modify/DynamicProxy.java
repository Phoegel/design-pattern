package com.phoegel.proxy.modify;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 通过实现 InvocationHandler 接口运用动态代理模式
 */
public class DynamicProxy implements InvocationHandler {
    // 被代理的对象
    private Object object;

    // 注入真实主题角色
    public DynamicProxy(Object object) {
        this.object = object;
    }

    // 重写 invoke() 方法，内部调用真实主题角色的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
