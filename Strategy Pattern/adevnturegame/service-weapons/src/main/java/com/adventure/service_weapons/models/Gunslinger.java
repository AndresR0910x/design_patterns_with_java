package com.adventure.service_weapons.models;

import com.adventure.service_weapons.behaviors.GunBehavior;


public class Gunslinger extends Player{

    public Gunslinger() {
        weaponBehavior = new GunBehavior();
    }



    @Override
    public String display() {
        return " I'm gunslinger and I have a gun";
    }
}
