package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.AbilityIdentifier;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Halfling extends Race {

    public Halfling(CharacterSheet characterSheet) {
        name = "Halfling";
        age = ThreadLocalRandom.current().nextInt(5, 40);
        alignment = Alignment.getRandomAlignment();
        size = "small";
        height = ThreadLocalRandom.current().nextDouble(3, 4.5);
        weight = ThreadLocalRandom.current().nextInt(30, 50);
        speed = 25;
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.HA));
        traits.addAll(Arrays.asList("Lucky", "Brave", "Halfling Nimbleness"));
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
