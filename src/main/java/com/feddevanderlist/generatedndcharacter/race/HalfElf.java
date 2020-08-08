package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;
import com.feddevanderlist.generatedndcharacter.models.Alignment;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.models.Ability.add;


public class HalfElf extends Race {

    public HalfElf(CharacterSheet characterSheet) {
        name = "Half-Elf";
        age = ThreadLocalRandom.current().nextInt(350);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(5, 6);
        weight = ThreadLocalRandom.current().nextInt(120, 200);
        speed = 30;
        characterSheet.addLanguage(Language.getRandomLanguage(Arrays.asList(Language.CO, Language.EL)));
        traits = Arrays.asList("Darkvision", "Fey Ancestry", "Skill Versatility");
        subrace = null;
        add(Ability.CHARISMA,2);
        characterSheet.addRandomSkills(2);
    }
}
