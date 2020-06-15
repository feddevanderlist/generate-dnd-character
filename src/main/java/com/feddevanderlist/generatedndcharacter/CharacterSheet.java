package com.feddevanderlist.generatedndcharacter;


import com.feddevanderlist.generatedndcharacter.classes.GlobalClass;
import com.feddevanderlist.generatedndcharacter.race.Race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CharacterSheet {
    private static int armorClass = 10;
    private static int hitPoints = 0;
    private static HashMap<Integer, Integer> hitDice = new HashMap<>();
    private static int initiative = 0;
    private static int proficiencyBonus = 0;
    private static List<Skills> proficiencies = new ArrayList<>();
    private static GlobalClass _class = null;
    private static Race race = null;
    private static AbilityScore abilityScore = new AbilityScore();
    private static List<String> savingThrowProficiencies = new ArrayList<>();

    public CharacterSheet() {

    }


    public static int getArmorClass() {
        return armorClass;
    }

    public static void setArmorClass(int armorClass) {
        CharacterSheet.armorClass = armorClass;
    }

    public static int getHitPoints() {
        return hitPoints;
    }

    public static void setHitPoints(int hitPoints) {
        CharacterSheet.hitPoints = hitPoints;
    }

    public static HashMap<Integer, Integer> getHitDice() {
        return hitDice;
    }

    public static void setHitDice(HashMap<Integer, Integer> hitDice) {
        CharacterSheet.hitDice = hitDice;
    }

    public static int getInitiative() {
        return initiative;
    }

    public static void setInitiative(int initiative) {
        CharacterSheet.initiative = initiative;
    }

    public static int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public static List<Skills> getProficiencies() {
        return proficiencies;
    }

    public static GlobalClass get_class() {
        return _class;
    }

    public static void set_class(GlobalClass _class) {
        CharacterSheet._class = _class;
    }

    public static Race getRace() {
        return race;
    }

    public static void setRace(Race race) {
        CharacterSheet.race = race;
    }

    public static AbilityScore getAbilityScore() {
        return abilityScore;
    }

    public static void setAbilityScore(AbilityScore abilityScore) {
        CharacterSheet.abilityScore = abilityScore;
    }

    public static List<String> getSavingThrowProficiencies() {
        return savingThrowProficiencies;
    }

    public static void addHitPoints(int hp) {
        hitPoints += hp;
    }

    public static void addArmorClass(int ac) {
        armorClass += ac;
    }

    public static void addProficiencyBonus(int pb) {
        proficiencyBonus += pb;
    }

    public static void addRandomSkillsFromList(List<Skills> possible, int amount) {
        ArrayList<Skills> skillsArrayList = new ArrayList<>(possible);
        if (!proficiencies.isEmpty()) {
            skillsArrayList.removeAll(proficiencies);
        }
        for (int i = 0; i < amount; i++) {
            Skills skill = skillsArrayList.get(ThreadLocalRandom.current().nextInt(skillsArrayList.size()));
            proficiencies.add(skill);
            skillsArrayList.remove(skill);
        }
    }

    public static void addRandomSkills(int amount) {
        List<Skills> allSkils = new ArrayList<>(Arrays.asList(Skills.values()));
        if (!proficiencies.isEmpty()) {
            allSkils.removeAll(proficiencies);
        }
        for (int i = 0; i < amount; i++) {
            int random = ThreadLocalRandom.current().nextInt(allSkils.size());
            Skills skill = allSkils.get(random);
            proficiencies.add(skill);
            allSkils.remove(skill);
        }
    }
}
