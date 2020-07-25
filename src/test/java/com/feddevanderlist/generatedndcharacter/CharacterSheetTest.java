package com.feddevanderlist.generatedndcharacter;

import com.feddevanderlist.generatedndcharacter.classes.Barbarian;
import com.feddevanderlist.generatedndcharacter.classes.Monk;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CharacterSheetTest {

    @Test
    void characterSheetTest() {
        CharacterSheet characterSheet = new CharacterSheet();
        assertThat(characterSheet.getArmorClass(), is(10));
        characterSheet.setRace(new ChooseRace().randomRace(characterSheet));
        assertThat(characterSheet.getRace(), is(notNullValue()));
        characterSheet.set_class(new Monk(characterSheet));
        assertThat(characterSheet.get_class(), is(notNullValue()));
        assertThat(characterSheet.getHitDice(), is(8));
        characterSheet.finalCalculation();
        assertThat(characterSheet.getInitiative(), is(Ability.getDexModifier()));
        assertThat(characterSheet.getHitPoints(), is(characterSheet.getHitDice() + Ability.getConModifier()));
        assertThat(characterSheet.getArmorClass(), is(10 + Ability.getDexModifier()));
    }
    @Test
    void characterBarbarianTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        assertThat(characterSheet.getArmorClass(), is(10));
        characterSheet.setRace(new ChooseRace().randomRace(characterSheet));
        characterSheet.set_class(new Barbarian(characterSheet));
        characterSheet.finalCalculation();
        assertThat(characterSheet.getArmorClass(), is(10 + Ability.getDexModifier() + Ability.getConModifier()));
    }

}