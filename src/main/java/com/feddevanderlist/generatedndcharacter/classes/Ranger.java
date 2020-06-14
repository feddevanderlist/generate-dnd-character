package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Ranger extends GlobalClass {
    public Ranger() {
        hitDie = 10;
        primaryAbility.addAll(Arrays.asList("Dexterity ", "Wisdom"));
        weaponProficiencies.addAll(Arrays.asList("simple", "Martial"));
        armorProfieciencies.addAll(Arrays.asList("Light", "Medium", "Shields"));
        CharacterSheet.savingThrowProficiencies.addAll(Arrays.asList("Strength", "Dexterity"));
        CharacterSheet.proficiencyBonus +=2;
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.animalHandling,Skills.athletics,Skills.insight,Skills.investigation,Skills.nature,Skills.perception,Skills.stealth,Skills.survival),2);
    }
}
