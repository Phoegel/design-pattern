package com.phoegel.memento.modify;

/**
 * 备忘录角色类
 */
public class Memento {
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

    public Memento(Player player) {
        this.name = player.getName();
        this.vitality = player.getVitality();
        this.mana = player.getMana();
        this.attack = player.getAttack();
        this.defense = player.getDefense();
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
