package com.company;

public class Mental extends Player {
    private int MMM;

    public int getMMM() {
        return MMM;
    }

    public void setMMM(int MMM) {
        this.MMM = MMM;
    }

    public Mental(int strength, String name, int MMM) {
        super(strength, name);
        this.MMM = MMM;

    }
    public void mental(){
        System.out.println("Mental has unique extras");
    }
}
