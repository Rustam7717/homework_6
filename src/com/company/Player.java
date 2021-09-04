package com.company;

public class Player {
    private int strength;
    private String name;

    public Player(int strength, String name) {
        this.strength = strength;
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int life) {
        this.strength = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

