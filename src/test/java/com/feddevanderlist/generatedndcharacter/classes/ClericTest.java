package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ClericTest {
    @Test
    void clericTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        Cleric cleric = new Cleric(characterSheet);
        assertThat(cleric.getName(),is("Cleric"));
    }
}