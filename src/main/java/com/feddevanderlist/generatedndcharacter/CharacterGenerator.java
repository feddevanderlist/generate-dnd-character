package com.feddevanderlist.generatedndcharacter;

import java.io.IOException;

public class CharacterGenerator {
    
    public static void main(String[] args) throws IOException {
       CharacterSheet characterSheet = new CharacterSheet();

        characterSheet.setRace(new ChooseRace().randomRace(characterSheet));
        characterSheet.set_class(new RandomClass().randomClass(characterSheet));
        characterSheet.calculateInitiative();
        characterSheet.calculateHitPoints();
        ImageEditor printableCharacterSheet = new ImageEditor();
        printableCharacterSheet.fillAllFields(characterSheet);

        printableCharacterSheet.writeImage();
    }
}
