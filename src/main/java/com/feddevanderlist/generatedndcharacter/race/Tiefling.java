package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Alignment;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.CharacterSheet.abilityScore;


public class Tiefling extends Race {

    public Tiefling() {

        age = ThreadLocalRandom.current().nextInt(100);
        alignment = Alignment.getRandomAlingment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(4, 5);
        weight = ThreadLocalRandom.current().nextInt(100, 200);
        speed = 30;
        languages = Arrays.asList("Common", "Infernal");
        traits = Arrays.asList("Darkvision", "Hellish Resistance", "Infernal Legacy");
        CharacterSheet.proficiencies.add(Skills.intimidation);
        subrace = null;
        abilityScore.addCharisma(2);
        abilityScore.addInteligence(1);
    }
}
