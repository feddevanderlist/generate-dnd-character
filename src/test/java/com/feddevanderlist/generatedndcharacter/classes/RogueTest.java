package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RogueTest {
    @Test
    void rogueTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        Rogue rogue = new Rogue(characterSheet);
        assertThat(rogue.getName(),is("Rogue"));
    }

}