package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Wizard extends GlobalClass {
    public Wizard(CharacterSheet characterSheet) {
        name = "Wizard";
        characterSheet.setHitDice(6);

        primaryAbilities.add(AbilityIdentifier.INTELLIGENCE);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.DAGGER, WeaponType.DARTS, WeaponType.SLING, WeaponType.QS, WeaponType.LC));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(AbilityIdentifier.INTELLIGENCE, AbilityIdentifier.WISDOM));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.ARCANA, Skills.HISTORY, Skills.INSIGHT, Skills.INVESTIGATION, Skills.RELIGION), 2);
    }
}
