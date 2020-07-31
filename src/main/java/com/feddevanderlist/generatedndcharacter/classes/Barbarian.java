package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.ArmorType;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Barbarian extends GlobalClass {
    public Barbarian(CharacterSheet characterSheet) {
        name = "Barbarian";
        characterSheet.setHitDice(12);
        primaryAbility.add(Ability.STRENGTH);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.SIMPLE, WeaponType.MARTIAL));
        armorProficiencies.addAll(Arrays.asList(ArmorType.LIGHT,ArmorType.MEDIUM, ArmorType.SHIELD));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.STRENGTH, Ability.CONSTITUTION));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.animalHandling, Skills.athletics, Skills.intimidation, Skills.nature, Skills.perception, Skills.survival), 2);
    }
}
