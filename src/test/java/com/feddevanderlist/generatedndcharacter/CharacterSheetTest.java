package com.feddevanderlist.generatedndcharacter;

import com.feddevanderlist.generatedndcharacter.classes.Barbarian;
import com.feddevanderlist.generatedndcharacter.classes.Monk;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CharacterSheetTest {

    @Test
    void characterSheetTest() {
        CharacterSheet characterSheet = new CharacterSheet();
        characterSheet.addLanguage(Language.getRandomLanguage(Language.CO));
        assertThat(characterSheet.getLanguages(), hasSize(2));
        assertThat(characterSheet.getArmorClass(), is(10));
        characterSheet.setRandomRace();

        assertThat(characterSheet.getRace(), is(notNullValue()));
        characterSheet.set_class(new Monk(characterSheet));
        assertThat(characterSheet.get_class(), is(notNullValue()));
        assertThat(characterSheet.getHitDice(), is(8));
        characterSheet.finalCalculation();
        assertThat(characterSheet.getInitiative(), is(characterSheet.getAbilities().getDexModifier()));
        assertThat(characterSheet.getHitPoints(), is(characterSheet.getHitDice() + characterSheet.getAbilities().getConModifier()));
        assertThat(characterSheet.getArmorClass(), is(10 + characterSheet.getAbilities().getDexModifier() + characterSheet.getAbilities().getWisModifier()));
        int amountOfSkills = characterSheet.getProficiencies().size();
        characterSheet.addRandomSkills(2);
        assertThat(characterSheet.getProficiencies(), hasSize(amountOfSkills + 2));
    }

    @Test
    void characterBarbarianTest() {
        CharacterSheet characterSheet = new CharacterSheet();
        assertThat(characterSheet.getArmorClass(), is(10));
        characterSheet.setRandomRace();
        characterSheet.set_class(new Barbarian(characterSheet));
        characterSheet.finalCalculation();
        assertThat(characterSheet.getArmorClass(), is(10 + characterSheet.getAbilities().getDexModifier() + characterSheet.getAbilities().getConModifier()));
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.arcana, Skills.history, Skills.animalHandling), 1);
        assert (characterSheet.getProficiencies().contains(Skills.arcana) || characterSheet.getProficiencies().contains(Skills.history) || characterSheet.getProficiencies().contains(Skills.animalHandling));
        assertThat(characterSheet.get_class(), isA(Barbarian.class));
    }

}