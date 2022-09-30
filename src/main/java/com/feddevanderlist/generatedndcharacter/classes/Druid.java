package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;

public class Druid extends GlobalClass {
    public Druid(CharacterSheet characterSheet) {
        name = "Druid";
        characterSheet.setHitDice(8);
        primaryAbilities.add(AbilityIdentifier.WISDOM);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.CLUB, WeaponType.SHIELD, WeaponType.DARTS, WeaponType.JAVELIN, WeaponType.MACE, WeaponType.QS, WeaponType.ST, WeaponType.SICKLE, WeaponType.SLING, WeaponType.SPEAR));
        armorProficiencies.addAll(ArmorType.getNonMetalArmor());
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(AbilityIdentifier.WISDOM, AbilityIdentifier.INTELLIGENCE));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.animalHandling, Skills.insight, Skills.medicine, Skills.nature, Skills.perception, Skills.religion, Skills.survival), 2);
    }
}
