package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.ArmorType;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Druid extends GlobalClass {
    public Druid(CharacterSheet characterSheet) {
        name = "Druid";
        characterSheet.setHitDice(8);
        primaryAbility.add(Ability.WISDOM);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.CLUB, WeaponType.SHIELD, WeaponType.DARTS, WeaponType.JAVELIN, WeaponType.MACE, WeaponType.QS, WeaponType.ST, WeaponType.SICKLE, WeaponType.SLING, WeaponType.SPEAR));
        armorProficiencies.addAll(Arrays.asList(ArmorType.NMLIGHT, ArmorType.NMMEDIUM, ArmorType.NMSHIELD));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.WISDOM, Ability.INTELLIGENCE));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.animalHandling, Skills.insight, Skills.medicine, Skills.nature, Skills.perception, Skills.religion, Skills.survival), 2);
    }
}
