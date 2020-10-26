package com.phoegel.simplefactory.modify;

/**
 * 文件记录器：担当 ProductB （产品B）角色
 */
public class FileLogger implements Logger {
    @Override
    public void log(String info) {
        System.out.println("文件记录:" + info);
    }
}
