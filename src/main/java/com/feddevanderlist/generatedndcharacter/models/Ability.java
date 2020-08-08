package com.feddevanderlist.generatedndcharacter.models;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

@SuppressWarnings("SameParameterValue")
public enum Ability {
    STRENGTH(0, "strength"),
    DEXTERITY(0, "dexterity"),
    CONSTITUTION(0, "constitution"),
    INTELLIGENCE(0, "intelligence"),
    WISDOM(0, "wisdom"),
    CHARISMA(0, "charisma");

    private static final Map<String, Ability> BY_NAME = new HashMap<>();

    static {
        for (Ability a : values()) {
            BY_NAME.put(a.fullName, a);
        }
    }

    public int value;
    public String fullName;

    Ability(int value, String abilityName) {
        this.fullName = abilityName;
        this.value = value;
    }

    public static void resetValues() {
        for (Ability e : values()) {
            e.value = 0;
        }
    }

    public static void init() {
        while (calcTotal() < 70) {
            STRENGTH.value = rolAbilityScore();
            DEXTERITY.value = rolAbilityScore();
            CONSTITUTION.value = rolAbilityScore();
            INTELLIGENCE.value = rolAbilityScore();
            WISDOM.value = rolAbilityScore();
            CHARISMA.value = rolAbilityScore();
        }
    }

    public static void addOneToAll() {
        for (Ability e : values()) {
            e.value += 1;
        }
    }

    public static int rolAbilityScore() {
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add(ThreadLocalRandom.current().nextInt(1, 7));
        }
        rolls.remove(Collections.min(rolls));

        return rolls.stream().mapToInt(Integer::intValue).sum();
    }

    private static int calcTotal() {
        int sum = 0;
        for (Ability ability : values()) {
            sum += ability.value;
        }
        return sum;
    }

    public static Ability findByName(String name) {
        return BY_NAME.get(name.toLowerCase());
    }

    public static int getPrimaryModifier(List<Ability> primaryAbility) {
        if (primaryAbility.size() == 1) {
            return getModifier(primaryAbility.get(0));
        } else {
            for (Ability ability : primaryAbility) {
                switch (ability) {
                    case CHARISMA -> {
                        return getChrModifier();
                    }
                    case INTELLIGENCE -> {
                        return getIntModifier();
                    }
                    case WISDOM -> {
                        return getWisModifier();
                    }
                }
            }
            return 0;
        }
    }

    public static int getIntModifier() {
        return (int) Math.floor((INTELLIGENCE.value - 10F) / 2);
    }

    public static int getDexModifier() {
        return (int) Math.floor((DEXTERITY.value - 10F) / 2);
    }

    public static int getConModifier() {
        return (int) Math.floor((CONSTITUTION.value - 10F) / 2);
    }

    public static int getStrModifier() {
        return (int) Math.floor((STRENGTH.value - 10F) / 2);
    }

    public static int getWisModifier() {
        return (int) Math.floor((WISDOM.value - 10F) / 2);
    }

    public static int getChrModifier() {
        return (int) Math.floor((CHARISMA.value - 10F) / 2);
    }

    public static int getModifier(Ability ability) {
        return (int) Math.floor((ability.value - 10F) / 2);
    }

    public static void add(Ability ability, int value) {
        ability.value += value;
    }
}