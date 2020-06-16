package com.feddevanderlist.generatedndcharacter;

public class CharacterGenerator {

    public static void main(String[] args) {
        CharacterSheet characterSheet = new CharacterSheet();
        characterSheet.setRace(new ChooseRace().randomRace(characterSheet));
        characterSheet.set_class(new RandomClass().randomClass(characterSheet));
        characterSheet.calculateInitiative();
        System.out.println(characterSheet.getRace().getName());
        System.out.println(characterSheet.get_class().getName());
    }
}
