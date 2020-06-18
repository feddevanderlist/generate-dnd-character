package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class DruidTest {
    @Test
    public void druidTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        Druid druid = new Druid(characterSheet);
        assertThat(druid.getName(),is("Druid"));
    }
}