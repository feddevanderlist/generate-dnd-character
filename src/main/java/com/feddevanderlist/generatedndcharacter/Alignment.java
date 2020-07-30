package com.feddevanderlist.generatedndcharacter;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Alignment {
    private Alignment(){}
    private final static List<String> alignment = Arrays.asList("Lawful good", "Neutral good", "Chaotic good", "Lawful neutral", "Neutral", "Chaotic neutral", "Lawful evil", "Neutral evil", "Chaotic evil");

    public static String getRandomAlignment() {

        return alignment.get(ThreadLocalRandom.current().nextInt(alignment.size()));
    }
}
