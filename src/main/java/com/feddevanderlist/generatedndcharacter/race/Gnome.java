package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Alignment;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.CharacterSheet.abilityScore;


public class Gnome extends Race {

    public Gnome() {

        age = ThreadLocalRandom.current().nextInt(500);
        alignment = Alignment.getRandomAlingment();
        size = "small";
        height = ThreadLocalRandom.current().nextInt(3, 4);
        weight = ThreadLocalRandom.current().nextInt(30, 50);
        speed = 25;
        languages = Arrays.asList("Common", "Gnomish");
        traits = Arrays.asList("Darkvision", "Gnome Cunning");
        chooseSubrace();
        abilityScore.addInteligence(2);
    }

    private void chooseSubrace() {
        List<String> possibleSubrace = Arrays.asList("Rock Gnome", "Forest Gnomes");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("Rock Gnome")) {
            abilityScore.addConstitution(1);
            traits.add("Artificer’s Lore");
            traits.add("Tinker");
        } else if (subrace.equals("Forest Gnomes")) {
            abilityScore.addDexterity(1);
            traits.add("Natural Illusionist");
            traits.add("Speak with Small Beasts.");
        }
    }
}
