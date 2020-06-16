package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Alignment;
import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Languages;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Elf extends Race {

    public Elf(CharacterSheet characterSheet) {
        name = "Elf";
        age = ThreadLocalRandom.current().nextInt(5, 750);
        alignment = Alignment.getRandomAlingment();
        size = "medium";
        height = ThreadLocalRandom.current().nextDouble(4.5, 6.2);
        weight = ThreadLocalRandom.current().nextInt(100, 145);
        speed = 30;
        languages.addAll(Arrays.asList("Common", "Elvish"));
        traits.addAll(Arrays.asList("Darkvision", "Keen Senses", "Fey Ancestry", "Trance"));
        characterSheet.getProficiencies().add(Skills.perception);
        chooseSubrace(characterSheet);
        characterSheet.getAbilityScore().addDexterity(2);
    }

    private void chooseSubrace(CharacterSheet characterSheet) {
        List<String> possibleSubrace = Arrays.asList("High Elf", "Wood Elf");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("High Elf")) {
            characterSheet.getAbilityScore().addInteligence(1);
            characterSheet.addHitPoints(1);
            traits.add("Elf Weapon Training");
            languages.add(Languages.getRandomLanguage(languages));
        } else if (subrace.equals("Wood Elf")) {
            characterSheet.getAbilityScore().addWisdom(1);
            traits.addAll(Arrays.asList("Elf Weapon Training", "Mask of the Wild"));
            speed = 35;
        }
    }
}
