package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Presentation of our HEROEs!!!");
        Boss boss = new Boss(100, "BigBoss ", 50);

        System.out.println("First hero is: " + boss.getName() + "His strength: " + boss.getStrength() + " his EX:" + boss.getExtraAbility());
        boss.extraAbility();

        Warrior warrior = new Warrior(70, "Steph ", 30);
        System.out.println("Second hero is: " + warrior.getName() + "His strength: " + warrior.getStrength() + " his EX:" + warrior.getPowerful());
        warrior.powerful();

        Magical magical = new Magical(75, "Howard ", 10);
        System.out.println("Third hero is: " + magical.getName() + "His strength: " + magical.getStrength() + " his EX:" + magical.getFade());
        magical.fade();

        Mental mental = new Mental(85, "Brain ", 40);
        System.out.println("Fourth hero is: " + mental.getName() + "His strength: " + mental.getStrength() + " his EX:" + mental.getMMM());
        mental.mental();

    }


}
