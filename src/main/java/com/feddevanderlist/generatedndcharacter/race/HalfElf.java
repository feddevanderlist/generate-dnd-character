package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.Ability;
import com.feddevanderlist.generatedndcharacter.Alignment;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Languages;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.Ability.add;


public class HalfElf extends Race {

    public HalfElf(CharacterSheet characterSheet) {
        name = "Half-Elf";
        age = ThreadLocalRandom.current().nextInt(350);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(5, 6);
        weight = ThreadLocalRandom.current().nextInt(120, 200);
        speed = 30;
        languages.add(Languages.getRandomLanguage(Arrays.asList("Common", "Elvish")));
        traits = Arrays.asList("Darkvision", "Fey Ancestry", "Skill Versatility");
        subrace = null;
        add(Ability.CHARISMA,2);
        characterSheet.addRandomSkills(2);
    }
}
