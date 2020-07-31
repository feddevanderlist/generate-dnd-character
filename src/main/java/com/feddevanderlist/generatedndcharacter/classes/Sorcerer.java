package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Sorcerer extends GlobalClass {
    public Sorcerer(CharacterSheet characterSheet) {
        name = "Sorcerer";
        characterSheet.setHitDice(6);
        primaryAbility.add(Ability.CHARISMA);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.DAGGER, WeaponType.DARTS, WeaponType.SLING, WeaponType.QS,WeaponType.LC));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.CHARISMA, Ability.CONSTITUTION));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.deception, Skills.insight, Skills.intimidation, Skills.persuasion, Skills.religion), 2);
    }
}
