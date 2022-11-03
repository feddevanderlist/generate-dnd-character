package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Elf extends Race {

    public Elf(CharacterSheet characterSheet) {
        super("Elf", new Bound(5, 750), Size.MEDIUM, new Bound(4.5, 6.2), new Bound(100, 145), 30, Arrays.asList("Darkvision", "Keen Senses", "Fey Ancestry", "Trance"));
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.EL));

        characterSheet.getProficiencies().add(Skills.PERCEPTION);
        chooseSubrace(characterSheet);
        characterSheet.addValueToAbility(AbilityIdentifier.DEXTERITY, 2);
    }

    private void chooseSubrace(CharacterSheet characterSheet) {
        List<String> possibleSubrace = Arrays.asList("High Elf", "Wood Elf");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("High Elf")) {
            characterSheet.addValueToAbility(AbilityIdentifier.INTELLIGENCE, 1);
            characterSheet.addHitPoints(1);
            traits.add("Elf Weapon Training");
            characterSheet.addLanguage(Language.getRandomLanguage(characterSheet.getLanguages()));
        } else if (subrace.equals("Wood Elf")) {
            characterSheet.addValueToAbility(AbilityIdentifier.WISDOM, 1);
            traits.addAll(Arrays.asList("Elf Weapon Training", "Mask of the Wild"));
            speed = 35;
        }
    }
}
