package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.Bound;
import com.feddevanderlist.generatedndcharacter.models.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Race {
    private final String[] g = {"Male", "Female"};

    private final String name;
    private final int age;
    private final Alignment alignment;
    private final Size size;
    private final double height;
    private final double weight;
    private int speed;
    private final List<String> traits = new ArrayList<>();
    private String subrace = null;
    private final String gender = g[ThreadLocalRandom.current().nextInt(2)];

    protected Race(String name, Bound age, Size size, Bound height, Bound weight, int speed, List<String> traits) {
        this.name = name;
        this.age = ThreadLocalRandom.current().nextInt((int) age.origin(), (int) age.bound());
        this.size = size;
        this.alignment = Alignment.getRandomAlignment();
        this.height = ThreadLocalRandom.current().nextDouble(height.origin(), height.bound());
        this.weight = ThreadLocalRandom.current().nextDouble(weight.origin(), weight.bound());
        this.speed = speed;
        this.traits.addAll(traits);
    }

    protected Race(String name, int age, Size size, Bound height, Bound weight, int speed, List<String> traits) {
        this.name = name;
        this.age = ThreadLocalRandom.current().nextInt(age);
        this.size = size;
        this.alignment = Alignment.getRandomAlignment();
        this.height = ThreadLocalRandom.current().nextDouble(height.origin(), height.bound());
        this.weight = ThreadLocalRandom.current().nextDouble(weight.origin(), weight.bound());
        this.speed = speed;
        this.traits.addAll(traits);
    }

    protected Race(String name, Bound age, Size size, Bound height, Bound weight, int speed) {
        this.name = name;
        this.age = ThreadLocalRandom.current().nextInt((int) age.origin(), (int) age.bound());
        this.size = size;
        this.alignment = Alignment.getRandomAlignment();
        this.height = ThreadLocalRandom.current().nextDouble(height.origin(), height.bound());
        this.weight = ThreadLocalRandom.current().nextDouble(weight.origin(), weight.bound());
        this.speed = speed;
    }

    protected Race(Bound height, Bound weight) {
        this.name = "Human";
        this.age = ThreadLocalRandom.current().nextInt(95);
        this.size = Size.MEDIUM;
        this.alignment = Alignment.getRandomAlignment();
        this.height = ThreadLocalRandom.current().nextDouble(height.origin(), height.bound());
        this.weight = ThreadLocalRandom.current().nextDouble(weight.origin(), weight.bound());
        this.speed = 30;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public Size getSize() {
        return size;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public List<String> getTraits() {
        return traits;
    }

    public String getSubrace() {
        return subrace;
    }

    public String getGender() {
        return gender;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void addTraits(List<String> traits) {
        this.traits.addAll(traits);
    }

    public void addTrait(String trait) {
        this.traits.add(trait);
    }

    public void setSubrace(String subrace) {
        this.subrace = subrace;
    }

}
