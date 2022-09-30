package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;

public class Warlock extends GlobalClass {
    public Warlock(CharacterSheet characterSheet) {
        name = "Warlock";
        characterSheet.setHitDice(8);
        primaryAbilities.add(AbilityIdentifier.CHARISMA);
        armorProficiencies.add(ArmorType.LIGHT);
        weaponProficiencies.add(WeaponType.SIMPLE);
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(AbilityIdentifier.CHARISMA, AbilityIdentifier.WISDOM));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.deception, Skills.history, Skills.intimidation, Skills.investigation, Skills.nature, Skills.religion), 2);
    }
}
