package com.feddevanderlist.generatedndcharacter.classes;

import java.util.ArrayList;
import java.util.List;

public class GlobalClass {
    List<String> weaponProficiencies = new ArrayList<>();
    List<String> armorProfieciencies = new ArrayList<>();
    List<String> primaryAbility = new ArrayList<>();
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

    public List<String> getPrimaryAbility() {
        return primaryAbility;
    }
}
