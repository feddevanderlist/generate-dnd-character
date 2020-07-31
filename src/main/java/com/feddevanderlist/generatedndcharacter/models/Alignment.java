package com.feddevanderlist.generatedndcharacter.models;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public enum Alignment {
    LG("Lawful good"),
    NG("Neutral good"),
    CG("Chaotic good"),
    LN("Lawful neutral"),
    N("Neutral"),
    CN("Chaotic neutral"),
    LE("Lawful evil"),
    NE("Neutral evil"),
    CE("Chaotic evil");
    public final String fullName;

    Alignment(String fullName) {
        this.fullName = fullName;
    }

    public static Alignment getRandomAlignment() {
        List<Alignment> alignmentList = Arrays.asList(values());
        return alignmentList.get(ThreadLocalRandom.current().nextInt(alignmentList.size()));
    }
}
