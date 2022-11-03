package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.Bound;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;
import com.feddevanderlist.generatedndcharacter.models.Size;

import java.util.Arrays;


public class HalfElf extends Race {

    public HalfElf(CharacterSheet characterSheet) {
        super("Half-Elf", 350, Size.MEDIUM, new Bound(5, 6), new Bound(120, 200), 30, Arrays.asList("Darkvision", "Fey Ancestry", "Skill Versatility"));
        characterSheet.addLanguage(Language.getRandomLanguage(Arrays.asList(Language.CO, Language.EL)));
        characterSheet.addValueToAbility(AbilityIdentifier.CHARISMA, 2);
        characterSheet.addRandomSkills(2);
    }
}
