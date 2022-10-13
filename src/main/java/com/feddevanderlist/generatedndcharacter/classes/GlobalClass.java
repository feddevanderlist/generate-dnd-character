package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.ArmorType;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.ArrayList;
import java.util.List;

public abstract class GlobalClass {
    protected final List<WeaponType> weaponProficiencies = new ArrayList<>();
    protected final List<ArmorType> armorProficiencies = new ArrayList<>();
    protected final List<AbilityIdentifier> primaryAbilities = new ArrayList<>();
    protected String name;

    public String getName() {
        return name;
    }

    public List<WeaponType> getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public List<ArmorType> getArmorProficiencies() {
        return armorProficiencies;
    }

    public List<AbilityIdentifier> getPrimaryAbility() {
        return primaryAbilities;
    }
}
