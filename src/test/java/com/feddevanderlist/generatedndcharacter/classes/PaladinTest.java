package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PaladinTest {
    @Test
    void paladinTest() {
        CharacterSheet characterSheet = new CharacterSheet();
        Paladin paladin = new Paladin(characterSheet);
        assertThat(paladin.getName(), is("Paladin"));
    }
}