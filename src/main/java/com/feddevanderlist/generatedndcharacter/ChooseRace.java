package com.feddevanderlist.generatedndcharacter;


import com.feddevanderlist.generatedndcharacter.race.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChooseRace {

    List<Race> races = Arrays.asList(new Dwarf(), new Elf(), new Halfling(), new Human(), new Dragonborn(), new Gnome(), new Half_Elf(), new Half_Orc(), new Tiefling());

    public Race randomRace() {

        return races.get(ThreadLocalRandom.current().nextInt(races.size()));
    }
}
