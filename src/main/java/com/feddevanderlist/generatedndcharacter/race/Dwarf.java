package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.models.Language;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.models.Ability.add;


public class Dwarf extends Race {

    public Dwarf(CharacterSheet characterSheet) {
        name = "Dwarf";
        age = ThreadLocalRandom.current().nextInt(5, 350);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextDouble(4, 5);
        weight = ThreadLocalRandom.current().nextInt(100, 200);
        speed = 25;
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.DW));
        traits.addAll(Arrays.asList("Darkvision", "Dwarven Resilience", "Dwarven Combat Training", "Tool Proficiency", "Stonecunning"));
        chooseSubrace(characterSheet);
        add(Ability.CONSTITUTION,2);
    }

    private void chooseSubrace(CharacterSheet characterSheet) {
        List<String> possibleSubrace = Arrays.asList("Hill Dwarves", "Mountain Dwarves");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("Hill Dwarves")) {
            add(Ability.WISDOM,1);
            characterSheet.addHitPoints(1);
            traits.add("Dwarven Toughness");
        } else if (subrace.equals("Mountain Dwarves")) {
            add(Ability.STRENGTH,2);
            traits.add("Dwarven Armor Training");
        }
    }
}
