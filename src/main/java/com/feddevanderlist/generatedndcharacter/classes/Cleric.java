package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Skills;

import java.util.Arrays;

public class Cleric extends GlobalClass {
    public Cleric(CharacterSheet characterSheet) {
        name = "Cleric";
        characterSheet.setHitDice(8);
        primaryAbility.add(Ability.WISDOM);
        weaponProficiencies.add("simple");
        armorProficiencies.addAll(Arrays.asList("Light", "medium", "shields"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.WISDOM, Ability.CHARISMA));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.history, Skills.insight, Skills.medicine, Skills.persuasion, Skills.religion), 2);
    }
}
