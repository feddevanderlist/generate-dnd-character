package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class WarlockTest {
    @Test
    void warlockTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        Warlock warlock = new Warlock(characterSheet);
        assertThat(warlock.getName(),is("Warlock"));
    }
}