package com.phoegel.simplefactory.modify;

/**
 * 控制台记录器：担当 ProductA （产品A）角色
 */
public class ConsoleLogger implements Logger {
    @Override
    public void log(String info) {
        System.out.println("控制台记录:" + info);
    }
}
