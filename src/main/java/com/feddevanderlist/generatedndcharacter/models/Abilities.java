package com.feddevanderlist.generatedndcharacter.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@SuppressWarnings("SameParameterValue")
public class Abilities {
    private final Ability strength = new Ability(AbilityIdentifier.STRENGTH);
    private final Ability dexterity = new Ability(AbilityIdentifier.DEXTERITY);
    private final Ability constitution = new Ability(AbilityIdentifier.CONSTITUTION);
    private final Ability intelligence = new Ability(AbilityIdentifier.INTELLIGENCE);
    private final Ability wisdom = new Ability(AbilityIdentifier.WISDOM);
    private final Ability charisma = new Ability(AbilityIdentifier.CHARISMA);

    private final List<Ability> abilitiesList = new ArrayList<>(6);

    public Abilities() {
        abilitiesList.addAll(Arrays.asList(strength, dexterity, constitution, intelligence, wisdom, charisma));
    }

    public String getAbilityText() {
        String message = """
                Strength: %s
                Intelligence: %s
                Constitution: %s
                Wisdom: %s
                Dexterity: %s
                Charisma: %s
                """;
        return String.format(message,
                strength.getValue(),
                intelligence.getValue(),
                constitution.getValue(),
                wisdom.getValue(),
                dexterity.getValue(),
                charisma.getValue());
    }

    public void init() {
        while (calcTotal() < 70) {
            strength.setValue(rolAbilityScore());
            dexterity.setValue(rolAbilityScore());
            constitution.setValue(rolAbilityScore());
            intelligence.setValue(rolAbilityScore());
            wisdom.setValue(rolAbilityScore());
            charisma.setValue(rolAbilityScore());
        }
    }

    public void addOneToAll() {
        strength.addOne();
        dexterity.addOne();
        constitution.addOne();
        intelligence.addOne();
        wisdom.addOne();
        charisma.addOne();
    }

    public static int rolAbilityScore() {
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add(ThreadLocalRandom.current().nextInt(1, 7));
        }
        rolls.remove(Collections.min(rolls));

        return rolls.stream().mapToInt(Integer::intValue).sum();
    }

    private int calcTotal() {
        return strength.getValue() +
                dexterity.getValue() +
                constitution.getValue() +
                intelligence.getValue() +
                wisdom.getValue() +
                charisma.getValue();
    }

    public int getPrimaryModifier(List<AbilityIdentifier> primaryAbilities) {
        if (primaryAbilities.size() == 1) {
            return this.getModifier(primaryAbilities.get(0));
        } else {
            for (AbilityIdentifier abilities : primaryAbilities) {
                switch (abilities) {
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

    public int getIntModifier() {
        return (int) Math.floor((intelligence.getValue() - 10F) / 2);
    }

    public int getDexModifier() {
        return (int) Math.floor((dexterity.getValue() - 10F) / 2);
    }

    public int getConModifier() {
        return (int) Math.floor((constitution.getValue() - 10F) / 2);
    }

    public int getStrModifier() {
        return (int) Math.floor((strength.getValue() - 10F) / 2);
    }

    public int getWisModifier() {
        return (int) Math.floor((wisdom.getValue() - 10F) / 2);
    }

    public int getChrModifier() {
        return (int) Math.floor((charisma.getValue() - 10F) / 2);
    }

    public int getModifier(AbilityIdentifier abilityId) {
        Ability baseAbility = abilitiesList.stream().filter(ability ->
                ability.getAbilityIdentifier().equals(abilityId)
        ).findFirst().orElse(null);
        if (baseAbility == null) return 0;
        return (int) Math.floor((baseAbility.getValue() - 10F) / 2);
    }

    public void add(AbilityIdentifier abilityId, int value) {
        for (Ability ability : abilitiesList) {
            if (ability.getAbilityIdentifier().equals(abilityId)) {
                ability.add(value);
            }
        }
    }

    public int getStrength() {
        return strength.getValue();
    }

    public int getDexterity() {
        return dexterity.getValue();
    }

    public int getIntelligence() {
        return intelligence.getValue();
    }

    public int getWisdom() {
        return wisdom.getValue();
    }

    public int getCharisma() {
        return charisma.getValue();
    }

    public int getConstitution() {
        return constitution.getValue();
    }
}
