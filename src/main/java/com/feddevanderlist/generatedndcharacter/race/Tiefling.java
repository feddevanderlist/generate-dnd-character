package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.Language;
import com.feddevanderlist.generatedndcharacter.models.Skills;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.models.Ability.*;


public class Tiefling extends Race {

    public Tiefling(CharacterSheet characterSheet) {
        name = "Tiefling";
        age = ThreadLocalRandom.current().nextInt(100);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(4, 5);
        weight = ThreadLocalRandom.current().nextInt(100, 200);
        speed = 30;
        languages = Arrays.asList(Language.CO, Language.IN);
        traits = Arrays.asList("Darkvision", "Hellish Resistance", "Infernal Legacy");
        characterSheet.getProficiencies().add(Skills.intimidation);
        subrace = null;
        add(CHARISMA, 2);
        add(INTELLIGENCE, 1);
    }
}
