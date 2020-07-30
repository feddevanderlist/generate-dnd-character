package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Alignment;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.Ability.*;


public class Tiefling extends Race {

    public Tiefling(CharacterSheet characterSheet) {
        name = "Tiefling";
        age = ThreadLocalRandom.current().nextInt(100);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(4, 5);
        weight = ThreadLocalRandom.current().nextInt(100, 200);
        speed = 30;
        languages = Arrays.asList("Common", "Infernal");
        traits = Arrays.asList("Darkvision", "Hellish Resistance", "Infernal Legacy");
        characterSheet.getProficiencies().add(Skills.intimidation);
        subrace = null;
        add(CHARISMA, 2);
        add(INTELLIGENCE, 1);
    }
}
