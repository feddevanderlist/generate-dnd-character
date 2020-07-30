package com.feddevanderlist.generatedndcharacter;

import org.junit.jupiter.api.Test;

import static com.feddevanderlist.generatedndcharacter.Ability.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class AbilityScoreTest {


    @Test
    void addOneToAll() {
        Ability.resetValues();
        Ability.addOneToAll();
        assertThat(Ability.INTELLIGENCE.value, is(1));
        assertThat(Ability.CHARISMA.value, is(1));
        assertThat(Ability.DEXTERITY.value, is(1));
        assertThat(Ability.CONSTITUTION.value, is(1));
        assertThat(Ability.STRENGTH.value, is(1));
        assertThat(Ability.WISDOM.value, is(1));
    }

    @Test
    void getIntModifier() {
        Ability.resetValues();
        assertThat(Ability.INTELLIGENCE.value, is(0));
        Ability.INTELLIGENCE.value = 1;
        assertThat(Ability.INTELLIGENCE.value, is(1));
        assertThat(Ability.getIntModifier(), is(-5));
    }

    @Test
    void getDexModifier() {
        Ability.resetValues();
        assertThat(Ability.DEXTERITY.value, is(0));
        Ability.DEXTERITY.value = 10;
        assertThat(Ability.DEXTERITY.value, is(10));
        assertThat(Ability.getDexModifier(), is(0));
    }

    @Test
    void getConModifier() {
        Ability.resetValues();
        assertThat(Ability.CONSTITUTION.value, is(0));
        Ability.CONSTITUTION.value = 11;
        assertThat(Ability.CONSTITUTION.value, is(11));
        assertThat(Ability.getConModifier(), is(0));
    }

    @Test
    void getStrModifier() {
        Ability.resetValues();
        assertThat(Ability.STRENGTH.value, is(0));
        Ability.STRENGTH.value = 2;
        assertThat(Ability.STRENGTH.value, is(2));
        assertThat(Ability.getStrModifier(), is(-4));
    }

    @Test
    void getWisModifier() {
        Ability.resetValues();
        assertThat(Ability.WISDOM.value, is(0));
        Ability.WISDOM.value = 3;
        assertThat(Ability.WISDOM.value, is(3));
        assertThat(Ability.getWisModifier(), is(-4));
    }

    @Test
    void getChrModifier() {
        Ability.resetValues();
        assertThat(Ability.CHARISMA.value, is(0));
        Ability.CHARISMA.value = 7;
        assertThat(Ability.CHARISMA.value, is(7));
        assertThat(Ability.getChrModifier(), is(-2));
    }

    @Test
    void rolAbilityScore() {

        for (int i = 0; i < 5000; i++) {
            int result = Ability.rolAbilityScore();
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
        Ability.resetValues();
        assertThat(Ability.INTELLIGENCE.value, is(0));
        assertThat(Ability.CHARISMA.value, is(0));
        assertThat(Ability.DEXTERITY.value, is(0));
        assertThat(Ability.CONSTITUTION.value, is(0));
        assertThat(Ability.STRENGTH.value, is(0));
        assertThat(Ability.WISDOM.value, is(0));
        Ability.init();
        assertThat(Ability.INTELLIGENCE.value, allOf(greaterThan(2), lessThan(19)));
        assertThat(Ability.CHARISMA.value, allOf(greaterThan(2), lessThan(19)));
        assertThat(Ability.DEXTERITY.value, allOf(greaterThan(2), lessThan(19)));
        assertThat(Ability.CONSTITUTION.value, allOf(greaterThan(2), lessThan(19)));
        assertThat(Ability.STRENGTH.value, allOf(greaterThan(2), lessThan(19)));
        assertThat(Ability.WISDOM.value, allOf(greaterThan(2), lessThan(19)));
    }

    @Test
    void addFunctions() {
        Ability.resetValues();
        assertThat(Ability.INTELLIGENCE.value, is(0));
        assertThat(Ability.CHARISMA.value, is(0));
        assertThat(Ability.DEXTERITY.value, is(0));
        assertThat(Ability.CONSTITUTION.value, is(0));
        assertThat(Ability.STRENGTH.value, is(0));
        assertThat(Ability.WISDOM.value, is(0));
        add(INTELLIGENCE, 5);
        add(CHARISMA, 5);
        add(CONSTITUTION, 5);
        add(STRENGTH, 5);
        add(DEXTERITY, 5);
        add(WISDOM, 5);

        assertThat(Ability.INTELLIGENCE.value, is(5));
        assertThat(Ability.CHARISMA.value, is(5));
        assertThat(Ability.DEXTERITY.value, is(5));
        assertThat(Ability.CONSTITUTION.value, is(5));
        assertThat(Ability.STRENGTH.value, is(5));
        assertThat(Ability.WISDOM.value, is(5));
        add(WISDOM, 2);
        assertThat(Ability.WISDOM.value, is(7));
    }
}