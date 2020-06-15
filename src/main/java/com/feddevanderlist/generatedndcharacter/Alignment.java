package com.feddevanderlist.generatedndcharacter;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Alignment {
    private Alignment(){}
    private static List<String> alingment = Arrays.asList("Lawful good", "Neutral good", "Chaotic good", "Lawful neutral", "Neutral", "Chaotic neutral", "Lawful evil", "Neutral evil", "Chaotic evil");

    public static String getRandomAlingment() {

        return alingment.get(ThreadLocalRandom.current().nextInt(alingment.size()));
    }
}
