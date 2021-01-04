package com.phoegel.memento.example;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("张三");
        System.out.println("玩家[" + player.getName() + "]获得幸运道具奖励，状态提升↑");
        player.setVitality(100);
        player.setMana(100);
        player.setAttack(100);
        player.setDefense(100);
        System.out.println("提升后各状态值：");
        player.show();
        System.out.println("玩家将与 Boss PK，先保存一下获得幸运道具时的状态");
        Player backup = new Player(player.getName());
        backup.setVitality(player.getVitality());
        backup.setMana(player.getMana());
        backup.setAttack(player.getAttack());
        backup.setDefense(player.getDefense());
        System.out.println("玩家[" + player.getName() + "]与 Boss PK，状态下降↓");
        player.setVitality(0);
        player.setMana(0);
        player.setAttack(10);
        player.setDefense(10);
        System.out.println("下降后各状态值：");
        player.show();
        System.out.println("玩家恢复到获得幸运道具时的状态");
        player.setVitality(backup.getVitality());
        player.setMana(backup.getMana());
        player.setAttack(backup.getAttack());
        player.setDefense(backup.getDefense());
        System.out.println("恢复后各状态：");
        player.show();
    }
}
