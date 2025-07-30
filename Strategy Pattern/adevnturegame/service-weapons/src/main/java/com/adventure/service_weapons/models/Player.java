package com.adventure.service_weapons.models;


import com.adventure.service_weapons.behaviors.WeaponBehavior;

public abstract class Player {
    protected WeaponBehavior weaponBehavior;


    public String performAttack() {
        return weaponBehavior.WeaponAction();
    }
    
    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }

    public abstract String display();
    
}
