package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.Language;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.models.Ability.add;


public class HalfOrc extends Race {

    public HalfOrc() {
        name = "Half-Orc";
        age = ThreadLocalRandom.current().nextInt(75);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(5, 7);
        weight = ThreadLocalRandom.current().nextInt(130, 220);
        speed = 30;
        languages = Arrays.asList(Language.CO, Language.OR);
        traits = Arrays.asList("Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks");
        subrace = null;
        add(Ability.STRENGTH,2);
        add(Ability.CHARISMA ,1);
    }
}
