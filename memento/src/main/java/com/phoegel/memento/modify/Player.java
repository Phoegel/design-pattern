package com.phoegel.memento.modify;

/**
 * 原发器类
 */
public class Player {
    // 玩家姓名
    private String name;
    // 生命值
    private int vitality;
    // 法力值
    private int mana;
    // 攻击值
    private int attack;
    // 防御值
    private int defense;

    public Player(String name) {
        this.name = name;
        // 创建玩家时初始化各个状态默认值
        this.vitality = 50;
        this.mana = 50;
        this.attack = 50;
        this.defense = 50;
        show();
    }

    // 创建一个备忘录对象
    public Memento createMemento() {
        return new Memento(this);
    }

    // 根据备忘录对象恢复原发器状态
    public void restoreMemento(Memento memento) {
        this.name = memento.getName();
        this.vitality = memento.getVitality();
        this.mana = memento.getMana();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    public void show() {
        System.out.println("玩家{" +
                "姓名='" + name + '\'' +
                ", 生命值=" + vitality +
                ", 法力值=" + mana +
                ", 攻击值=" + attack +
                ", 防御值=" + defense +
                '}');
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
