package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;

public class Ranger extends GlobalClass {
    public Ranger(CharacterSheet characterSheet) {
        name = "Ranger";
        characterSheet.setHitDice(10);
        primaryAbilities.addAll(Arrays.asList(AbilityIdentifier.DEXTERITY, AbilityIdentifier.WISDOM));
        weaponProficiencies.addAll(Arrays.asList(WeaponType.SIMPLE, WeaponType.MARTIAL));
        armorProficiencies.addAll(ArmorType.getNotHeavyArmor());
        characterSheet.addSavingThrowProficiencies(Arrays.asList(AbilityIdentifier.STRENGTH, AbilityIdentifier.DEXTERITY));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.ANIMAL_HANDLING, Skills.ATHLETICS, Skills.INSIGHT, Skills.INVESTIGATION, Skills.NATURE, Skills.PERCEPTION, Skills.STEALTH, Skills.SURVIVAL), 2);
    }
}
