package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Sorcerer extends GlobalClass {
    public Sorcerer() {
        hitDie = 6;
        primaryAbility.add("Charisma");
        weaponProficiencies.addAll(Arrays.asList("Daggers", "Darts", "Slings", "Quarterstaffs", "Light Crossbows"));
        CharacterSheet.getSavingThrowProficiencies().addAll(Arrays.asList("Charisma", "Constitution"));
        CharacterSheet.addProficiencyBonus(2);
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana,Skills.deception,Skills.insight,Skills.intimidation,Skills.persuasion,Skills.religion),2);
    }
}
