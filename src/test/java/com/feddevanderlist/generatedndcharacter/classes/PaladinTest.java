package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PaladinTest {
    @Test
    public void testPaladin() {
        Paladin paladin = new Paladin();
        assertThat(paladin.hitDie, is(10));
    }
}