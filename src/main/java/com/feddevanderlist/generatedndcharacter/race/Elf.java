package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.*;
import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.models.Languages;
import com.feddevanderlist.generatedndcharacter.models.Skills;
import com.feddevanderlist.generatedndcharacter.models.Alignment;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.feddevanderlist.generatedndcharacter.models.Ability.add;


public class Elf extends Race {

    public Elf(CharacterSheet characterSheet) {
        name = "Elf";
        age = ThreadLocalRandom.current().nextInt(5, 750);
        alignment = Alignment.getRandomAlignment();
        size = "medium";
        height = ThreadLocalRandom.current().nextDouble(4.5, 6.2);
        weight = ThreadLocalRandom.current().nextInt(100, 145);
        speed = 30;
        languages.addAll(Arrays.asList(Languages.CO, Languages.EL));
        traits.addAll(Arrays.asList("Darkvision", "Keen Senses", "Fey Ancestry", "Trance"));
        characterSheet.getProficiencies().add(Skills.perception);
        chooseSubrace(characterSheet);
        add(Ability.DEXTERITY, 2);
    }

    private void chooseSubrace(CharacterSheet characterSheet) {
        List<String> possibleSubrace = Arrays.asList("High Elf", "Wood Elf");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("High Elf")) {
            add(Ability.INTELLIGENCE, 1);
            characterSheet.addHitPoints(1);
            traits.add("Elf Weapon Training");
            languages.add(Languages.getRandomLanguage(languages));
        } else if (subrace.equals("Wood Elf")) {
            add(Ability.WISDOM, 1);
            traits.addAll(Arrays.asList("Elf Weapon Training", "Mask of the Wild"));
            speed = 35;
        }
    }
}
