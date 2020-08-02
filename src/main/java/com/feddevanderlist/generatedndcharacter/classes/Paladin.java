package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.ArmorType;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Paladin extends GlobalClass {
    public Paladin(CharacterSheet characterSheet) {
        name = "Paladin";
        characterSheet.setHitDice(10);
        primaryAbility.addAll(Arrays.asList(Ability.STRENGTH, Ability.CHARISMA));
        weaponProficiencies.addAll(Arrays.asList(WeaponType.SIMPLE, WeaponType.MARTIAL));
        armorProficiencies.addAll(ArmorType.getAllArmor());
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.WISDOM, Ability.CHARISMA));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.athletics, Skills.insight, Skills.intimidation, Skills.medicine, Skills.persuasion, Skills.religion), 2);
    }
}
