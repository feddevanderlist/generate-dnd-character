package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Alignment;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.CharacterSheet.abilityScore;


public class Half_Orc extends Race {

    public Half_Orc() {

        age = ThreadLocalRandom.current().nextInt(75);
        alignment = Alignment.getRandomAlingment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(5, 7);
        weight = ThreadLocalRandom.current().nextInt(130, 220);
        speed = 30;
        languages = Arrays.asList("Common", "Orc");
        traits = Arrays.asList("Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks");
        subrace = null;
        abilityScore.addStrength(2);
        abilityScore.addCharisma(1);
    }
}
