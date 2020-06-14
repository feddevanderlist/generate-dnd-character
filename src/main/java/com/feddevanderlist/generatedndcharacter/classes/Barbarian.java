package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Barbarian extends GlobalClass {
    public Barbarian() {
        hitDie = 12;
        primaryAbility.add("Strength");
        weaponProficiencies.addAll(Arrays.asList("Simple", "Martial"));
        armorProfieciencies.addAll(Arrays.asList("Light", "Medium", "Shields"));
        CharacterSheet.savingThrowProficiencies.addAll(Arrays.asList("Strength", "Constitution"));
        CharacterSheet.proficiencyBonus += 2;
        CharacterSheet.addRandomSkillsFromList(Arrays.asList(Skills.animalHandling, Skills.athletics, Skills.intimidation, Skills.nature, Skills.perception, Skills.survival), 2);
        CharacterSheet.addArmorClass(CharacterSheet.abilityScore.getDexterity());
    }
}
