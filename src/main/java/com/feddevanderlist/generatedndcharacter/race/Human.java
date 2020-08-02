package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.Language;

import java.util.concurrent.ThreadLocalRandom;


public class Human extends Race {

    public Human(CharacterSheet characterSheet) {
        name = "Human";
        age = ThreadLocalRandom.current().nextInt(95);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextDouble(4.9, 6.8);
        weight = ThreadLocalRandom.current().nextInt(120, 200);
        speed = 30;
        languages.addAll(Language.getRandomLanguage(Language.CO));
        Ability.addOneToAll();
        characterSheet.addRandomSkills(1);
    }
}
