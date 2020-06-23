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

    public void addAbilityScores(AbilityScore abilityScore) {
        graphics.setFont(graphics.getFont().deriveFont(30f));
        addValueBonusToPicture(abilityScore.getStrModifier(), 145, 508);
        addValueToPicture(abilityScore.getStrength(), 145, 570);

        addValueBonusToPicture(abilityScore.getDexModifier(), 145, 680);

        addValueToPicture(abilityScore.getDexterity(), 145, 750);

        addValueBonusToPicture(abilityScore.getConModifier(), 145, 860);
        addValueToPicture(abilityScore.getConstitution(), 145, 930);

        addValueBonusToPicture(abilityScore.getIntModifier(), 145, 1040);
        addValueToPicture(abilityScore.getIntelligence(), 145, 1104);

        addValueBonusToPicture(abilityScore.getWisModifier(), 145, 1210);
        addValueToPicture(abilityScore.getWisdom(), 145, 1283);

        addValueBonusToPicture(abilityScore.getChrModifier(), 145, 1388);
        addValueToPicture(abilityScore.getCharisma(), 145, 1460);
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
        addAbilityScores(characterSheet.getAbilityScore());
        addHitPoints(characterSheet.getHitPoints());
        addArmorClass(characterSheet.getAbilityScore().getDexModifier(),characterSheet.getArmorClass());
        addProficiencyBonus(characterSheet.getProficiencyBonus());
        addAlingment(characterSheet.getRace().getAlignment());
        addPassivePerception(characterSheet.getAbilityScore().getWisModifier());
        addSpeed(characterSheet.getRace().getSpeed());
        addInitiative(characterSheet.getAbilityScore().getDexModifier(),false);



    }

    public void WriteImage() throws IOException {
        graphics.dispose();
        ImageIO.write(image, "jpg", new File("C:\\Users\\hijacked\\IdeaProjects\\generatedndcharacter\\src\\main\\java\\Resources\\test.jpg"));
    }

}
