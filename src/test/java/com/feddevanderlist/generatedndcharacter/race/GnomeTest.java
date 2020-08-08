package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GnomeTest {
    @Test
    void testGnome() {
        Gnome gnome = new Gnome(new CharacterSheet());
        assertThat(gnome.getName(), is("Gnome"));
        assertThat(gnome.getSubrace(), is(not(nullValue())));
    }


}