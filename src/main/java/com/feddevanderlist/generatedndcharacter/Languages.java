package com.feddevanderlist.generatedndcharacter;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Languages {
    private static List<String> languages = Arrays.asList("Abyssal",
            "Aquan",
            "Auran",
            "Celestial",
            "Common",
            "Deep Speech",
            "Draconic",
            "Druidic",
            "Dwarvish",
            "Elvish",
            "Giant",
            "Gnomish",
            "Goblin",
            "Gnoll",
            "Halfling",
            "Ignan",
            "Infernal",
            "Orc",
            "Primordial",
            "Sylvan",
            "Terran",
            "Undercommon");

    public static List<String> getRandomLanguage(List<String> learned) {
        String extraLanguage;
        do {
            extraLanguage = languages.get(ThreadLocalRandom.current().nextInt(languages.size()));
        }
        while (learned.contains(extraLanguage));
        learned.add(extraLanguage);
        return learned;
    }

    public static List<String> getRandomLanguage(String learned) {
        String extraLanguage;
        do {
            extraLanguage = languages.get(ThreadLocalRandom.current().nextInt(languages.size()));
        }
        while (learned.equals(extraLanguage));

        return Arrays.asList(learned, extraLanguage);
    }
}
