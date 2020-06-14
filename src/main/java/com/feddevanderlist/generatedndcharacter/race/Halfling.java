package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Alignment;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.CharacterSheet.abilityScore;


public class Halfling extends Race {

    public Halfling() {

        age = ThreadLocalRandom.current().nextInt(5, 40);
        alignment = Alignment.getRandomAlingment();
        size = "small";
        height = ThreadLocalRandom.current().nextDouble(3, 4.5);
        weight = ThreadLocalRandom.current().nextInt(30, 50);
        speed = 25;
        languages = Arrays.asList("Common", "Halfling");
        traits = Arrays.asList("Lucky", "Brave", "Halfling Nimbleness");
        chooseSubrace();
        abilityScore.addDexterity(2);
    }

    private void chooseSubrace() {
        List<String> possibleSubrace = Arrays.asList("Lightfoot", "Stout");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("Lightfoot")) {
            abilityScore.addCharisma(1);
            CharacterSheet.hitPoints += 1;
            traits.add("Naturally Stealthy");
        } else if (subrace.equals("Stout")) {
            abilityScore.addConstitution(2);
            traits.add("Stout Resilience");
        }
    }
}
