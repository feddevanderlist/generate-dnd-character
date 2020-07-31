package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.models.ArmorType;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.ArrayList;
import java.util.List;

public class GlobalClass {
    final List<WeaponType> weaponProficiencies = new ArrayList<>();
    final List<ArmorType> armorProficiencies = new ArrayList<>();
    final List<Ability> primaryAbility = new ArrayList<>();
    String name;

    public String getName() {
        return name;
    }

    public List<WeaponType> getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public List<ArmorType> getArmorProficiencies() {
        return armorProficiencies;
    }

    public List<Ability> getPrimaryAbility() {
        return primaryAbility;
    }
}
