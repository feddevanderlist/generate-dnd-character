package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.Alignment;

import com.feddevanderlist.generatedndcharacter.CharacterSheet;
import com.feddevanderlist.generatedndcharacter.Languages;
import com.feddevanderlist.generatedndcharacter.Skills;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Elf extends Race {

    public Elf() {

        age = ThreadLocalRandom.current().nextInt(5, 750);
        alignment = Alignment.getRandomAlingment();
        size = "medium";
        height = ThreadLocalRandom.current().nextDouble(4.5, 6.2);
        weight = ThreadLocalRandom.current().nextInt(100, 145);
        speed = 30;
        languages = Arrays.asList("Common", "Elvish");
        traits = Arrays.asList("Darkvision", "Keen Senses", "Fey Ancestry", "Trance");
        CharacterSheet.proficiencies.add(Skills.perception);
        chooseSubrace();
        CharacterSheet.abilityScore.addDexterity(2);
    }

    private void chooseSubrace() {
        List<String> possibleSubrace = Arrays.asList("High Elf", "Wood Elf");
        subrace = possibleSubrace.get(ThreadLocalRandom.current().nextInt(possibleSubrace.size()));
        if (subrace.equals("High Elf")) {
            CharacterSheet.abilityScore.addInteligence(1);
            CharacterSheet.addHitPoints(1);
            traits.add("Elf Weapon Training");
            Languages.getRandomLanguage(languages);
        } else if (subrace.equals("Wood Elf")) {
            CharacterSheet.abilityScore.addWisdom(1);
            traits.addAll(Arrays.asList("Elf Weapon Training", "Mask of the Wild"));
            speed = 35;
        }
    }
}
