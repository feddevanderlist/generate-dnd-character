package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.Alignment;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Languages;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class Half_Elf extends Race {

    public Half_Elf(CharacterSheet characterSheet) {
        name = "Half-Elf";
        age = ThreadLocalRandom.current().nextInt(350);
        alignment = Alignment.getRandomAlingment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(5, 6);
        weight = ThreadLocalRandom.current().nextInt(120, 200);
        speed = 30;
        languages.add(Languages.getRandomLanguage(Arrays.asList("Common", "Elvish")));
        traits = Arrays.asList("Darkvision", "Fey Ancestry", "Skill Versatility");
        subrace = null;
        characterSheet.getAbilityScore().addCharisma(2);
        characterSheet.addRandomSkills(2);
    }
}
