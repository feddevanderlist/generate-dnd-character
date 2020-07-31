package com.feddevanderlist.generatedndcharacter.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public enum Languages {
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

    public String languageName;

    Languages(String languageName) {
        this.languageName = languageName;
    }

    public static Languages getRandomLanguage(List<Languages> learned) {
        List<Languages> allLanguages = new ArrayList<>(Arrays.asList(values()));
        if (!learned.isEmpty()) {
            allLanguages.removeAll(learned);
        }
        return allLanguages.get(ThreadLocalRandom.current().nextInt(allLanguages.size()));
    }

    public static List<Languages> getRandomLanguage(Languages learned) {
        Languages extraLanguage;
        List<Languages> languagesList = new ArrayList<>(Arrays.asList(values()));
        do {
            extraLanguage = languagesList.get(ThreadLocalRandom.current().nextInt(languagesList.size()));
        }
        while (learned.equals(extraLanguage));

        return Arrays.asList(learned, extraLanguage);
    }
}
