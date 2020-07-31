package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Skills;

import java.util.Arrays;

public class Ranger extends GlobalClass {
    public Ranger(CharacterSheet characterSheet) {
        name = "Ranger";
        characterSheet.setHitDice(10);
        primaryAbility.addAll(Arrays.asList(Ability.DEXTERITY, Ability.WISDOM));
        weaponProficiencies.addAll(Arrays.asList("simple", "Martial"));
        armorProficiencies.addAll(Arrays.asList("Light", "Medium", "Shields"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.STRENGTH, Ability.DEXTERITY));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.animalHandling, Skills.athletics, Skills.insight, Skills.investigation, Skills.nature, Skills.perception, Skills.stealth, Skills.survival), 2);
    }
}
