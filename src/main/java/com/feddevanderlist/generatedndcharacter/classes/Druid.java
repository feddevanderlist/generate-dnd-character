package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Druid extends GlobalClass {
    public Druid() {
        hitDie = 8;
        primaryAbility.add("Wisdom");
        weaponProficiencies.addAll(Arrays.asList("Clubs", "Shields", "Darts", "Javelins", "Maces", "Quarterstaffs", "Scimitars", "Sickles", "Slings", "Spears"));
        armorProfieciencies.addAll(Arrays.asList("Light (nonmetal)", "Medium (nonmetal)", "Shields (nonmetal)"));
        CharacterSheet.getSavingThrowProficiencies().addAll(Arrays.asList("Wisdom", "Intelligence"));
        CharacterSheet.addProficiencyBonus(2);
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.animalHandling, Skills.insight, Skills.medicine, Skills.nature, Skills.perception, Skills.religion, Skills.survival), 2);
    }
}
