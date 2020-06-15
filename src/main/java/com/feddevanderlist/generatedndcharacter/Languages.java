package com.feddevanderlist.generatedndcharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Languages {
    private Languages() {
    }

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

    public static String getRandomLanguage(List<String> learned) {
        List<String> allLanguages = new ArrayList<>(languages);
        if (!learned.isEmpty()) {
            allLanguages.removeAll(learned);
        }
        return allLanguages.get(ThreadLocalRandom.current().nextInt(allLanguages.size()));
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
