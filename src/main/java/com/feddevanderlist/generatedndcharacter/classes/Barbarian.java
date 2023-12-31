package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;

public class Barbarian extends GlobalClass {
    public Barbarian(CharacterSheet characterSheet) {
        name = "Barbarian";
        characterSheet.setHitDice(12);
        primaryAbilities.add(AbilityIdentifier.STRENGTH);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.SIMPLE, WeaponType.MARTIAL));
        armorProficiencies.addAll(ArmorType.getNotHeavyArmor());
        characterSheet.addSavingThrowProficiencies(Arrays.asList(AbilityIdentifier.STRENGTH, AbilityIdentifier.CONSTITUTION));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.ANIMAL_HANDLING, Skills.ATHLETICS, Skills.INTIMIDATION, Skills.NATURE, Skills.PERCEPTION, Skills.SURVIVAL), 2);
    }
}
