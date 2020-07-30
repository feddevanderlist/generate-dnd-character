package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;

public class Wizard extends GlobalClass {
    public Wizard(CharacterSheet characterSheet) {
        name = "Wizard";
        characterSheet.setHitDice(6);

        primaryAbility.add(Ability.INTELLIGENCE);
        weaponProficiencies.addAll(Arrays.asList("Daggers", "darts", "Slings", "Quarterstaff's", "Light Crossbow"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.INTELLIGENCE, Ability.WISDOM));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.history, Skills.insight, Skills.investigation, Skills.religion), 2);
    }
}
