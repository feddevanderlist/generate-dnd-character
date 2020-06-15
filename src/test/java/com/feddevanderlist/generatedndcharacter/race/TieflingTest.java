package com.feddevanderlist.generatedndcharacter.race;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class TieflingTest {
    @Test
    public void testTiefling(){
      Tiefling tiefling =  new Tiefling();
      assertThat(tiefling.getName(),is("Tiefling"));
    }
}