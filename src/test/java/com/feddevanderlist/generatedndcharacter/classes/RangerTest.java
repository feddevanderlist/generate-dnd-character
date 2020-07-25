package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RangerTest {
    @Test
    void rangerTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        Ranger ranger = new Ranger(characterSheet);
        assertThat(ranger.getName(),is("Ranger"));
    }
}