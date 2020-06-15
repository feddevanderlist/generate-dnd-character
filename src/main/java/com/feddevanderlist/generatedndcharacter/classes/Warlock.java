package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Warlock extends GlobalClass {
    public Warlock() {
        hitDie = 8;
        primaryAbility.add("Charisma");
        weaponProficiencies.add("Light");
        armorProfieciencies.add("Simple");
        CharacterSheet.getSavingThrowProficiencies().addAll(Arrays.asList("Charisma", "Wisdom"));
        CharacterSheet.addProficiencyBonus(2);
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana,Skills.deception,Skills.history,Skills.intimidation,Skills.investigation,Skills.nature,Skills.religion),2);
    }
}
