package com.feddevanderlist.generatedndcharacter;

import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;

import java.io.IOException;

public class CharacterGenerator {
    
    public static void main(String[] args) throws IOException {
       CharacterSheet characterSheet = new CharacterSheet();
        characterSheet.setRandomRace();
        characterSheet.setRandomClass();
        characterSheet.finalCalculation();
        ImageEditor printableCharacterSheet = new ImageEditor();
        printableCharacterSheet.fillAllFields(characterSheet);
        printableCharacterSheet.writeImage();
    }
}
