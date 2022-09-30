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
        characterSheet.setCharacterClass(new Monk(characterSheet));
        assertThat(characterSheet.getCharacterClass(), is(notNullValue()));
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
        characterSheet.setCharacterClass(new Barbarian(characterSheet));
        characterSheet.finalCalculation();
        assertThat(characterSheet.getArmorClass(), is(10 + characterSheet.getAbilities().getDexModifier() + characterSheet.getAbilities().getConModifier()));
        characterSheet.addRandomSkillsFromList(Arrays.asList(Skills.ARCANA, Skills.HISTORY, Skills.ANIMAL_HANDLING), 1);
        assert (characterSheet.getProficiencies().contains(Skills.ARCANA) || characterSheet.getProficiencies().contains(Skills.HISTORY) || characterSheet.getProficiencies().contains(Skills.ANIMAL_HANDLING));
        assertThat(characterSheet.getCharacterClass(), isA(Barbarian.class));
    }

}