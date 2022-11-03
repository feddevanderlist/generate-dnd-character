package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Dwarf extends Race {

    public Dwarf(CharacterSheet characterSheet) {
        super("Dwarf",new Bound(5,350),Size.MEDIUM,new Bound(4,5),new Bound(100,200),25,Arrays.asList("Darkvision", "Dwarven Resilience", "Dwarven Combat Training", "Tool Proficiency", "Stonecunning"));

        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.DW));
        chooseSubrace(characterSheet);
        characterSheet.addValueToAbility(AbilityIdentifier.CONSTITUTION, 2);
    }

    private void chooseSubrace(CharacterSheet characterSheet) {
        List<String> possibleSubrace = Arrays.asList("Hill Dwarves", "Mountain Dwarves");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("Hill Dwarves")) {
            characterSheet.addValueToAbility(AbilityIdentifier.WISDOM, 1);
            characterSheet.addHitPoints(1);
            traits.add("Dwarven Toughness");
        } else if (subrace.equals("Mountain Dwarves")) {
            characterSheet.addValueToAbility(AbilityIdentifier.STRENGTH, 2);
            traits.add("Dwarven Armor Training");
        }
    }
}
