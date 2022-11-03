package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.Bound;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;
import com.feddevanderlist.generatedndcharacter.models.Size;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Halfling extends Race {

    public Halfling(CharacterSheet characterSheet) {
        super("Halfling",new Bound(5,40), Size.SMALL,new Bound(3,4.5),new Bound(30,50),25,Arrays.asList("Lucky", "Brave", "Halfling Nimbleness"));
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.HA));
        chooseSubrace(characterSheet);
        characterSheet.addValueToAbility(AbilityIdentifier.DEXTERITY, 2);
    }

    private void chooseSubrace(CharacterSheet characterSheet) {
        List<String> possibleSubrace = Arrays.asList("Lightfoot", "Stout");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("Lightfoot")) {
            characterSheet.addValueToAbility(AbilityIdentifier.CHARISMA, 1);
            characterSheet.addHitPoints(1);
            traits.add("Naturally Stealthy");
        } else if (subrace.equals("Stout")) {
            characterSheet.addValueToAbility(AbilityIdentifier.CONSTITUTION, 2);
            traits.add("Stout Resilience");
        }
    }
}
