package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GnomeTest {
    @Test
    public void testGnome() {
        CharacterSheet characterSheet = new CharacterSheet();
        Gnome gnome = new Gnome(characterSheet);
        assertThat(gnome.getName(), is("Gnome"));
        assertThat(gnome.getSubrace(), is(not(nullValue())));
    }


}