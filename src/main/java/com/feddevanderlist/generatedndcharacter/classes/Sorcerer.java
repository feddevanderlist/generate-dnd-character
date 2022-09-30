package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Sorcerer extends GlobalClass {
    public Sorcerer(CharacterSheet characterSheet) {
        name = "Sorcerer";
        characterSheet.setHitDice(6);
        primaryAbilities.add(AbilityIdentifier.CHARISMA);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.DAGGER, WeaponType.DARTS, WeaponType.SLING, WeaponType.QS,WeaponType.LC));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(AbilityIdentifier.CHARISMA, AbilityIdentifier.CONSTITUTION));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.ARCANA, Skills.DECEPTION, Skills.INSIGHT, Skills.INTIMIDATION, Skills.PERSUASION, Skills.RELIGION), 2);
    }
}
