package com.feddevanderlist.generatedndcharacter.race;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class HalflingTest {
    @Test
    public void testHalfling() {
        Halfling halfling = new Halfling();
        assertThat(halfling.getName(), is("Halfling"));
        assertThat(halfling.getSubrace(), is(not(nullValue())));
    }
}