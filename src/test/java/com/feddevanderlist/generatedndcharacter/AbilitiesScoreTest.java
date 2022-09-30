package com.feddevanderlist.generatedndcharacter;

import com.feddevanderlist.generatedndcharacter.models.Abilities;
import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class AbilitiesScoreTest {


    @Test
    void addOneToAll() {
        Abilities abilities = new Abilities();
        abilities.addOneToAll();
        assertThat(abilities.getIntelligence(), is(1));
        assertThat(abilities.getCharisma(), is(1));
        assertThat(abilities.getDexterity(), is(1));
        assertThat(abilities.getConstitution(), is(1));
        assertThat(abilities.getStrength(), is(1));
        assertThat(abilities.getWisdom(), is(1));
    }

    @Test
    void getIntModifier() {
        Abilities abilities = new Abilities();
        assertThat(abilities.getIntelligence(), is(0));
    }

    @Test
    void getDexModifier() {
        Abilities abilities = new Abilities();
        assertThat(abilities.getDexterity(), is(0));
    }

    @Test
    void getConModifier() {
        Abilities abilities = new Abilities();
        assertThat(abilities.getConstitution(), is(0));
    }

    @Test
    void getStrModifier() {
        Abilities abilities = new Abilities();
        assertThat(abilities.getStrength(), is(0));
    }

    @Test
    void getWisModifier() {
        Abilities abilities = new Abilities();
        assertThat(abilities.getWisdom(), is(0));
    }

    @Test
    void getChrModifier() {
        Abilities abilities = new Abilities();
        assertThat(abilities.getCharisma(), is(0));
    }

    @Test
    void rolAbilityScore() {
        for (int i = 0; i < 5000; i++) {
            int result = Abilities.rolAbilityScore();
            assertThat(result, allOf(greaterThan(2), lessThan(19)));
        }
    }

    @Test
    void rounding() {
        int i;
        for (i = 1; i <= 30; i++) {
            switch (i) {
                case 1 -> assertThat(Math.floor((i - 10F) / 2), is(-5.0));
                case 2, 3 -> assertThat(Math.floor((i - 10F) / 2), is(-4.0));
                case 4, 5 -> assertThat(Math.floor((i - 10F) / 2), is(-3.0));
                case 6, 7 -> assertThat(Math.floor((i - 10F) / 2), is(-2.0));
                case 8, 9 -> assertThat(Math.floor((i - 10F) / 2), is(-1.0));
                case 10, 11 -> assertThat(Math.floor((i - 10F) / 2), is(0.0));
                case 12, 13 -> assertThat(Math.floor((i - 10F) / 2), is(1.0));
                case 14, 15 -> assertThat(Math.floor((i - 10F) / 2), is(2.0));
                case 16, 17 -> assertThat(Math.floor((i - 10F) / 2), is(3.0));
                case 18, 19 -> assertThat(Math.floor((i - 10F) / 2), is(4.0));
                case 20, 21 -> assertThat(Math.floor((i - 10F) / 2), is(5.0));
                case 22, 23 -> assertThat(Math.floor((i - 10F) / 2), is(6.0));
                case 24, 25 -> assertThat(Math.floor((i - 10F) / 2), is(7.0));
                case 26, 27 -> assertThat(Math.floor((i - 10F) / 2), is(8.0));
                case 28, 29 -> assertThat(Math.floor((i - 10F) / 2), is(9.0));
                case 30 -> assertThat(Math.floor((i - 10F) / 2), is(10.0));
                default -> throw new ArithmeticException("the calculation went wrong");
            }
        }
        assertThat(i, is(31));
    }

    @Test
    void init() {
        Abilities abilities = new Abilities();
        assertThat(abilities.getIntelligence(), is(0));
        assertThat(abilities.getCharisma(), is(0));
        assertThat(abilities.getDexterity(), is(0));
        assertThat(abilities.getConstitution(), is(0));
        assertThat(abilities.getStrength(), is(0));
        assertThat(abilities.getWisdom(), is(0));
        abilities.init();
        assertThat(abilities.getIntelligence(), allOf(greaterThan(2), lessThan(19)));
        assertThat(abilities.getCharisma(), allOf(greaterThan(2), lessThan(19)));
        assertThat(abilities.getDexterity(), allOf(greaterThan(2), lessThan(19)));
        assertThat(abilities.getConstitution(), allOf(greaterThan(2), lessThan(19)));
        assertThat(abilities.getStrength(), allOf(greaterThan(2), lessThan(19)));
        assertThat(abilities.getWisdom(), allOf(greaterThan(2), lessThan(19)));
    }

    @Test
    void addFunctions() {
        Abilities abilities = new Abilities();

        assertThat(abilities.getIntelligence(), is(0));
        assertThat(abilities.getCharisma(), is(0));
        assertThat(abilities.getDexterity(), is(0));
        assertThat(abilities.getConstitution(), is(0));
        assertThat(abilities.getStrength(), is(0));
        assertThat(abilities.getWisdom(), is(0));
        abilities.add(AbilityIdentifier.INTELLIGENCE,5);
        abilities.add(AbilityIdentifier.CHARISMA,5);
        abilities.add(AbilityIdentifier.CONSTITUTION,5);
        abilities.add(AbilityIdentifier.STRENGTH,5);
        abilities.add(AbilityIdentifier.DEXTERITY,5);
        abilities.add(AbilityIdentifier.WISDOM,5);

        assertThat(abilities.getIntelligence(), is(5));
        assertThat(abilities.getCharisma(), is(5));
        assertThat(abilities.getDexterity(), is(5));
        assertThat(abilities.getConstitution(), is(5));
        assertThat(abilities.getStrength(), is(5));
        assertThat(abilities.getWisdom(), is(5));
    }
}