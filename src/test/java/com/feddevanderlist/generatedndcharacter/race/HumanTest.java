package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class HumanTest {
    @Test
    public void testHuman() {
        CharacterSheet characterSheet = new CharacterSheet();
        Human human = new Human(characterSheet);
        assertThat(human.getName(), is("Human"));
        assertThat(human.getLanguages().size(), is(2));
        assertThat(human.traits.size(), is(0));
    }

}