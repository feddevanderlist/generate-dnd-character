package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class Half_ElfTest {
    @Test
    public void testHalfElf() {
        CharacterSheet characterSheet = new CharacterSheet();
        Half_Elf halfElf = new Half_Elf(characterSheet);
        assertThat(halfElf.getName(), is("Half-Elf"));
    }
}