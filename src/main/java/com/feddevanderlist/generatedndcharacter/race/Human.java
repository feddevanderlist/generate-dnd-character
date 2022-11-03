package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.models.Bound;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;
import com.feddevanderlist.generatedndcharacter.models.Size;


public class Human extends Race {

    public Human(CharacterSheet characterSheet) {
        super("Human", 95, Size.MEDIUM, new Bound(4.9, 6.8), new Bound(120, 200), 30);
        characterSheet.addLanguage(Language.getRandomLanguage(Language.CO));
        characterSheet.getAbilities().addOneToAll();
        characterSheet.addRandomSkills(1);
    }
}
