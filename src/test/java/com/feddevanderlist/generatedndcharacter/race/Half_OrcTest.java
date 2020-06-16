package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class Half_OrcTest {
    @Test
    public void testOrc() {
        CharacterSheet characterSheet = new CharacterSheet();
        Half_Orc orc = new Half_Orc(characterSheet);
        assertThat(orc.getName(), is("Half-Orc"));
    }
}