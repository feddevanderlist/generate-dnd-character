package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.Ability;

import java.util.ArrayList;
import java.util.List;

public class GlobalClass {
    List<String> weaponProficiencies = new ArrayList<>();
    List<String> armorProfieciencies = new ArrayList<>();
    List<Ability> primaryAbility = new ArrayList<>();
    String name;

    public String getName() {
        return name;
    }

    public List<String> getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public List<String> getArmorProfieciencies() {
        return armorProfieciencies;
    }

    public List<Ability> getPrimaryAbility() {
        return primaryAbility;
    }
}
