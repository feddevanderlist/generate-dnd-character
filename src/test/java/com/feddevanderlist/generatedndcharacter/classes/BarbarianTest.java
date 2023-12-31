package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;


class BarbarianTest {
    @Test
    void barbarianTest() {
        
        CharacterSheet characterSheet = new CharacterSheet();
        MatcherAssert.assertThat(characterSheet.getArmorClass(), is(10));
        Barbarian barbarian = new Barbarian(characterSheet);
        MatcherAssert.assertThat(barbarian.primaryAbilities.size(), is(1));
        MatcherAssert.assertThat(characterSheet.getProficiencyBonus(), is(2));
        MatcherAssert.assertThat(characterSheet.getProficiencies().size(), is(2));
        MatcherAssert.assertThat(characterSheet.getProficiencies().size(), is(2) );
        MatcherAssert.assertThat(characterSheet.getSavingThrowProficiencies(), contains(AbilityIdentifier.STRENGTH, AbilityIdentifier.CONSTITUTION));
        MatcherAssert.assertThat(barbarian.getArmorProficiencies().size(), is(3));
        MatcherAssert.assertThat(barbarian.getWeaponProficiencies().size(), is(2));
        MatcherAssert.assertThat(barbarian.getPrimaryAbility(), hasItem(AbilityIdentifier.STRENGTH));
    }
}