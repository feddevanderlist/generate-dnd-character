package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Wizard extends GlobalClass {
    public Wizard() {
        hitDie = 6;
        primaryAbility.add("Intelligence");
        weaponProficiencies.addAll(Arrays.asList("Daggers","darts","Slings","Quarterstaffs","Light Crossbow"));
        CharacterSheet.savingThrowProficiencies.addAll(Arrays.asList("Intelligence", "Wisdom"));
        CharacterSheet.proficiencyBonus +=2;
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana,Skills.history,Skills.insight,Skills.investigation,Skills.religion),2);
    }
}
