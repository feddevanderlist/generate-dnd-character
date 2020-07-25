package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class Half_ElfTest {
    @Test
    void testHalfElf() {
        CharacterSheet characterSheet = new CharacterSheet();
        HalfElf halfElf = new HalfElf(characterSheet);
        assertThat(halfElf.getName(), is("Half-Elf"));
    }
}