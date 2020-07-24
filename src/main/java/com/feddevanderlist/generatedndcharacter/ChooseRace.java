package com.feddevanderlist.generatedndcharacter;


import com.feddevanderlist.generatedndcharacter.race.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChooseRace {

    private final List<String> races = Arrays.asList("Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half_Elf", "Half_Orc", "Tiefling");

    public ChooseRace() {
    }

    public Race randomRace(CharacterSheet characterSheet) {

        return switch (races.get(ThreadLocalRandom.current().nextInt(races.size()))) {
            case "Dwarf" -> new Dwarf(characterSheet);
            case "Elf" -> new Elf(characterSheet);
            case "Halfling" -> new Halfling(characterSheet);
            case "Human" -> new Human(characterSheet);
            case "Dragonborn" -> new Dragonborn(characterSheet);
            case "Gnome" -> new Gnome(characterSheet);
            case "Half_Elf" -> new Half_Elf(characterSheet);
            case "Half_Orc" -> new Half_Orc(characterSheet);
            case "Tiefling" -> new Tiefling(characterSheet);
            default -> null;
        };
    }
}
