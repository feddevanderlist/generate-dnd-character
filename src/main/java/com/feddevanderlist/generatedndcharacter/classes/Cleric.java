package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Cleric extends GlobalClass {
    public Cleric() {
        hitDie = 8;
        primaryAbility.add("Wisdom");
        weaponProficiencies.add("simple");
        armorProfieciencies.addAll(Arrays.asList("Light", "medium", "shields"));
        CharacterSheet.savingThrowProficiencies.addAll(Arrays.asList("Wisdom", "Charisma"));
        CharacterSheet.proficiencyBonus += 2;
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.history, Skills.insight, Skills.medicine, Skills.persuasion, Skills.religion),2);
    }
}
