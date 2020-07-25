package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.Alignment;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.Ability.add;


public class HalfOrc extends Race {

    public HalfOrc() {
        name = "Half-Orc";
        age = ThreadLocalRandom.current().nextInt(75);
        alignment = Alignment.getRandomAlingment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(5, 7);
        weight = ThreadLocalRandom.current().nextInt(130, 220);
        speed = 30;
        languages = Arrays.asList("Common", "Orc");
        traits = Arrays.asList("Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks");
        subrace = null;
        add(Ability.STRENGTH,2);
        add(Ability.CHARISMA ,1);
    }
}
