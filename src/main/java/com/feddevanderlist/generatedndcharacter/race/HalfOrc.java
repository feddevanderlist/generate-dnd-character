package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class HalfOrc extends Race {

    public HalfOrc(CharacterSheet characterSheet) {
        name = "Half-Orc";
        age = ThreadLocalRandom.current().nextInt(75);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextInt(5, 7);
        weight = ThreadLocalRandom.current().nextInt(130, 220);
        speed = 30;
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.OR));
        traits = Arrays.asList("Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks");
        subrace = null;
        characterSheet.addValueToAbility(AbilityIdentifier.STRENGTH,2);
        characterSheet.addValueToAbility(AbilityIdentifier.CHARISMA ,1);
    }
}
