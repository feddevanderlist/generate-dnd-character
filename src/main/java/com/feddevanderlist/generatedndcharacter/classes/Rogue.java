package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Rogue extends GlobalClass {
    public Rogue() {
        hitDie = 8;
        primaryAbility.add("Dexterity");
        weaponProficiencies.addAll(Arrays.asList("Hand crossbows", "longswords", "rapiers", "shortswords"));
        armorProfieciencies.add("Light");
        CharacterSheet.savingThrowProficiencies.addAll(Arrays.asList("Dexterity", "Intelligence"));
        CharacterSheet.proficiencyBonus +=2;
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.acrobatics,Skills.athletics,Skills.deception,Skills.insight,Skills.investigation,Skills.intimidation,Skills.perception,Skills.peformance,Skills.persuasion,Skills.sleightOfHand,Skills.stealth),4);
    }
}
