package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.Language;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.models.Ability.add;


public class Dragonborn extends Race {

    public Dragonborn() {
        name = "Dragonborn";
        age = ThreadLocalRandom.current().nextInt(80);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextDouble(6, 8);
        weight = ThreadLocalRandom.current().nextInt(200, 300);
        speed = 30;
        languages = Arrays.asList(Language.CO, Language.DR);
        traits = Arrays.asList("Breath Weapon", "Damage Resistance");
        draconicAncestry();
        add(Ability.STRENGTH,2);
    }

    private void draconicAncestry() {
        List<String> possibleDA = Arrays.asList("Black", "Blue ", "Brass ", "Bronze ", "Copper ", "Gold", "Green ", "Red", "Silver", "White");

        subrace = possibleDA.get(ThreadLocalRandom.current().nextInt(possibleDA.size()));
    }
}
