package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class DwarfTest {
    @Test
    public void testDwarf() {
        CharacterSheet characterSheet = new CharacterSheet();
        Dwarf dwarf = new Dwarf(characterSheet);
        assertThat(dwarf.getName(), is("Dwarf"));
        assertThat(dwarf.getSubrace(), is(not(nullValue())));
    }

}