package com.adventure.service_weapons.models;

import com.adventure.service_weapons.behaviors.HammerBehavior;

public class Dwarf extends Player{

    public Dwarf () {
        weaponBehavior = new HammerBehavior();
    }

    @Override
    public String display() {
        return " I'm a dwarf and I be happy because I've my hammer :D";
    }
    
}
