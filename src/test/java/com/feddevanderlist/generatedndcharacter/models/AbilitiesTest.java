package com.feddevanderlist.generatedndcharacter.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

class AbilitiesTest {


    @Test
    void init() {
        Abilities abilities = new Abilities();
        abilities.init();
        assertThat(abilities.getStrength(), is(not(0)));
    }

    @Test
    void addOneToAll() {
        Abilities abilities = new Abilities();
        abilities.addOneToAll();

        assertThat(abilities.getStrength(), is(1));
        assertThat(abilities.getDexterity(), is(1));
        assertThat(abilities.getWisdom(), is(1));
        assertThat(abilities.getConstitution(), is(1));
        assertThat(abilities.getIntelligence(), is(1));
        assertThat(abilities.getCharisma(), is(1));
    }

    @Test
    void getPrimaryModifier() {
        Abilities abilities = new Abilities();
        List<AbilityIdentifier> abilityIdentifierList = new ArrayList<>();
        abilityIdentifierList.add(AbilityIdentifier.STRENGTH);
        assertThat(abilities.getPrimaryModifier(abilityIdentifierList), is(abilities.getStrModifier()));
        abilityIdentifierList.add(AbilityIdentifier.CHARISMA);

        assertThat(abilities.getPrimaryModifier(abilityIdentifierList), is(abilities.getChrModifier()));

        abilityIdentifierList.clear();
        abilityIdentifierList.addAll(Arrays.asList(AbilityIdentifier.INTELLIGENCE, AbilityIdentifier.CONSTITUTION));
        assertThat(abilities.getPrimaryModifier(abilityIdentifierList), is(abilities.getIntModifier()));

        abilityIdentifierList.clear();
        abilityIdentifierList.addAll(Arrays.asList(AbilityIdentifier.WISDOM, AbilityIdentifier.CONSTITUTION));
        assertThat(abilities.getPrimaryModifier(abilityIdentifierList), is(abilities.getWisModifier()));

        abilityIdentifierList.clear();
        abilityIdentifierList.addAll(Arrays.asList(AbilityIdentifier.STRENGTH, AbilityIdentifier.CONSTITUTION));
        assertThat(abilities.getPrimaryModifier(abilityIdentifierList), is(0));

    }

    @Test
    void getModifier() {
        Abilities abilities = new Abilities();
        double dexMod = abilities.getDexModifier();
        assertThat(dexMod, is(Math.floor((abilities.getDexterity() - 10F) / 2)));
        abilities.add(AbilityIdentifier.DEXTERITY, 2);
        assertThat(abilities.getModifier(AbilityIdentifier.DEXTERITY), is((int) dexMod + 1));
    }
}