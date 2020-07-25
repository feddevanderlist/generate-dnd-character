package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class Half_OrcTest {
    @Test
    void testOrc() {
        CharacterSheet characterSheet = new CharacterSheet();
        HalfOrc orc = new HalfOrc();
        assertThat(orc.getName(), is("Half-Orc"));
    }
}