package com.feddevanderlist.generatedndcharacter.models;

public enum WeaponType {
    SIMPLE("Simple"),
    MARTIAL("Martial"),
    HC("Hand Crossbows"),
    LS("Longsword"),
    RAPIER("Rapiers"),
    SH("Shortswords"),
    CLUB("Clubs"),
    SHIELD("Shields"),
    DARTS("Darts"),
    JAVELIN("Javelins"),
    MACE("Maces"),
    QS("Quarterstaff's"),
    ST("Scimitars"),
    SICKLE("Sickles"),
    SLING("Slings"),
    SPEAR("Spears"),
    DAGGER("Daggers"),
    LC("Light Crossbows");


    public final String typeName;

    WeaponType(String typeName) {
        this.typeName = typeName;
    }
}
