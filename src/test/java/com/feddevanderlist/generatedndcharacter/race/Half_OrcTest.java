package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Half_OrcTest {
    @Test
    void testOrc() {
        HalfOrc orc = new HalfOrc(new CharacterSheet());
        assertThat(orc.getName(), is("Half-Orc"));
    }
}