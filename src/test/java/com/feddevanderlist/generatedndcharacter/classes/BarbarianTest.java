package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;


class BarbarianTest {
    @Test
    public void barbarianTest() {
        Ability.resetValues();
        CharacterSheet characterSheet = new CharacterSheet();
        MatcherAssert.assertThat(characterSheet.getArmorClass(), is(10));
        Barbarian barbarian = new Barbarian(characterSheet);
        MatcherAssert.assertThat(barbarian.primaryAbility.size(), is(1));
        MatcherAssert.assertThat(characterSheet.getProficiencyBonus(), is(2));
        MatcherAssert.assertThat(characterSheet.getProficiencies().size(), is(2));
        MatcherAssert.assertThat(characterSheet.getSavingThrowProficiencies().size(), is(2));
        MatcherAssert.assertThat(characterSheet.getArmorClass(), is(10 + Ability.getDexModifier() + Ability.getConModifier()));
        MatcherAssert.assertThat(barbarian.getArmorProfieciencies().size(), is(3));
        MatcherAssert.assertThat(barbarian.getWeaponProficiencies().size(), is(2));
        MatcherAssert.assertThat(barbarian.getPrimaryAbility(), hasItem(Ability.STRENGTH));
    }
}