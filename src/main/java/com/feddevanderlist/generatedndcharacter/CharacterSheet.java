package com.feddevanderlist.generatedndcharacter;


import com.feddevanderlist.generatedndcharacter.classes.GlobalClass;
import com.feddevanderlist.generatedndcharacter.race.Race;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CharacterSheet {
    public static int armorClass = 10;
    public static int hitPoints;
    public static HashMap<Integer, Integer> hitDice;
    public static int initiative;
    public static int proficiencyBonus;
    public static List<Skills> proficiencies;
    public static GlobalClass _class;
    public static Race race;
    public static AbilityScore abilityScore;
    public static List<String> savingThrowProficiencies;

    public CharacterSheet() {

    }

    public static void addHitPoints(int hp) {
        hitPoints += hp;
    }

    public static void addArmorClass(int ac) {
        armorClass += ac;
    }

    public static void addRandomSkillsFromList(List<Skills> possible, int amount) {
        possible.removeAll(proficiencies);
        for (int i = 0; i < amount; i++) {
            int random = ThreadLocalRandom.current().nextInt(possible.size());
            proficiencies.add(possible.get(random));
            possible.remove(random);
        }
    }

    public static void addRandomSkills(int amount) {
        List<Skills> allSkils = Arrays.asList(Skills.values());
        allSkils.removeAll(proficiencies);
        for (int i = 0; i < amount; i++) {
            int random = ThreadLocalRandom.current().nextInt(allSkils.size());
            proficiencies.add(allSkils.get(random));
            allSkils.remove(random);
        }
    }
}
