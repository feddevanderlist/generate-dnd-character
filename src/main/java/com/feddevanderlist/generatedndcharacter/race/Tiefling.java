package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class Tiefling extends Race {

    public Tiefling(CharacterSheet characterSheet) {
        name = "Tiefling";
        age = ThreadLocalRandom.current().nextInt(100);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(4, 5);
        weight = ThreadLocalRandom.current().nextInt(100, 200);
        speed = 30;
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.IN));
        traits = Arrays.asList("Darkvision", "Hellish Resistance", "Infernal Legacy");
        characterSheet.getProficiencies().add(Skills.intimidation);
        subrace = null;
        characterSheet.addValueToAbility(AbilityIdentifier.CHARISMA, 2);
        characterSheet.addValueToAbility(AbilityIdentifier.INTELLIGENCE, 1);
    }
}
