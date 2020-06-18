package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FighterTest {
    @Test
    public void fighterTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        Fighter fighter = new Fighter(characterSheet);
        assertThat(fighter.getName(),is("Fighter"));
    }
}