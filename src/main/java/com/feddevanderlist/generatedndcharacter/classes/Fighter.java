package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;

public class Fighter extends GlobalClass {
    public Fighter(CharacterSheet characterSheet) {
        name = "Fighter";
        characterSheet.setHitDice(10);
        primaryAbilities.addAll(Arrays.asList(AbilityIdentifier.DEXTERITY, AbilityIdentifier.STRENGTH));
        weaponProficiencies.addAll(Arrays.asList(WeaponType.SIMPLE, WeaponType.MARTIAL));
        armorProficiencies.addAll(ArmorType.getAllArmor());
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(AbilityIdentifier.STRENGTH, AbilityIdentifier.CONSTITUTION));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.ACROBATICS, Skills.ANIMAL_HANDLING, Skills.ATHLETICS, Skills.HISTORY, Skills.INSIGHT, Skills.INTIMIDATION, Skills.PERCEPTION, Skills.SURVIVAL), 2);
    }
}
