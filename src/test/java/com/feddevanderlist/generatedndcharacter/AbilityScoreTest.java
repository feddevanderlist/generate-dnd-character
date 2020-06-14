package com.feddevanderlist.generatedndcharacter;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class AbilityScoreTest {


    @Test
    void addOneToAll() {
        AbilityScore abilityScore = new AbilityScore();
        abilityScore.addOneToAll();
        assertThat(abilityScore.getIntelligence(), is(1));
        assertThat(abilityScore.getCharisma(), is(1));
        assertThat(abilityScore.getDexterity(), is(1));
        assertThat(abilityScore.getConstitution(), is(1));
        assertThat(abilityScore.getStrength(), is(1));
        assertThat(abilityScore.getWisdom(), is(1));
    }

    @Test
    void getIntModifier() {
        AbilityScore abilityScore = new AbilityScore();
        assertThat(abilityScore.getIntelligence(), is(0));
        abilityScore.setIntelligence(1);
        assertThat(abilityScore.getIntelligence(), is(1));
        assertThat(abilityScore.getIntModifier(), is(-5));
    }

    @Test
    void getDexModifier() {
        AbilityScore abilityScore = new AbilityScore();
        assertThat(abilityScore.getDexterity(), is(0));
        abilityScore.setDexterity(10);
        assertThat(abilityScore.getDexterity(), is(10));
        assertThat(abilityScore.getDexModifier(), is(0));
    }

    @Test
    void getConModifier() {
        AbilityScore abilityScore = new AbilityScore();
        assertThat(abilityScore.getConstitution(), is(0));
        abilityScore.setConstitution(11);
        assertThat(abilityScore.getConstitution(), is(11));
        assertThat(abilityScore.getConModifier(), is(0));
    }

    @Test
    void getStrModifier() {
        AbilityScore abilityScore = new AbilityScore();
        assertThat(abilityScore.getStrength(), is(0));
        abilityScore.setStrength(2);
        assertThat(abilityScore.getStrength(), is(2));
        assertThat(abilityScore.getStrModifier(), is(-4));
    }

    @Test
    void getWisModifier() {
        AbilityScore abilityScore = new AbilityScore();
        assertThat(abilityScore.getWisdom(), is(0));
        abilityScore.setWisdom(3);
        assertThat(abilityScore.getWisdom(), is(3));
        assertThat(abilityScore.getWisModifier(), is(-4));
    }

    @Test
    void getChrModifier() {
        AbilityScore abilityScore = new AbilityScore();
        assertThat(abilityScore.getCharisma(), is(0));
        abilityScore.setCharisma(7);
        assertThat(abilityScore.getCharisma(), is(7));
        assertThat(abilityScore.getChrModifier(), is(-2));
    }

    @Test
    void rolAbilityScore() {
        AbilityScore abilityScore = new AbilityScore();
        for (int i = 0; i < 5000; i++) {
            int result = abilityScore.rolAbilityScore();
            assertThat(result, allOf(greaterThan(2), lessThan(19)));
        }
    }

    @Test
    void rounding() {
        for (int i = 1; i < 30; i++) {
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
    }

    @Test
    void init() {
        AbilityScore abilityScore = new AbilityScore();
        assertThat(abilityScore.getIntelligence(), is(0));
        assertThat(abilityScore.getCharisma(), is(0));
        assertThat(abilityScore.getDexterity(), is(0));
        assertThat(abilityScore.getConstitution(), is(0));
        assertThat(abilityScore.getStrength(), is(0));
        assertThat(abilityScore.getWisdom(), is(0));
        abilityScore.init();
        assertThat(abilityScore.getIntelligence(), allOf(greaterThan(2), lessThan(19)));
        assertThat(abilityScore.getCharisma(), allOf(greaterThan(2), lessThan(19)));
        assertThat(abilityScore.getDexterity(), allOf(greaterThan(2), lessThan(19)));
        assertThat(abilityScore.getConstitution(), allOf(greaterThan(2), lessThan(19)));
        assertThat(abilityScore.getStrength(), allOf(greaterThan(2), lessThan(19)));
        assertThat(abilityScore.getWisdom(), allOf(greaterThan(2), lessThan(19)));
    }

    @Test
    void addFunctions(){
        AbilityScore abilityScore = new AbilityScore();
        assertThat(abilityScore.getIntelligence(), is(0));
        assertThat(abilityScore.getCharisma(), is(0));
        assertThat(abilityScore.getDexterity(), is(0));
        assertThat(abilityScore.getConstitution(), is(0));
        assertThat(abilityScore.getStrength(), is(0));
        assertThat(abilityScore.getWisdom(), is(0));
        abilityScore.addInteligence(5);
        abilityScore.addCharisma(5);
        abilityScore.addConstitution(5);
        abilityScore.addDexterity(5);
        abilityScore.addStrength(5);
        abilityScore.addWisdom(5);
        assertThat(abilityScore.getIntelligence(), is(5));
        assertThat(abilityScore.getCharisma(), is(5));
        assertThat(abilityScore.getDexterity(), is(5));
        assertThat(abilityScore.getConstitution(), is(5));
        assertThat(abilityScore.getStrength(), is(5));
        assertThat(abilityScore.getWisdom(), is(5));
        abilityScore.addWisdom(2);
        assertThat(abilityScore.getWisdom(), is(7));

    }
}