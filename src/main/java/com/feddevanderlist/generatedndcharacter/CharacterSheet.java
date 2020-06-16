package com.feddevanderlist.generatedndcharacter;


import com.feddevanderlist.generatedndcharacter.classes.GlobalClass;
import com.feddevanderlist.generatedndcharacter.race.Race;

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
    private List<Skills> proficiencies;
    private GlobalClass _class;
    private Race race;
    private AbilityScore abilityScore;
    private List<String> savingThrowProficiencies;

    public CharacterSheet() {
        armorClass = 10;
        hitPoints = 0;
        hitDice = 0;
        initiative = 0;
        proficiencyBonus = 0;
        proficiencies = new ArrayList<>();
        _class = null;
        race = null;
        abilityScore = new AbilityScore();
        savingThrowProficiencies = new ArrayList<>();
    }


    public int getArmorClass() {
        return armorClass;
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

    public GlobalClass get_class() {
        return _class;
    }

    public void set_class(GlobalClass _class) {
        this._class = _class;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public AbilityScore getAbilityScore() {
        return abilityScore;
    }

    public List<String> getSavingThrowProficiencies() {
        return savingThrowProficiencies;
    }

    public void addHitPoints(int hp) {
        hitPoints += hp;
    }

    public void addArmorClass(int ac) {
        armorClass += ac;
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

    public void calculateInitiative() {
        this.initiative = this.abilityScore.getDexModifier();
    }
}
