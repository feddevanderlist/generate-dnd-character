package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.ArmorType;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.WeaponType;

import java.util.Arrays;

public class Bard extends GlobalClass {
    public Bard(CharacterSheet characterSheet) {
        name = "Bard";
        characterSheet.setHitDice(8);
        primaryAbilities.add(AbilityIdentifier.CHARISMA);
        armorProficiencies.add(ArmorType.LIGHT);
        weaponProficiencies.addAll(Arrays.asList(WeaponType.SIMPLE, WeaponType.HC, WeaponType.LS, WeaponType.RAPIER, WeaponType.SH));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(AbilityIdentifier.DEXTERITY, AbilityIdentifier.CHARISMA));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkills(3);
    }
}
