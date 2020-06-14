package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Fighter extends GlobalClass {
    public Fighter() {
        hitDie = 10;
        primaryAbility.addAll(Arrays.asList("Strength", "Dexterity"));
        weaponProficiencies.addAll(Arrays.asList("simple", "Martial"));
        armorProfieciencies.addAll(Arrays.asList("All Armor", "All Shields"));
        CharacterSheet.savingThrowProficiencies.addAll(Arrays.asList("Strength", "Constitution"));
        CharacterSheet.proficiencyBonus = +2;
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.acrobatics, Skills.animalHandling, Skills.athletics, Skills.history, Skills.insight, Skills.intimidation, Skills.perception, Skills.survival), 2);
    }
}
