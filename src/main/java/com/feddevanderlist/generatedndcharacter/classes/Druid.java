package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Druid extends GlobalClass {
    public Druid(CharacterSheet characterSheet) {
        name = "Druid";
        characterSheet.setHitDice(8);
        primaryAbility.add(Ability.WISDOM);
        weaponProficiencies.addAll(Arrays.asList("Clubs", "Shields", "Darts", "Javelins", "Maces", "Quarterstaffs", "Scimitars", "Sickles", "Slings", "Spears"));
        armorProfieciencies.addAll(Arrays.asList("Light (nonmetal)", "Medium (nonmetal)", "Shields (nonmetal)"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.WISDOM, Ability.INTELLIGENCE));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.animalHandling, Skills.insight, Skills.medicine, Skills.nature, Skills.perception, Skills.religion, Skills.survival), 2);
    }
}
