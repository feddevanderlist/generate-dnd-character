package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Wizard extends GlobalClass {
    public Wizard(CharacterSheet characterSheet) {
        name = "Wizard";
        characterSheet.setHitDice(6);

        primaryAbility.add(Ability.INTELLIGENCE);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.DAGGERS, WeaponType.DARTS, WeaponType.SLINGS, WeaponType.QS, WeaponType.LC));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.INTELLIGENCE, Ability.WISDOM));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.history, Skills.insight, Skills.investigation, Skills.religion), 2);
    }
}
