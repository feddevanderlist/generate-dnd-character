package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.Languages;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.models.Ability.add;


public class Gnome extends Race {

    public Gnome() {
        name = "Gnome";
        age = ThreadLocalRandom.current().nextInt(500);
        alignment = Alignment.getRandomAlignment();
        size = "small";
        height = ThreadLocalRandom.current().nextInt(3, 4);
        weight = ThreadLocalRandom.current().nextInt(30, 50);
        speed = 25;
        languages.addAll(Arrays.asList(Languages.CO, Languages.GN));
        traits.addAll(Arrays.asList("Darkvision", "Gnome Cunning"));
        chooseSubrace();
        add(Ability.INTELLIGENCE, 2);
    }

    private void chooseSubrace() {
        List<String> possibleSubrace = Arrays.asList("Rock Gnome", "Forest Gnomes");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("Rock Gnome")) {
            add(Ability.CONSTITUTION, 1);
            traits.add("Artificer’s Lore");
            traits.add("Tinker");
        } else if (subrace.equals("Forest Gnomes")) {
            add(Ability.DEXTERITY, 1);
            traits.add("Natural Illusionist");
            traits.add("Speak with Small Beasts.");
        }
    }
}
