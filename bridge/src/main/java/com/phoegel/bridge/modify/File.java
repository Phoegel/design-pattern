package com.phoegel.bridge.modify;

/**
 * 抽象类角色
 */
public abstract class File {
    protected Database dataBase;

    public void setDataBase(Database dataBase) {
        this.dataBase = dataBase;
    }

    public abstract void translate();
}
