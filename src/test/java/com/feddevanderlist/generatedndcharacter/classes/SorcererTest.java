package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SorcererTest {
    @Test
    void sorcererTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        Sorcerer sorcerer = new Sorcerer(characterSheet);
        assertThat(sorcerer.getName(),is("Sorcerer"));
    }
}