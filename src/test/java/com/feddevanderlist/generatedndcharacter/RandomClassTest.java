package com.feddevanderlist.generatedndcharacter;

import com.feddevanderlist.generatedndcharacter.classes.GlobalClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class RandomClassTest {
    @Test
    public void randomClassTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        GlobalClass _class = new RandomClass().randomClass(characterSheet);
        assertNotNull(_class);

    }
}