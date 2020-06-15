package com.feddevanderlist.generatedndcharacter.race;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class Half_ElfTest {
    @Test
    public void testHalfElf() {
        Half_Elf halfElf = new Half_Elf();
        assertThat(halfElf.getName(), is("Half-Elf"));
    }
}