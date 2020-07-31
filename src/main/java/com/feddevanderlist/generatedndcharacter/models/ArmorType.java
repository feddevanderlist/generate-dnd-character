package com.feddevanderlist.generatedndcharacter.models;

public enum ArmorType {
    LIGHT("Light"),
    MEDIUM("Medium"),
    HEAVY("Heavy"),
    SHIELD("Shield"),
    NMLIGHT("Light (non-metal)"),
    NMMEDIUM("Medium (non-metal)"),
    NMSHIELD("Shield (non-metal)");

    public final String typeName;

    ArmorType(String typeName) {
        this.typeName = typeName;
    }
}
