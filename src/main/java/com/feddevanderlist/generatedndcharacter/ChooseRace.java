package com.feddevanderlist.generatedndcharacter;


import com.feddevanderlist.generatedndcharacter.race.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChooseRace {

    List<String> races = Arrays.asList("Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half_Elf", "Half_Orc", "Tiefling");

    public ChooseRace() {
    }

    public Race randomRace() {

        switch (races.get(ThreadLocalRandom.current().nextInt(races.size()))) {
            case "Dwarf":
                return new Dwarf();
            case "Elf":
                return new Elf();
            case "Halfling":
                return new Halfling();
            case "Human":
                return new Human();
            case "Dragonborn":
                return new Dragonborn();
            case "Gnome":
                return new Gnome();
            case "Half_Elf":
                return new Half_Elf();
            case "Half_Orc":
                return new Half_Orc();
            case "Tiefling":
                return new Tiefling();
            default:
                return null;
        }
    }
}
