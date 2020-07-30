package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Rogue extends GlobalClass {
    public Rogue(CharacterSheet characterSheet) {
        name = "Rogue";
        characterSheet.setHitDice(8);
        primaryAbility.add(Ability.DEXTERITY);
        weaponProficiencies.addAll(Arrays.asList("Hand crossbows", "longswords", "rapiers", "shortswords"));
        armorProficiencies.add("Light");
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.DEXTERITY, Ability.INTELLIGENCE));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.acrobatics, Skills.athletics, Skills.deception, Skills.insight, Skills.investigation, Skills.intimidation, Skills.perception, Skills.performance, Skills.persuasion, Skills.sleightOfHand, Skills.stealth), 4);
    }
}
