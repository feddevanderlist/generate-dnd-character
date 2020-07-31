package com.feddevanderlist.generatedndcharacter.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public enum Language {
    AB("Abyssal"),
    AQ("Aquan"),
    AU("Auran"),
    CE("Celestial"),
    CO("Common"),
    DS("Deep Speech"),
    DR("Draconic"),
    DD("Druidic"),
    DW("Dwarvish"),
    EL("Elvish"),
    GI("Giant"),
    GN("Gnomish"),
    GO("Goblin"),
    GL("Gnoll"),
    HA("Halfling"),
    IG("Ignan"),
    IN("Infernal"),
    OR("Orc"),
    PR("Primordial"),
    SY("Sylvan"),
    TE("Terran"),
    UN("Undercommon");

    public final String languageName;

    Language(String languageName) {
        this.languageName = languageName;
    }

    public static Language getRandomLanguage(List<Language> learned) {
        List<Language> allLanguages = new ArrayList<>(Arrays.asList(values()));
        if (!learned.isEmpty()) {
            allLanguages.removeAll(learned);
        }
        return allLanguages.get(ThreadLocalRandom.current().nextInt(allLanguages.size()));
    }

    public static List<Language> getRandomLanguage(Language learned) {
        Language extraLanguage;
        List<Language> languageList = new ArrayList<>(Arrays.asList(values()));
        do {
            extraLanguage = languageList.get(ThreadLocalRandom.current().nextInt(languageList.size()));
        }
        while (learned.equals(extraLanguage));

        return Arrays.asList(learned, extraLanguage);
    }
}
