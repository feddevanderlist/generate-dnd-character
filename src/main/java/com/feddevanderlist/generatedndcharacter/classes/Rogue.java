package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.ArmorType;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Rogue extends GlobalClass {
    public Rogue(CharacterSheet characterSheet) {
        name = "Rogue";
        characterSheet.setHitDice(8);
        primaryAbility.add(Ability.DEXTERITY);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.HC, WeaponType.LS, WeaponType.RAPIER, WeaponType.SH));
        armorProficiencies.add(ArmorType.LIGHT);
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.DEXTERITY, Ability.INTELLIGENCE));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.acrobatics, Skills.athletics, Skills.deception, Skills.insight, Skills.investigation, Skills.intimidation, Skills.perception, Skills.performance, Skills.persuasion, Skills.sleightOfHand, Skills.stealth), 4);
    }
}
