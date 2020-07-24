package com.feddevanderlist.generatedndcharacter;

import com.feddevanderlist.generatedndcharacter.classes.GlobalClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class RandomClassTest {
    @Test
    public void randomClassTest() {
        CharacterSheet characterSheet = new CharacterSheet();
        GlobalClass _class = new RandomClass().randomClass(characterSheet);
        assertNotNull(_class);
    }

    @Test
    public void forFunTest() {
        List<GlobalClass> _classes = new ArrayList<>();
        while (_classes.size() < 12) {
            CharacterSheet characterSheets = new CharacterSheet();
            _classes.add(new RandomClass().randomClass(characterSheets));
        }

        assertThat(_classes.size(), is(12));
    }
}