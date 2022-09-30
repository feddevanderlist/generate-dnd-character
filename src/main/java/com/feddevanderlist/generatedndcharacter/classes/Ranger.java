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
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(AbilityIdentifier.STRENGTH, AbilityIdentifier.DEXTERITY));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.animalHandling, Skills.athletics, Skills.insight, Skills.investigation, Skills.nature, Skills.perception, Skills.stealth, Skills.survival), 2);
    }
}
