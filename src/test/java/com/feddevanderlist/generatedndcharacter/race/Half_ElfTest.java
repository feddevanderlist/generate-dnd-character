package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HalfElfTest {
    @Test
    void testHalfElf() {
        CharacterSheet characterSheet = new CharacterSheet();
        HalfElf halfElf = new HalfElf(characterSheet);
        assertThat(halfElf.getName(), is("Half-Elf"));
    }
}