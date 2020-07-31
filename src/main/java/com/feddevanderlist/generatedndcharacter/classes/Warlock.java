package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Skills;

import java.util.Arrays;

public class Warlock extends GlobalClass {
    public Warlock(CharacterSheet characterSheet) {
        name = "Warlock";
        characterSheet.setHitDice(8);
        primaryAbility.add(Ability.CHARISMA);
        weaponProficiencies.add("Light");
        armorProficiencies.add("Simple");
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.CHARISMA, Ability.WISDOM));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.deception, Skills.history, Skills.intimidation, Skills.investigation, Skills.nature, Skills.religion), 2);
    }
}
