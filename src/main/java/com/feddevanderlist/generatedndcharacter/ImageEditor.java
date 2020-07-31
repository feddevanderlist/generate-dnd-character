package com.feddevanderlist.generatedndcharacter;

import com.feddevanderlist.generatedndcharacter.models.Ability;
import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.Skills;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ImageEditor {

    private final Graphics graphics;
    private final BufferedImage image;
    private final Path basePath = Path.of("src\\main\\Resources\\");

    public ImageEditor() throws IOException {
        image = ImageIO.read(new File(basePath + "\\Alt-pg-front.jpg"));
        graphics = image.getGraphics();
        graphics.setColor(Color.BLACK);
    }

    public void addClassAndLevelToSheet(String classname) {
        graphics.setFont(graphics.getFont().deriveFont(18f));
        graphics.drawString(classname, 698, 162);
        graphics.drawString("1", 780, 162);
    }

    public void addRace(String race) {
        graphics.drawString(race, 698, 230);
    }

    public void addAlignment(Alignment alignment) {
        graphics.drawString(alignment.fullName, 993, 230);
    }

    public void addProficiencyBonus(int proficiency) {
        addValueBonusToPicture(proficiency, 145, 354);
    }

    public void addInspiration(int inspiration) {
        addValueBonusToPicture(inspiration, 145, 430);
    }

    public void addPassivePerception(int perception) {
        graphics.setFont(graphics.getFont().deriveFont(30f));
        addValueToPicture(perception, 145, 1561);
        graphics.setFont(graphics.getFont().deriveFont(18f));
    }

    public void addSpeed(int speed) {
        addValueToPicture(speed, 1385, 385);
    }

    public void addInitiative(int dex, boolean bonus) {
        if (bonus) dex += 5;
        addValueBonusToPicture(dex, 1215, 385);
    }

    public void addArmorClass(int dex, int ac) {
        addValueToPicture(dex, 765, 385);
        addValueToPicture(ac, 615, 385);
    }

    public void addHitPoints(int hp) {
        addValueToPicture(hp, 765, 555);
    }

    public void addSpellSaveDC(int spellSaveDC) {
        addValueToPicture(spellSaveDC, 770, 888);
    }

    public void addAttackMod(int spellAtkMod) {
        addValueToPicture(spellAtkMod, 930, 888);
    }

    public void addAbilityScores() {
        graphics.setFont(graphics.getFont().deriveFont(30f));
        addValueBonusToPicture(Ability.getStrModifier(), 145, 508);
        addValueToPicture(Ability.STRENGTH.value, 145, 570);

        addValueBonusToPicture(Ability.getDexModifier(), 145, 680);

        addValueToPicture(Ability.DEXTERITY.value, 145, 750);

        addValueBonusToPicture(Ability.getConModifier(), 145, 860);
        addValueToPicture(Ability.CONSTITUTION.value, 145, 930);

        addValueBonusToPicture(Ability.getIntModifier(), 145, 1040);
        addValueToPicture(Ability.INTELLIGENCE.value, 145, 1104);

        addValueBonusToPicture(Ability.getWisModifier(), 145, 1210);
        addValueToPicture(Ability.WISDOM.value, 145, 1283);

        addValueBonusToPicture(Ability.getChrModifier(), 145, 1388);
        addValueToPicture(Ability.CHARISMA.value, 145, 1460);
    }

    private void addValueBonusToPicture(int value, int x, int y) {
        if (value < 0) {
            graphics.drawString(String.valueOf(value), x, y);
        } else if (value == 0) {
            graphics.drawString(" ".concat(String.valueOf(value)), x, y);
        } else {
            graphics.drawString("+".concat(String.valueOf(value)), x, y);
        }
    }


    private void addValueToPicture(int value, int x, int y) {
        graphics.drawString(String.valueOf(value), x, y);
    }

    public void fillAllFields(CharacterSheet characterSheet) {
        addClassAndLevelToSheet(characterSheet.get_class().getName());
        addRace(characterSheet.getRace().getName());
        addAbilityScores();
        addHitPoints(characterSheet.getHitPoints());
        addArmorClass(Ability.getDexModifier(), characterSheet.getArmorClass());
        addProficiencyBonus(characterSheet.getProficiencyBonus());
        addAlignment(characterSheet.getRace().getAlignment());

        addSpeed(characterSheet.getRace().getSpeed());
        addInitiative(Ability.getDexModifier(), false);
        addSpellSaveDC(characterSheet.getSpellSaveDc());
        addAttackMod(characterSheet.getSpellAttackMod());
        addSavingThrowsAndSkills(characterSheet);

    }

    private void addSavingThrowsAndSkills(CharacterSheet characterSheet) {
        graphics.setFont(graphics.getFont().deriveFont(18f));
        for (Ability ability : Ability.values()) {
            int proficient = 0;
            if (characterSheet.getSavingThrowProficiencies().contains(ability)) {
                proficient = characterSheet.getProficiencyBonus();
            }
            switch (ability) {
                case WISDOM -> addWisSave(proficient);
                case CHARISMA -> addChrSave(proficient);
                case STRENGTH -> addStrSave(proficient);
                case DEXTERITY -> addDexSave(proficient);
                case INTELLIGENCE -> addIntSave(proficient);
                case CONSTITUTION -> addConSave(proficient);
            }
        }
        int x = 300;
        for (Skills skill : Skills.values()) {
            int bonus = 0;

            int y = 0;
            if (characterSheet.getProficiencies().contains(skill)) {
                bonus += 2;
            }
            switch (skill) {
                case acrobatics -> {
                    bonus += Ability.getDexModifier();
                    y = 698;
                }
                case animalHandling -> {
                    bonus += Ability.getWisModifier();
                    y = 1227;
                }
                case arcana -> {
                    bonus += Ability.getIntModifier();
                    y = 1049;
                }
                case athletics -> {
                    bonus += Ability.getStrModifier();
                    y = 521;
                }
                case deception -> {
                    bonus += Ability.getChrModifier();
                    y = 1403;
                }
                case history -> {
                    bonus += Ability.getIntModifier();
                    y = 1074;
                }
                case insight -> {
                    bonus += Ability.getWisModifier();
                    y = 1252;
                }
                case intimidation -> {
                    bonus += Ability.getChrModifier();
                    y = 1428;
                }
                case investigation -> {
                    bonus += Ability.getIntModifier();
                    y = 1100;
                }
                case medicine -> {
                    bonus += Ability.getWisModifier();
                    y = 1277;
                }
                case nature -> {
                    bonus += Ability.getIntModifier();
                    y = 1123;
                }
                case perception -> {
                    addPassivePerception(Ability.WISDOM.value + bonus); //Set passive perception
                    bonus += Ability.getWisModifier();
                    y = 1301;
                }
                case performance -> {
                    bonus += Ability.getChrModifier();
                    y = 1453;
                }
                case persuasion -> {
                    bonus += Ability.getChrModifier();
                    y = 1478;
                }
                case religion -> {
                    bonus += Ability.getIntModifier();
                    y = 1149;
                }
                case sleightOfHand -> {
                    bonus += Ability.getDexModifier();
                    y = 721;
                }
                case stealth -> {
                    bonus += Ability.getDexModifier();
                    y = 742;
                }
                case survival -> {
                    bonus += Ability.getWisModifier();
                    y = 1326;
                }
            }
            addValueBonusToPicture(bonus, x, y);
        }

    }

    public void addWisSave(int proficiency) {
        addValueBonusToPicture(Ability.getWisModifier() + proficiency, 300, 1203);
    }

    public void addChrSave(int proficiency) {
        addValueBonusToPicture(Ability.getChrModifier() + proficiency, 300, 1379);
    }

    public void addStrSave(int proficiency) {
        addValueBonusToPicture(Ability.getStrModifier() + proficiency, 300, 497);
    }

    public void addDexSave(int proficiency) {
        addValueBonusToPicture(Ability.getDexModifier() + proficiency, 300, 673);
    }

    public void addIntSave(int proficiency) {
        addValueBonusToPicture(Ability.getIntModifier() + proficiency, 300, 1025);
    }

    public void addConSave(int proficiency) {
        addValueBonusToPicture(Ability.getConModifier() + proficiency, 300, 850);
    }

    public void writeImage() throws IOException {
        graphics.dispose();
        ImageIO.write(image, "jpg", new File(basePath + "\\test.jpg"));
    }

}
