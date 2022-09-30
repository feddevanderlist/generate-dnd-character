package com.feddevanderlist.generatedndcharacter.models;

public class Ability {
    private final AbilityIdentifier abilityIdentifier;
    private int value;

    public Ability(AbilityIdentifier abilityIdentifier) {
        this.abilityIdentifier = abilityIdentifier;
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addOne() {
        this.value++;
    }

    public AbilityIdentifier getAbilityIdentifier() {
        return abilityIdentifier;
    }

    public void add(int value) {
        this.value += value;
    }
}
