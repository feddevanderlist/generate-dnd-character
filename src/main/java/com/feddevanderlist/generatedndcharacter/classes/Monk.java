package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Monk extends GlobalClass {
    public Monk(CharacterSheet characterSheet) {
        name = "Monk";
        characterSheet.setHitDice(8);
        primaryAbilities.addAll(Arrays.asList(AbilityIdentifier.DEXTERITY, AbilityIdentifier.WISDOM));
        weaponProficiencies.addAll(Arrays.asList(WeaponType.SIMPLE, WeaponType.SH));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(AbilityIdentifier.STRENGTH, AbilityIdentifier.DEXTERITY));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.ACROBATICS, Skills.ATHLETICS, Skills.HISTORY, Skills.INSIGHT, Skills.RELIGION, Skills.STEALTH), 2);
    }
}
