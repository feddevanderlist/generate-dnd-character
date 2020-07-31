package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Skills;

import java.util.Arrays;

public class Fighter extends GlobalClass {
    public Fighter(CharacterSheet characterSheet) {
        name = "Fighter";
        characterSheet.setHitDice(10);
        primaryAbility.addAll(Arrays.asList(Ability.DEXTERITY, Ability.STRENGTH));
        weaponProficiencies.addAll(Arrays.asList("simple", "Martial"));
        armorProficiencies.addAll(Arrays.asList("All Armor", "All Shields"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.STRENGTH, Ability.CONSTITUTION));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.acrobatics, Skills.animalHandling, Skills.athletics, Skills.history, Skills.insight, Skills.intimidation, Skills.perception, Skills.survival), 2);
    }
}
