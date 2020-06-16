package com.feddevanderlist.generatedndcharacter.classes;



import com.feddevanderlist.generatedndcharacter.CharacterSheet;

import java.util.Arrays;

public class Bard extends GlobalClass {
    public Bard(CharacterSheet characterSheet) {
        name = "Bard";
        characterSheet.setHitDice( 8);
        primaryAbility.add("Charisma");
        weaponProficiencies.add("Light");
        armorProfieciencies.addAll(Arrays.asList("Simple", "Hand Crossbows", "Longsword", "Rapiers", "Shortswords"));
        characterSheet.getSavingThrowProficiencies().addAll(Arrays.asList("Dexterity ", "Charisma"));
        characterSheet.addProficiencyBonus(2);
        characterSheet.addRandomSkills(3);
    }
}
