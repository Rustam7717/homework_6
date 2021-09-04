package com.company;

public class Warrior extends Player {
    private int Powerful;

    public int getPowerful() {
        return Powerful;
    }

    public void setPowerful(int powerful) {
        Powerful = powerful;
    }

    public Warrior(int strength, String name, int powerful) {
        super(strength, name);
        Powerful = powerful;


    }
    public void powerful(){
        System.out.println("Warrior has more power in hit");
    }
}
