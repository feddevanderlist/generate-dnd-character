package com.feddevanderlist.generatedndcharacter.race;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class DwarfTest {
    @Test
    public void testDwarf() {
        Dwarf dwarf = new Dwarf();
        assertThat(dwarf.getName(), is("Dwarf"));
        assertThat(dwarf.getSubrace(), is(not(nullValue())));
    }

}