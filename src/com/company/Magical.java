package com.company;

public class Magical extends Player {
    private int Fade;

    public int getFade() {
        return Fade;
    }

    public void setFade(int fade) {
        Fade = fade;
    }

    public Magical(int strength, String name, int fade) {
        super(strength, name);
        Fade = fade;

    }
    public void fade(){
        System.out.println("Magical can fade away");
    }
}
