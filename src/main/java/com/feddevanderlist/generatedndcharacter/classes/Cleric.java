package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;

public class Cleric extends GlobalClass {
    public Cleric(CharacterSheet characterSheet) {
        name = "Cleric";
        characterSheet.setHitDice(8);
        primaryAbilities.add(AbilityIdentifier.WISDOM);
        weaponProficiencies.add(WeaponType.SIMPLE);
        armorProficiencies.addAll(ArmorType.getNotHeavyArmor());
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(AbilityIdentifier.WISDOM, AbilityIdentifier.CHARISMA));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.history, Skills.insight, Skills.medicine, Skills.persuasion, Skills.religion), 2);
    }
}
