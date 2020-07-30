package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.Ability;

import java.util.ArrayList;
import java.util.List;

public class GlobalClass {
    final List<String> weaponProficiencies = new ArrayList<>();
    final List<String> armorProficiencies = new ArrayList<>();
    final List<Ability> primaryAbility = new ArrayList<>();
    String name;

    public String getName() {
        return name;
    }

    public List<String> getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public List<String> getArmorProficiencies() {
        return armorProficiencies;
    }

    public List<Ability> getPrimaryAbility() {
        return primaryAbility;
    }
}
