package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class MonkTest {

    @Test
    public void monkTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        Monk monk = new Monk(characterSheet);
        assertThat(monk.getName(),is("Monk"));
    }

}