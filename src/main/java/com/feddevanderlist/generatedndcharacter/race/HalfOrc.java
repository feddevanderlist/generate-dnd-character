package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.Bound;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;
import com.feddevanderlist.generatedndcharacter.models.Size;

import java.util.Arrays;


public class HalfOrc extends Race {

    public HalfOrc(CharacterSheet characterSheet) {
        super("Half-Orc", 75, Size.MEDIUM, new Bound(5, 7), new Bound(130, 220), 30, Arrays.asList("Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks"));
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.OR));
        characterSheet.addValueToAbility(AbilityIdentifier.STRENGTH, 2);
        characterSheet.addValueToAbility(AbilityIdentifier.CHARISMA, 1);
    }
}
