package com.feddevanderlist.generatedndcharacter;

import com.feddevanderlist.generatedndcharacter.classes.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomClass {
    List<String> classes = Arrays.asList("Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard");

    public RandomClass() {
    }

    public GlobalClass randomClass(CharacterSheet characterSheet) {

        return switch (classes.get(ThreadLocalRandom.current().nextInt(classes.size()))) {
            case "Barbarian" -> new Barbarian(characterSheet);
            case "Bard" -> new Bard(characterSheet);
            case "Cleric" -> new Cleric(characterSheet);
            case "Druid" -> new Druid(characterSheet);
            case "Fighter" -> new Fighter(characterSheet);
            case "Monk" -> new Monk(characterSheet);
            case "Paladin" -> new Paladin(characterSheet);
            case "Ranger" -> new Ranger(characterSheet);
            case "Rogue" -> new Rogue(characterSheet);
            case "Sorcerer" -> new Sorcerer(characterSheet);
            case "Warlock" -> new Warlock(characterSheet);
            case "Wizard" -> new Wizard(characterSheet);
            default -> null;
        };
    }
}
