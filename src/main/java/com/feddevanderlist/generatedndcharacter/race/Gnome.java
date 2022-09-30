package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Gnome extends Race {

    public Gnome(CharacterSheet characterSheet) {
        name = "Gnome";
        age = ThreadLocalRandom.current().nextInt(500);
        alignment = Alignment.getRandomAlignment();
        size = "small";
        height = ThreadLocalRandom.current().nextInt(3, 4);
        weight = ThreadLocalRandom.current().nextInt(30, 50);
        speed = 25;
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.GN));
        traits.addAll(Arrays.asList("Darkvision", "Gnome Cunning"));
        chooseSubrace(characterSheet);
        characterSheet.addValueToAbility(AbilityIdentifier.INTELLIGENCE, 2);
    }

    private void chooseSubrace(CharacterSheet characterSheet) {
        List<String> possibleSubrace = Arrays.asList("Rock Gnome", "Forest Gnomes");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("Rock Gnome")) {
            characterSheet.addValueToAbility(AbilityIdentifier.CONSTITUTION, 1);
            traits.add("Artificer’s Lore");
            traits.add("Tinker");
        } else if (subrace.equals("Forest Gnomes")) {
            characterSheet.addValueToAbility(AbilityIdentifier.DEXTERITY, 1);
            traits.add("Natural Illusionist");
            traits.add("Speak with Small Beasts.");
        }
    }
}
