package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Gnome extends Race {

    public Gnome(CharacterSheet characterSheet) {
        super("Gnome", 500, Size.SMALL, new Bound(3, 4), new Bound(30, 50), 25, Arrays.asList("Darkvision", "Gnome Cunning"));
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.GN));
        chooseSubrace(characterSheet);
        characterSheet.addValueToAbility(AbilityIdentifier.INTELLIGENCE, 2);
    }

    private void chooseSubrace(CharacterSheet characterSheet) {
        final List<String> possibleSubrace = Arrays.asList("Rock Gnome", "Forest Gnomes");
        final String subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        this.setSubrace(subrace);
        if (subrace.equals("Rock Gnome")) {
            characterSheet.addValueToAbility(AbilityIdentifier.CONSTITUTION, 1);
            this.addTrait("Artificer’s Lore");
            this.addTrait("Tinker");
        } else if (subrace.equals("Forest Gnomes")) {
            characterSheet.addValueToAbility(AbilityIdentifier.DEXTERITY, 1);
            this.addTrait("Natural Illusionist");
            this.addTrait("Speak with Small Beasts.");
        }
    }
}
