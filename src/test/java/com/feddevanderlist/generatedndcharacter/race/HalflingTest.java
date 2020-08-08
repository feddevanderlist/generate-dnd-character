package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HalflingTest {
    @Test
    void testHalfling() {
        CharacterSheet characterSheet = new CharacterSheet();
        Halfling halfling = new Halfling(characterSheet);
        assertThat(halfling.getName(), is("Halfling"));
        assertThat(halfling.getSubrace(), is(not(nullValue())));
    }
}