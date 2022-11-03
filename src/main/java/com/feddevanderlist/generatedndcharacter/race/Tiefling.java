package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.Bound;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;
import com.feddevanderlist.generatedndcharacter.models.Size;
import com.feddevanderlist.generatedndcharacter.models.Skills;

import java.util.Arrays;


public class Tiefling extends Race {

    public Tiefling(CharacterSheet characterSheet) {
        super("Tiefling", new Bound(0, 100), Size.MEDIUM, new Bound(4, 5), new Bound(100, 200), 30, Arrays.asList("Darkvision", "Hellish Resistance", "Infernal Legacy"));
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.IN));
        characterSheet.getProficiencies().add(Skills.INTIMIDATION);
        characterSheet.addValueToAbility(AbilityIdentifier.CHARISMA, 2);
        characterSheet.addValueToAbility(AbilityIdentifier.INTELLIGENCE, 1);
    }
}
