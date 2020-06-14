package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Monk extends GlobalClass {
    public Monk() {
        hitDie = 8;
        primaryAbility.addAll(Arrays.asList("Dexterity","Wisdom"));
        weaponProficiencies.addAll(Arrays.asList("Simple","Shortswords"));
        CharacterSheet.savingThrowProficiencies.addAll(Arrays.asList("Strength", "Dexterity"));
        CharacterSheet.proficiencyBonus +=2;
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.acrobatics,Skills.athletics,Skills.history,Skills.insight,Skills.religion,Skills.stealth),2);
    }
}
