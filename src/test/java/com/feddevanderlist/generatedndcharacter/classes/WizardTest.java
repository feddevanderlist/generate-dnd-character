package com.feddevanderlist.generatedndcharacter.classes;

import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class WizardTest {
    @Test
    void wizardTest(){
        CharacterSheet characterSheet = new CharacterSheet();
        Wizard wizard = new Wizard(characterSheet);
        assertThat(wizard.getName(),is("Wizard"));
    }
}