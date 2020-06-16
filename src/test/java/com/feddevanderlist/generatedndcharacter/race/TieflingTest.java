package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class TieflingTest {
    @Test
    public void testTiefling() {
        CharacterSheet characterSheet = new CharacterSheet();
        Tiefling tiefling = new Tiefling(characterSheet);
        assertThat(tiefling.getName(), is("Tiefling"));
    }
}