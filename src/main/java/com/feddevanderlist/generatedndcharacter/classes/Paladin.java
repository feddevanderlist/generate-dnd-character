package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Paladin extends GlobalClass {
    public Paladin() {
        hitDie = 10;
        primaryAbility.addAll(Arrays.asList("Strength", "Charisma"));
        weaponProficiencies.addAll(Arrays.asList("simple", "Martial"));
        armorProfieciencies.addAll(Arrays.asList("All Armor", "All Shields"));
        CharacterSheet.getSavingThrowProficiencies().addAll(Arrays.asList("Wisdom", "Charisma"));
        CharacterSheet.addProficiencyBonus(2);
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.athletics, Skills.insight, Skills.intimidation, Skills.medicine, Skills.persuasion, Skills.religion), 2);
    }
}
