package com.feddevanderlist.generatedndcharacter.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class AbilityTest {


    @Test
    void init() {
        Ability.init();
        assertThat(Ability.STRENGTH.value, is(not(0)));
    }

    @Test
    void addOneToAll() {
        HashMap<Ability, Integer> values = new HashMap<>();
        for (Ability ab : Ability.values()) {
            values.put(ab, ab.value);
        }
        Ability.addOneToAll();
        assertThat(Ability.STRENGTH.value, is(values.get(Ability.STRENGTH) + 1));
        assertThat(Ability.DEXTERITY.value, is(values.get(Ability.DEXTERITY) + 1));
        assertThat(Ability.WISDOM.value, is(values.get(Ability.WISDOM) + 1));
        assertThat(Ability.CONSTITUTION.value, is(values.get(Ability.CONSTITUTION) + 1));
        assertThat(Ability.INTELLIGENCE.value, is(values.get(Ability.INTELLIGENCE) + 1));
        assertThat(Ability.CHARISMA.value, is(values.get(Ability.CHARISMA) + 1));


    }

    @Test
    void findByName() {
        assertThat(Ability.findByName("Strength"), is(Ability.STRENGTH));
    }

    @Test
    void getPrimaryModifier() {
        List<Ability> abilities = new ArrayList<>();
        abilities.add(Ability.STRENGTH);
        assertThat(Ability.getPrimaryModifier(abilities), is(Ability.getStrModifier()));
        abilities.add(Ability.CHARISMA);

        assertThat(Ability.getPrimaryModifier(abilities), is(Ability.getChrModifier()));

        abilities.clear();
        abilities.addAll(Arrays.asList(Ability.INTELLIGENCE,Ability.CONSTITUTION));
        assertThat(Ability.getPrimaryModifier(abilities), is(Ability.getIntModifier()));

        abilities.clear();
        abilities.addAll(Arrays.asList(Ability.WISDOM,Ability.CONSTITUTION));
        assertThat(Ability.getPrimaryModifier(abilities), is(Ability.getWisModifier()));

        abilities.clear();
        abilities.addAll(Arrays.asList(Ability.STRENGTH,Ability.CONSTITUTION));
        assertThat(Ability.getPrimaryModifier(abilities), is(0));

    }

    @Test
    void getModifier() {
        double dexMod = Ability.getDexModifier();
        assertThat(dexMod, is(Math.floor((Ability.DEXTERITY.value - 10F) / 2)));
        Ability.add(Ability.DEXTERITY, 2);
        assertThat(Ability.getModifier(Ability.DEXTERITY), is((int) dexMod + 1));
    }

    @Test
    void resetValues() {
        Ability.resetValues();
        for (Ability ability : Ability.values()) {
            assertThat(ability.value, is(0));
        }
    }
}