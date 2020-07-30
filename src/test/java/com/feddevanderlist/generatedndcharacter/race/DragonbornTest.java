package com.feddevanderlist.generatedndcharacter.race;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class DragonbornTest {

    @Test
    void testDragonborn() {
        Dragonborn dragonborn = new Dragonborn();
        assertThat(dragonborn.getName(), is("Dragonborn"));
        assertThat(dragonborn.getSubrace(), is(not(nullValue())));
    }

}