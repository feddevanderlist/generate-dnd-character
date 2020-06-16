package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Alignment;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Dragonborn extends Race {

    public Dragonborn(CharacterSheet characterSheet) {
        name = "Dragonborn";
        age = ThreadLocalRandom.current().nextInt(80);
        alignment = Alignment.getRandomAlingment();
        size = "medium";
        height = ThreadLocalRandom.current().nextDouble(6, 8);
        weight = ThreadLocalRandom.current().nextInt(200, 300);
        speed = 30;
        languages = Arrays.asList("Common", "Draconic");
        traits = Arrays.asList("Breath Weapon", "Damage Resistance");
        draconicAncestry();
        characterSheet.getAbilityScore().addStrength(2);
    }

    private void draconicAncestry() {
        List<String> possbleDA = Arrays.asList("Black", "Blue ", "Brass ", "Bronze ", "Copper ", "Gold", "Green ", "Red", "Silver", "White");

        subrace = possbleDA.get(ThreadLocalRandom.current().nextInt(possbleDA.size()));
    }
}
