package com.feddevanderlist.generatedndcharacter.race;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class HumanTest {
    @Test
    public void testHuman() {
        Human human = new Human();
        assertThat(human.getName(), is("Human"));
        assertThat(human.getLanguages().size(), is(2));
        assertThat(human.traits.size(), is(0));
    }

}