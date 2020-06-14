package com.feddevanderlist.generatedndcharacter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class AbilityScore {
    private int strength = 0;
    private int dexterity = 0;
    private int constitution = 0;
    private int intelligence = 0;
    private int wisdom = 0;
    private int charisma = 0;

    public AbilityScore() {

    }

    public void init() {
        strength = rolAbilityScore();
        dexterity = rolAbilityScore();
        constitution = rolAbilityScore();
        intelligence = rolAbilityScore();
        wisdom = rolAbilityScore();
        charisma = rolAbilityScore();
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void addDexterity(int dexterity) {
        this.dexterity += dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void addConstitution(int constitution) {
        this.constitution += constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void addInteligence(int inteligence) {
        this.intelligence += inteligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void addWisdom(int wisdom) {
        this.wisdom += wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void addCharisma(int charisma) {
        this.charisma += charisma;
    }

    public int getStrength() {
        return strength;
    }

    public void addStrength(int strength) {
        this.strength += strength;
    }

    public void addOneToAll() {
        this.strength = 1;
        this.dexterity = 1;
        this.constitution = 1;
        this.intelligence = 1;
        this.wisdom = 1;
        this.charisma = 1;
    }

    int rolAbilityScore() {
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add(ThreadLocalRandom.current().nextInt(1, 7));
        }
        rolls.remove(Collections.min(rolls));

        return rolls.stream().mapToInt(Integer::intValue).sum();
    }

    public int getIntModifier() {
        return (int) Math.floor((intelligence - 10F) / 2);
    }

    public int getDexModifier() {
        return (int) Math.floor((dexterity - 10F) / 2);
    }

    public int getConModifier() {
        return (int) Math.floor((constitution - 10F) / 2);
    }

    public int getStrModifier() {
        return (int) Math.floor((strength - 10F) / 2);
    }

    public int getWisModifier() {
        return (int) Math.floor((wisdom - 10F) / 2);
    }

    public int getChrModifier() {
        return (int) Math.floor((charisma - 10F) / 2);
    }
}
