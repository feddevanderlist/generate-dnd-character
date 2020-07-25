package com.feddevanderlist.generatedndcharacter.classes;


import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;

import java.util.Arrays;

public class Bard extends GlobalClass {
    public Bard(CharacterSheet characterSheet) {
        name = "Bard";
        characterSheet.setHitDice(8);
        primaryAbility.add( Ability.CHARISMA);
        weaponProficiencies.add("Light");
        armorProfieciencies.addAll(Arrays.asList("Simple", "Hand Crossbows", "Longsword", "Rapiers", "Shortswords"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList(Ability.DEXTERITY, Ability.CHARISMA));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkills(3);
    }
}
