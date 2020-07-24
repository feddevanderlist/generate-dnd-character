package com.feddevanderlist.generatedndcharacter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageEditor {

    private Graphics graphics;
    final private BufferedImage image;

    public ImageEditor() throws IOException {
        image = ImageIO.read(new File("C:\\Users\\hijacked\\IdeaProjects\\generatedndcharacter\\src\\main\\java\\Resources\\Alt-pg-front.jpg"));
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

    public void addAlingment(String alingment) {
        graphics.drawString(alingment, 993, 230);
    }

    public void addProficiencyBonus(int profiency) {
        addValueBonusToPicture(profiency, 145, 354);
    }

    public void addInspiration(int inspiration) {
        addValueBonusToPicture(inspiration, 145, 430);
    }

    public void addPassivePerception(int inspiration) {
        addValueBonusToPicture(inspiration, 145, 430);
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
        if (value <= 0) {
            graphics.drawString(String.valueOf(value), x, y);
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
        addAlingment(characterSheet.getRace().getAlignment());
        addPassivePerception(Ability.getWisModifier());
        addSpeed(characterSheet.getRace().getSpeed());
        addInitiative(Ability.getDexModifier(), false);
        addSpellSaveDC(characterSheet.getSpellSaveDc());
        addAttackMod(characterSheet.getSpellAttackMod());

    }

    public void WriteImage() throws IOException {
        graphics.dispose();
        ImageIO.write(image, "jpg", new File("C:\\Users\\hijacked\\IdeaProjects\\generatedndcharacter\\src\\main\\java\\Resources\\test.jpg"));
    }

}
