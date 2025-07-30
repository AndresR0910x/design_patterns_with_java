package com.adventure.service_weapons.models;

import com.adventure.service_weapons.behaviors.ArchBehavior;

public class Elf extends Player{

    public Elf() {
        weaponBehavior = new ArchBehavior();
    }

    @Override
    public String display() {
        return "I'm a Elf and I have a arch";
    }
    
}
