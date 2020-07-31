package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.ArmorType;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Fighter extends GlobalClass {
    public Fighter(CharacterSheet characterSheet) {
        name = "Fighter";
        characterSheet.setHitDice(10);
        primaryAbility.addAll(Arrays.asList(Ability.DEXTERITY, Ability.STRENGTH));
        weaponProficiencies.addAll(Arrays.asList(WeaponType.SIMPLE, WeaponType.MARTIAL));
        armorProficiencies.addAll(Arrays.asList(ArmorType.values()));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.STRENGTH, Ability.CONSTITUTION));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.acrobatics, Skills.animalHandling, Skills.athletics, Skills.history, Skills.insight, Skills.intimidation, Skills.perception, Skills.survival), 2);
    }
}
