package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.models.Bound;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;


public class Human extends Race {

    public Human(CharacterSheet characterSheet) {
        super(new Bound(4.9, 6.8), new Bound(120, 200));
        characterSheet.addLanguage(Language.getRandomLanguage(Language.CO));
        characterSheet.getAbilities().addOneToAll();
        characterSheet.addRandomSkills(1);
    }
}
