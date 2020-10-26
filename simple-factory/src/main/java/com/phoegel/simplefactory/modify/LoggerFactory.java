package com.phoegel.simplefactory.modify;

/**
 * 记录器工厂：担当 Factory（工厂类）角色
 */
public class LoggerFactory {
    public static Logger getLogger(String type) {
        if ("console".equalsIgnoreCase(type)) {
            return new ConsoleLogger();
        } else if ("file".equalsIgnoreCase(type)) {
            return new FileLogger();
        } else {
            throw new RuntimeException("选择的记录器不存在");
        }
    }
}
