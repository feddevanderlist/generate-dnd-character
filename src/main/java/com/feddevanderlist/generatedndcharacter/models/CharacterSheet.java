package com.feddevanderlist.generatedndcharacter.models;


import com.feddevanderlist.generatedndcharacter.classes.*;
import com.feddevanderlist.generatedndcharacter.race.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CharacterSheet {
    private int armorClass;
    private int hitPoints;
    private int hitDice;
    private int initiative;
    private int proficiencyBonus;
    private final List<Skills> proficiencies;
    private GlobalClass characterClass;
    private Race race;
    private final List<AbilityIdentifier> savingThrowProficiencies;
    private int spellSaveDc;
    private int spellAttackMod;
    private final List<Language> languageList;
    private final Abilities abilities;

    public CharacterSheet() {
        armorClass = 10;
        hitPoints = 0;
        hitDice = 0;
        initiative = 0;
        proficiencyBonus = 0;
        proficiencies = new ArrayList<>();
        characterClass = null;
        race = null;
        abilities = new Abilities();
        abilities.init();
        savingThrowProficiencies = new ArrayList<>();
        languageList = new ArrayList<>();
    }


    public int getArmorClass() {
        return armorClass;
    }


    public int getSpellSaveDc() {
        calculateSpellDC();
        return spellSaveDc;
    }

    public int getSpellAttackMod() {
        calculateSpellAtkMod();
        return spellAttackMod;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getHitDice() {
        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public List<Skills> getProficiencies() {
        return proficiencies;
    }

    public GlobalClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(GlobalClass characterClass) {
        this.characterClass = characterClass;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public List<AbilityIdentifier> getSavingThrowProficiencies() {
        return savingThrowProficiencies;
    }

    public void addHitPoints(int hp) {
        hitPoints += hp;
    }

    public void addProficiencyBonus(int pb) {
        proficiencyBonus += pb;
    }

    public void addRandomSkillsFromList(List<Skills> possible, int amount) {
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

    public void addRandomSkills(int amount) {
        List<Skills> allSkills = new ArrayList<>(Arrays.asList(Skills.values()));
        if (!proficiencies.isEmpty()) {
            allSkills.removeAll(proficiencies);
        }
        if (allSkills.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Somehow there are no skills left wtf. \n the class name is: " + characterClass.getName());
        }
        for (int i = 0; i < amount; i++) {
            int random = ThreadLocalRandom.current().nextInt(allSkills.size());
            Skills skill = allSkills.get(random);
            proficiencies.add(skill);
            allSkills.remove(skill);
        }
    }

    public void calculateInitiative() {
        this.initiative = abilities.getDexModifier();
    }

    public void calculateHitPoints() {
        this.hitPoints = this.hitDice + abilities.getConModifier();
    }

    public void calculateSpellDC() {
        this.spellSaveDc = 8 + proficiencyBonus + abilities.getPrimaryModifier(characterClass.getPrimaryAbility());
    }

    public void calculateSpellAtkMod() {
        this.spellAttackMod = proficiencyBonus + abilities.getPrimaryModifier(characterClass.getPrimaryAbility());
    }

    public void finalCalculation() {
        calculateInitiative();
        calculateHitPoints();
        calculateArmorClass();
    }

    void calculateArmorClass() {
        if (getCharacterClass() instanceof Barbarian) {
            armorClass += abilities.getConModifier();
        } else if (getCharacterClass() instanceof Monk) {
            armorClass += abilities.getWisModifier();
        }
        armorClass += abilities.getDexModifier();
    }

    public List<Language> getLanguages() {
        return languageList;
    }

    public void addLanguage(Language languageList) {
        this.languageList.add(languageList);
    }

    public void addLanguage(List<Language> languageList) {
        this.languageList.addAll(languageList);
    }

    public void addValueToAbility(AbilityIdentifier abilityIdentifier, int value) {
        abilities.add(abilityIdentifier, value);
    }

    public Abilities getAbilities() {
        return abilities;
    }

    private Race randomRace(CharacterSheet characterSheet) {
        int number = ThreadLocalRandom.current().nextInt(9);
        return switch (number) {
            case 0 -> new Dwarf(characterSheet);
            case 1 -> new Elf(characterSheet);
            case 2 -> new Halfling(characterSheet);
            case 3 -> new Human(characterSheet);
            case 4 -> new Dragonborn(characterSheet);
            case 5 -> new Gnome(characterSheet);
            case 6 -> new HalfElf(characterSheet);
            case 7 -> new HalfOrc(characterSheet);
            case 8 -> new Tiefling(characterSheet);
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }

    public void setRandomRace() {
        this.race = randomRace(this);
    }

    public void setRandomClass() {
        this.characterClass = randomClass(this);
    }

    private GlobalClass randomClass(CharacterSheet characterSheet) {
        int number = ThreadLocalRandom.current().nextInt(12);
        return switch (number) {
            case 0 -> new Barbarian(characterSheet);
            case 1 -> new Bard(characterSheet);
            case 2 -> new Cleric(characterSheet);
            case 3 -> new Druid(characterSheet);
            case 4 -> new Fighter(characterSheet);
            case 5 -> new Monk(characterSheet);
            case 6 -> new Paladin(characterSheet);
            case 7 -> new Ranger(characterSheet);
            case 8 -> new Rogue(characterSheet);
            case 9 -> new Sorcerer(characterSheet);
            case 10 -> new Warlock(characterSheet);
            case 11 -> new Wizard(characterSheet);
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }
}
