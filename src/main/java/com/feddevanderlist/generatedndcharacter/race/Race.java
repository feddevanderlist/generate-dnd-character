package com.feddevanderlist.generatedndcharacter.race;


import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Race {
    private String[] g = {"Male", "Female"};
    int age;
    String alignment;
    String size;
    double height;
    int weight;
    int speed;
    List<String> languages;
    List<String> traits;
    String subrace = null;
    String gender = g[ThreadLocalRandom.current().nextInt(2)];
}
