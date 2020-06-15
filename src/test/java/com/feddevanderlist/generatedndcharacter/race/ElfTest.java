package com.feddevanderlist.generatedndcharacter.race;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ElfTest {
    @Test
    public void testElf() {
        Elf elf = new Elf();
        assertThat(elf.getName(), is("Elf"));
        assertThat(elf.getSubrace(), is(not(nullValue())));
    }

}