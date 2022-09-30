package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


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
        characterSheet.addValueToAbility(AbilityIdentifier.CHARISMA,2);
        characterSheet.addRandomSkills(2);
    }
}
