package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Barbarian extends GlobalClass {
    public Barbarian(CharacterSheet characterSheet) {
        name = "Barbarian";
        characterSheet.setHitDice(12);
        primaryAbility.add(Ability.STRENGTH);
        weaponProficiencies.addAll(Arrays.asList("Simple", "Martial"));
        armorProfieciencies.addAll(Arrays.asList("Light", "Medium", "Shields"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList("Strength", "Constitution"));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.animalHandling, Skills.athletics, Skills.intimidation, Skills.nature, Skills.perception, Skills.survival), 2);
        characterSheet.addArmorClass(Ability.getDexModifier() + Ability.getConModifier());
    }
}
