package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BardTest {
    @Test
    void bardTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        Bard bard = new Bard(characterSheet);
        assertThat(bard.getName(),is("Bard"));
    }
}