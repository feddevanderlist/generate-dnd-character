package com.feddevanderlist.generatedndcharacter.race;



import com.feddevanderlist.generatedndcharacter.Alignment;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Languages;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.CharacterSheet.abilityScore;


public class Human extends Race {

    public Human() {

        age = ThreadLocalRandom.current().nextInt(95);
        alignment = Alignment.getRandomAlingment();
        size = "medium";
        height = ThreadLocalRandom.current().nextDouble(4.9, 6.8);
        weight = ThreadLocalRandom.current().nextInt(120, 200);
        speed = 30;
        languages = Languages.getRandomLanguage("Common");
        traits = Arrays.asList("Darkvision", "Dwarven Resilience", "Dwarven Combat Training", "Tool Proficiency", "Stonecunning");
        abilityScore.addOneToAll();
        CharacterSheet.addRandomSkills(1);
    }
}
