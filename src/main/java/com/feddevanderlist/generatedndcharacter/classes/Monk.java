package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Monk extends GlobalClass {
    public Monk(CharacterSheet characterSheet) {
        name = "Monk";
        characterSheet.setHitDice(8);
        primaryAbility.addAll(Arrays.asList(Ability.DEXTERITY, Ability.WISDOM));
        weaponProficiencies.addAll(Arrays.asList("Simple", "Shortswords"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.STRENGTH, Ability.DEXTERITY));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.acrobatics, Skills.athletics, Skills.history, Skills.insight, Skills.religion, Skills.stealth), 2);
    }
}
