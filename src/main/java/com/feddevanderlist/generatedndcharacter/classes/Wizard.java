package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Wizard extends GlobalClass {
    public Wizard(CharacterSheet characterSheet) {
        name = "Wizard";
        characterSheet.setHitDice(6);
        primaryAbility.add("Intelligence");
        weaponProficiencies.addAll(Arrays.asList("Daggers", "darts", "Slings", "Quarterstaffs", "Light Crossbow"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList("Intelligence", "Wisdom"));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.history, Skills.insight, Skills.investigation, Skills.religion), 2);
    }
}
