package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Alignment;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class Tiefling extends Race {

    public Tiefling(CharacterSheet characterSheet) {
        name = "Tiefling";
        age = ThreadLocalRandom.current().nextInt(100);
        alignment = Alignment.getRandomAlingment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(4, 5);
        weight = ThreadLocalRandom.current().nextInt(100, 200);
        speed = 30;
        languages = Arrays.asList("Common", "Infernal");
        traits = Arrays.asList("Darkvision", "Hellish Resistance", "Infernal Legacy");
        characterSheet.getProficiencies().add(Skills.intimidation);
        subrace = null;
        characterSheet.getAbilityScore().addCharisma(2);
        characterSheet.getAbilityScore().addInteligence(1);
    }
}
