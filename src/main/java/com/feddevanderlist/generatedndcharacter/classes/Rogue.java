package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;

public class Rogue extends GlobalClass {
    public Rogue(CharacterSheet characterSheet) {
        name = "Rogue";
        characterSheet.setHitDice(8);
        primaryAbilities.add(AbilityIdentifier.DEXTERITY);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.HC, WeaponType.LS, WeaponType.RAPIER, WeaponType.SH));
        armorProficiencies.add(ArmorType.LIGHT);
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(AbilityIdentifier.DEXTERITY, AbilityIdentifier.INTELLIGENCE));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.ACROBATICS, Skills.ATHLETICS, Skills.DECEPTION, Skills.INSIGHT, Skills.INVESTIGATION, Skills.INTIMIDATION, Skills.PERCEPTION, Skills.PERFORMANCE, Skills.PERSUASION, Skills.SLEIGHT_OF_HAND, Skills.STEALTH), 4);
    }
}
