package com.feddevanderlist.generatedndcharacter.models;

public enum WeaponType {
    SIMPLE("Simple"),
    MARTIAL("Martial"),
    HC("Hand Crossbows"),
    LS("Longsword"),
    RAPIER("Rapiers"),
    SH("Shortswords"),
    CLUBS("Clubs"),
    SHIELDS("Shields"),
    DARTS("Darts"),
    JAVELINS("Javelins"),
    MACES("Maces"),
    QS("Quarterstaff's"),
    ST("Scimitars"),
    SICKLES("Sickles"),
    SLINGS("Slings"),
    SPEARS("Spears"),
    DAGGERS("Daggers"),
    LC("Light Crossbows");


    public final String typeName;

    WeaponType(String typeName) {
        this.typeName = typeName;
    }
}
