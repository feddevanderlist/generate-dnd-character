package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ElfTest {
    @Test
    public void testElf() {
        CharacterSheet characterSheet = new CharacterSheet();
        Elf elf = new Elf(characterSheet);
        assertThat(elf.getName(), is("Elf"));
        assertThat(elf.getSubrace(), is(not(nullValue())));
    }

}