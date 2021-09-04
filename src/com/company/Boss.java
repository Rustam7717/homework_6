package com.company;

public class Boss extends Player {
    private int ExtraAbility;

    public int getExtraAbility() {
        return ExtraAbility;
    }

    public void setExtraAbility(int extraAbility) {
        ExtraAbility = extraAbility;
    }

    public Boss(int strength, String name, int extraAbility) {
        super(strength, name);
        ExtraAbility = extraAbility;

    }
    public void extraAbility(){
        System.out.println("Boss has extra strength ");
    }
}
