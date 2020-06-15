package com.feddevanderlist.generatedndcharacter.race;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class GnomeTest {
    @Test
    public void testGnome() {
        Gnome gnome = new Gnome();
        assertThat(gnome.getName(), is("Gnome"));
        assertThat(gnome.getSubrace(), is(not(nullValue())));
    }


}