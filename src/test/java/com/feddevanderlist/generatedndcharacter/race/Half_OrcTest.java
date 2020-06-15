package com.feddevanderlist.generatedndcharacter.race;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class Half_OrcTest {
    @Test
    public void testOrc() {
        Half_Orc orc = new Half_Orc();
        assertThat(orc.getName(), is("Half-Orc"));
    }
}