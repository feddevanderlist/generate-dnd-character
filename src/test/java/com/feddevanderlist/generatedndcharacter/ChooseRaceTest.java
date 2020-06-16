package com.feddevanderlist.generatedndcharacter;

import com.feddevanderlist.generatedndcharacter.race.Race;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ChooseRaceTest {

    @Test
    void randomRace() {
        CharacterSheet characterSheet = new CharacterSheet();
        Race race = new ChooseRace().randomRace(characterSheet);
        assertThat(race, is(not(nullValue())));
        assertThat(race.getName(), is(not(emptyString())));
        assertThat(race.getAge(), is(not(nullValue())));
        assertThat(race.getAlignment(), is(not(emptyString())));
        assertThat(race.getGender(), is(not(emptyString())));
        assertThat(race.getWeight(), is(not(nullValue())));
        assertThat(race.getHeight(), is(not(nullValue())));
        assertThat(race.getLanguages(), is(not(nullValue())));
        assertThat(race.getSpeed(), is(not(nullValue())));
        assertThat(race.getTraits(), is(not(nullValue())));
        assertThat(race.getSize(), is(not(nullValue())));
    }
}