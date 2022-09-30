package com.feddevanderlist.generatedndcharacter;

import com.feddevanderlist.generatedndcharacter.models.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ImageEditor {

    private final Graphics graphics;
    private final BufferedImage image;
    private final Path basePath = Path.of("src\\main\\resources\\");
    private static final String DELIMITER = ", \r\n";


    public ImageEditor() throws IOException {
        image = ImageIO.read(new File(basePath + "\\Alt-pg-front.jpg"));
        graphics = image.getGraphics();
        graphics.setColor(Color.BLACK);
    }

    public void fillAllFields(CharacterSheet characterSheet) {
        addClassAndLevelToSheet(characterSheet.get_class().getName());
        addRace(characterSheet.getRace().getName());
        addAbilityScores(characterSheet.getAbilities());
        addHitPoints(characterSheet.getHitPoints());
        addArmorClass(characterSheet.getAbilities().getDexModifier(), characterSheet.getArmorClass());
        addProficiencyBonus(characterSheet.getProficiencyBonus());
        addAlignment(characterSheet.getRace().getAlignment());

        addSpeed(characterSheet.getRace().getSpeed());
        addInitiative(Math.max(characterSheet.getAbilities().getDexModifier(), 0), false);
        addSpellSaveDC(characterSheet.getSpellSaveDc());
        addAttackMod(characterSheet.getSpellAttackMod());
        addSavingThrowsAndSkills(characterSheet);
        addWeaponProficiencies(characterSheet.get_class().getWeaponProficiencies());
        addArmorProficiencies(characterSheet.get_class().getArmorProficiencies());
        addLanguageProficiencies(characterSheet.getLanguages());
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

    public void addAbilityScores(Abilities abilities) {
        graphics.setFont(graphics.getFont().deriveFont(30f));
        addValueBonusToPicture(abilities.getStrModifier(), 145, 508);
        addValueToPicture(abilities.getStrength(), 145, 570);

        addValueBonusToPicture(abilities.getDexModifier(), 145, 680);

        addValueToPicture(abilities.getDexterity(), 145, 750);

        addValueBonusToPicture(abilities.getConModifier(), 145, 860);
        addValueToPicture(abilities.getConstitution(), 145, 930);

        addValueBonusToPicture(abilities.getIntModifier(), 145, 1040);
        addValueToPicture(abilities.getIntelligence(), 145, 1104);

        addValueBonusToPicture(abilities.getWisModifier(), 145, 1210);
        addValueToPicture(abilities.getWisdom(), 145, 1283);

        addValueBonusToPicture(abilities.getChrModifier(), 145, 1388);
        addValueToPicture(abilities.getCharisma(), 145, 1460);
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

    private void addWeaponProficiencies(List<WeaponType> weaponTypeList) {
        if (weaponTypeList.isEmpty()) return;

        graphics.drawString("Weapon Proficiency: ", 1055, ImageCoordinates.getFirstFeatureLine());
        StringBuilder sb = new StringBuilder();
        for (WeaponType wp : weaponTypeList
        ) {
            sb.append(wp.typeName).append(DELIMITER);
        }
        writeStringToFeatureCoordinates(sb);
    }

    private void addLanguageProficiencies(List<Language> languageList) {
        if (languageList.isEmpty()) return;
        graphics.drawString("Language Proficiency: ", 1055, ImageCoordinates.getFirstFeatureLine());
        StringBuilder sb = new StringBuilder();
        for (Language l : languageList
        ) {
            sb.append(l.languageName).append(DELIMITER);
        }
        writeStringToFeatureCoordinates(sb);
    }

    private void addArmorProficiencies(List<ArmorType> armorProficiencies) {
        if (armorProficiencies.isEmpty()) return;
        graphics.drawString("Armor Proficiency: ", 1055, ImageCoordinates.getFirstFeatureLine());
        StringBuilder sb = new StringBuilder();
        for (ArmorType at : armorProficiencies
        ) {
            sb.append(at.typeName).append(DELIMITER);
        }
        writeStringToFeatureCoordinates(sb);
    }


    private void writeStringToFeatureCoordinates(StringBuilder sb) {
        sb.deleteCharAt(sb.lastIndexOf(","));
        if (sb.length() > 50) {
            int split = sb.lastIndexOf(",", 50) + 2;
            graphics.drawString(sb.substring(0, split), 1055, ImageCoordinates.getFirstFeatureLine());
            graphics.drawString(sb.substring(split), 1055, ImageCoordinates.getFirstFeatureLine());
        } else {
            graphics.drawString(sb.toString(), 1055, ImageCoordinates.getFirstFeatureLine());
        }
    }

    private void addSavingThrowsAndSkills(CharacterSheet characterSheet) {
        graphics.setFont(graphics.getFont().deriveFont(18f));
        Abilities abilities = characterSheet.getAbilities();
        for (AbilityIdentifier ability : AbilityIdentifier.values()) {
            int proficient = 0;
            if (characterSheet.getSavingThrowProficiencies().contains(ability)) {
                proficient = characterSheet.getProficiencyBonus();
            }

            switch (ability) {
                case WISDOM -> addWisSave(abilities.getWisModifier() + proficient);
                case CHARISMA -> addChrSave(abilities.getChrModifier() + proficient);
                case STRENGTH -> addStrSave(abilities.getStrModifier() + proficient);
                case DEXTERITY -> addDexSave(abilities.getDexModifier() + proficient);
                case INTELLIGENCE -> addIntSave(abilities.getIntModifier() + proficient);
                case CONSTITUTION -> addConSave(abilities.getConModifier() + proficient);
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
                    bonus += abilities.getDexModifier();
                    y = 698;
                }
                case animalHandling -> {
                    bonus += abilities.getWisModifier();
                    y = 1227;
                }
                case arcana -> {
                    bonus += abilities.getIntModifier();
                    y = 1049;
                }
                case athletics -> {
                    bonus += abilities.getStrModifier();
                    y = 521;
                }
                case deception -> {
                    bonus += abilities.getChrModifier();
                    y = 1403;
                }
                case history -> {
                    bonus += abilities.getIntModifier();
                    y = 1074;
                }
                case insight -> {
                    bonus += abilities.getWisModifier();
                    y = 1252;
                }
                case intimidation -> {
                    bonus += abilities.getChrModifier();
                    y = 1428;
                }
                case investigation -> {
                    bonus += abilities.getIntModifier();
                    y = 1100;
                }
                case medicine -> {
                    bonus += abilities.getWisModifier();
                    y = 1277;
                }
                case nature -> {
                    bonus += abilities.getIntModifier();
                    y = 1123;
                }
                case perception -> {
                    addPassivePerception(abilities.getWisdom() + bonus); //Set passive perception
                    bonus += abilities.getWisModifier();
                    y = 1301;
                }
                case performance -> {
                    bonus += abilities.getChrModifier();
                    y = 1453;
                }
                case persuasion -> {
                    bonus += abilities.getChrModifier();
                    y = 1478;
                }
                case religion -> {
                    bonus += abilities.getIntModifier();
                    y = 1149;
                }
                case sleightOfHand -> {
                    bonus += abilities.getDexModifier();
                    y = 721;
                }
                case stealth -> {
                    bonus += abilities.getDexModifier();
                    y = 746;
                }
                case survival -> {
                    bonus += abilities.getWisModifier();
                    y = 1326;
                }
            }
            addValueBonusToPicture(bonus, x, y);
        }
    }

    public void addWisSave(int value) {
        addValueBonusToPicture(value, 300, 1203);
    }

    public void addChrSave(int value) {
        addValueBonusToPicture(value, 300, 1379);
    }

    public void addStrSave(int value) {
        addValueBonusToPicture(value, 300, 497);
    }

    public void addDexSave(int value) {
        addValueBonusToPicture(value, 300, 673);
    }

    public void addIntSave(int value) {
        addValueBonusToPicture(value, 300, 1025);
    }

    public void addConSave(int value) {
        addValueBonusToPicture(value, 300, 850);
    }

    public void writeImage() throws IOException {
        graphics.dispose();
        ImageIO.write(image, "jpg", new File(basePath + "\\test.jpg"));
    }
}
