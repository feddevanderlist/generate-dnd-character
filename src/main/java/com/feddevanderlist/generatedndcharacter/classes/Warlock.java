package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Warlock extends GlobalClass {
    public Warlock(CharacterSheet characterSheet) {
        name = "Warlock";
        characterSheet.setHitDice(8);
        primaryAbility.add(Ability.CHARISMA);
        weaponProficiencies.add("Light");
        armorProfieciencies.add("Simple");
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList("Charisma", "Wisdom"));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.deception, Skills.history, Skills.intimidation, Skills.investigation, Skills.nature, Skills.religion), 2);
    }
}
