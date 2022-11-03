package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.models.Alignment;
import com.feddevanderlist.generatedndcharacter.models.Bound;
import com.feddevanderlist.generatedndcharacter.models.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Race {
    private final String[] g = {"Male", "Female"};

    protected String name;
    protected int age;
    protected Alignment alignment;
    protected Size size;
    protected double height;
    protected double weight;
    protected int speed;
    protected List<String> traits = new ArrayList<>();
    protected String subrace = null;
    protected final String gender = g[ThreadLocalRandom.current().nextInt(2)];

    protected Race(String name, Bound age, Size size, Bound height, Bound weight, int speed, List<String> traits) {
        this.name = name;
        this.age = ThreadLocalRandom.current().nextInt((int) age.getOrigin(), (int) age.getBound());
        this.size = size;
        this.alignment = Alignment.getRandomAlignment();
        this.height = ThreadLocalRandom.current().nextDouble(height.getOrigin(), height.getBound());
        this.weight = ThreadLocalRandom.current().nextDouble(weight.getOrigin(), weight.getBound());
        this.speed = speed;
        this.traits.addAll(traits);
    }

    protected Race(String name, int age, Size size, Bound height, Bound weight, int speed, List<String> traits) {
        this.name = name;
        this.age = ThreadLocalRandom.current().nextInt(age);
        this.size = size;
        this.alignment = Alignment.getRandomAlignment();
        this.height = ThreadLocalRandom.current().nextDouble(height.getOrigin(), height.getBound());
        this.weight = ThreadLocalRandom.current().nextDouble(weight.getOrigin(), weight.getBound());
        this.speed = speed;
        this.traits.addAll(traits);
    }

    protected Race(String name, Bound age, Size size, Bound height, Bound weight, int speed) {
        this.name = name;
        this.age = ThreadLocalRandom.current().nextInt((int) age.getOrigin(), (int) age.getBound());
        this.size = size;
        this.alignment = Alignment.getRandomAlignment();
        this.height = ThreadLocalRandom.current().nextDouble(height.getOrigin(), height.getBound());
        this.weight = ThreadLocalRandom.current().nextDouble(weight.getOrigin(), weight.getBound());
        this.speed = speed;
    }

    protected Race(String name, int age, Size size, Bound height, Bound weight, int speed) {
        this.name = name;
        this.age = ThreadLocalRandom.current().nextInt(age);
        this.size = size;
        this.alignment = Alignment.getRandomAlignment();
        this.height = ThreadLocalRandom.current().nextDouble(height.getOrigin(), height.getBound());
        this.weight = ThreadLocalRandom.current().nextDouble(weight.getOrigin(), weight.getBound());
        this.speed = speed;
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

}
