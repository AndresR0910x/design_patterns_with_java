package com.adventure.service_weapons.models;

import com.adventure.service_weapons.behaviors.SwordBehavior;

public class Knight extends Player{

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public String display() {
        return "I'm a Knight and, I must have a sword";
    }
    
}
