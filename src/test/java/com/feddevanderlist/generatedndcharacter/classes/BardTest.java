package com.feddevanderlist.generatedndcharacter.classes;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BardTest {
    @Test
    public void testBard() {
        Bard bard = new Bard();
        assertThat(bard.hitDie,is(8));
        assertThat(bard.primaryAbility.get(0),is("Charisma"));
        assertThat(bard.weaponProficiencies.size(),is(1));
        assertThat(bard.armorProfieciencies.size(),is(5));
    }

}