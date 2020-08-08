package com.feddevanderlist.generatedndcharacter.models;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
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

    public static List<ArmorType> getAllArmor() {
        return Arrays.asList(LIGHT, MEDIUM, HEAVY, SHIELD);
    }

    public static List<ArmorType> getNonMetalArmor() {
        return Arrays.asList(NMLIGHT, NMMEDIUM, NMSHIELD);
    }
    public static List<ArmorType> getNotHeavyArmor() {
        return Arrays.asList(LIGHT, MEDIUM, SHIELD);
    }
}
