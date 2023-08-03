package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;

public class Paladin extends GlobalClass {
    public Paladin(CharacterSheet characterSheet) {
        name = "Paladin";
        characterSheet.setHitDice(10);
        primaryAbilities.addAll(Arrays.asList(AbilityIdentifier.STRENGTH, AbilityIdentifier.CHARISMA));
        weaponProficiencies.addAll(Arrays.asList(WeaponType.SIMPLE, WeaponType.MARTIAL));
        armorProficiencies.addAll(ArmorType.getAllArmor());
        characterSheet.addSavingThrowProficiencies(Arrays.asList(AbilityIdentifier.WISDOM, AbilityIdentifier.CHARISMA));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.ATHLETICS, Skills.INSIGHT, Skills.INTIMIDATION, Skills.MEDICINE, Skills.PERSUASION, Skills.RELIGION), 2);
    }
}
