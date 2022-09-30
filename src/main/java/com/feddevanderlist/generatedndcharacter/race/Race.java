package com.feddevanderlist.generatedndcharacter.race;


import com.feddevanderlist.generatedndcharacter.models.Alignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Race {
    private final String[] g = {"Male", "Female"};

    String name;
    int age;
    Alignment alignment;
    String size;
    double height;
    int weight;
    int speed;
    List<String> traits = new ArrayList<>();
    String subrace = null;
    final String gender = g[ThreadLocalRandom.current().nextInt(2)];

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public String getSize() {
        return size;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
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
