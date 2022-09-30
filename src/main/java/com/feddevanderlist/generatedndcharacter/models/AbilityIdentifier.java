package com.feddevanderlist.generatedndcharacter.models;

public enum AbilityIdentifier {
    STRENGTH("strength"),
    DEXTERITY("dexterity"),
    CONSTITUTION("constitution"),
    INTELLIGENCE("intelligence"),
    WISDOM("wisdom"),
    CHARISMA("charisma");

    private final String name;

    AbilityIdentifier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
