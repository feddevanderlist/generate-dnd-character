package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Sorcerer extends GlobalClass {
    public Sorcerer(CharacterSheet characterSheet) {
        name = "Sorcerer";
        characterSheet.setHitDice(6);
        primaryAbility.add(Ability.CHARISMA);
        weaponProficiencies.addAll(Arrays.asList("Daggers", "Darts", "Slings", "Quarterstaffs", "Light Crossbows"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList("Charisma", "Constitution"));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.deception, Skills.insight, Skills.intimidation, Skills.persuasion, Skills.religion), 2);
    }
}
