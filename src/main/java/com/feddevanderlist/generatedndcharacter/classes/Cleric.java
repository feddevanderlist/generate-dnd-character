package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.ArmorType;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Cleric extends GlobalClass {
    public Cleric(CharacterSheet characterSheet) {
        name = "Cleric";
        characterSheet.setHitDice(8);
        primaryAbility.add(Ability.WISDOM);
        weaponProficiencies.add(WeaponType.SIMPLE);
        armorProficiencies.addAll(Arrays.asList(ArmorType.LIGHT,ArmorType.MEDIUM, ArmorType.SHIELD));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.WISDOM, Ability.CHARISMA));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.history, Skills.insight, Skills.medicine, Skills.persuasion, Skills.religion), 2);
    }
}
