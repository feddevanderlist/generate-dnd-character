package com.feddevanderlist.generatedndcharacter.classes;



import com.feddevanderlist.generatedndcharacter.CharacterSheet;

import java.util.Arrays;

public class Bard extends GlobalClass {
    public Bard() {
        hitDie = 8;
        primaryAbility.add("Charisma");
        weaponProficiencies.add("Light");
        armorProfieciencies.addAll(Arrays.asList("Simple", "Hand Crossbows", "Longsword", "Rapiers", "Shortswords"));
        CharacterSheet.getSavingThrowProficiencies().addAll(Arrays.asList("Dexterity ", "Charisma"));
        CharacterSheet.addProficiencyBonus(2);
        CharacterSheet.addRandomSkills(3);
    }
}
