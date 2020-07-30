package com.feddevanderlist.generatedndcharacter;


import com.feddevanderlist.generatedndcharacter.classes.Barbarian;
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
    private final List<Skills> proficiencies;
    private GlobalClass _class;
    private Race race;
    private final List<Ability> savingThrowProficiencies;
    private int spellSaveDc;
    private int spellAttackMod;

    public CharacterSheet() {
        armorClass = 10;
        hitPoints = 0;
        hitDice = 0;
        initiative = 0;
        proficiencyBonus = 0;
        proficiencies = new ArrayList<>();
        _class = null;
        race = null;
        Ability.init();
        savingThrowProficiencies = new ArrayList<>();
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

    public List<Ability> getSavingThrowProficiencies() {
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
        List<Skills> allSkills = new ArrayList<>(Arrays.asList(Skills.values()));
        if (!proficiencies.isEmpty()) {
            allSkills.removeAll(proficiencies);
        }
        for (int i = 0; i < amount; i++) {
            int random = ThreadLocalRandom.current().nextInt(allSkills.size());
            Skills skill = allSkills.get(random);
            proficiencies.add(skill);
            allSkills.remove(skill);
        }
    }

    public void calculateInitiative() {
        this.initiative = Ability.getDexModifier();
    }

    public void calculateHitPoints() {
        this.hitPoints = this.hitDice + Ability.getConModifier();
    }

    public void calculateSpellDC() {
        this.spellSaveDc = 8 + proficiencyBonus + Ability.getPrimaryModifier(_class.getPrimaryAbility());
    }

    public void calculateSpellAtkMod() {
        this.spellAttackMod = proficiencyBonus + Ability.getPrimaryModifier(_class.getPrimaryAbility());
    }

    public void finalCalculation() {
        calculateInitiative();
        calculateHitPoints();
        calculateArmorClass();
    }

    void calculateArmorClass() {
        if (get_class() instanceof Barbarian) {
            armorClass += Ability.getConModifier();
        }
        armorClass += Ability.getDexModifier();
    }
}
