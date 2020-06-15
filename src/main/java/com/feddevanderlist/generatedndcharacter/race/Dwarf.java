package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Alignment;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Dwarf extends Race {

    public Dwarf() {
        name = "Dwarf";
        age = ThreadLocalRandom.current().nextInt(5, 350);
        alignment = Alignment.getRandomAlingment();
        size = "medium";
        height = ThreadLocalRandom.current().nextDouble(4, 5);
        weight = ThreadLocalRandom.current().nextInt(100, 200);
        speed = 25;
        languages.addAll(Arrays.asList("Common", "Dwarvish"));
        traits.addAll(Arrays.asList("Darkvision", "Dwarven Resilience", "Dwarven Combat Training", "Tool Proficiency", "Stonecunning"));
        chooseSubrace();
        CharacterSheet.getAbilityScore().addConstitution(2);
    }

    private void chooseSubrace() {
        List<String> possibleSubrace = Arrays.asList("Hill Dwarves", "Mountain Dwarves");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("Hill Dwarves")) {
            CharacterSheet.getAbilityScore().addWisdom(1);
            CharacterSheet.addHitPoints(1);
            traits.add("Dwarven Toughness");
        } else if (subrace.equals("Mountain Dwarves")) {
            CharacterSheet.getAbilityScore().addStrength(2);
            traits.add("Dwarven Armor Training");
        }
    }
}
