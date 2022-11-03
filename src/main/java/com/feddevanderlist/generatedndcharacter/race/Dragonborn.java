package com.feddevanderlist.generatedndcharacter.race;

import com.feddevanderlist.generatedndcharacter.models.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Dragonborn extends Race {

    public Dragonborn(CharacterSheet characterSheet) {
        super("Dragonborn", 80, Size.MEDIUM, new Bound(6, 8), new Bound(200, 300), 30, Arrays.asList("Breath Weapon", "Damage Resistance"));
        characterSheet.addLanguage(Arrays.asList(Language.CO, Language.DR));
        List<String> possibleDA = Arrays.asList("Black", "Blue ", "Brass ", "Bronze ", "Copper ", "Gold", "Green ", "Red", "Silver", "White");
        this.subrace = possibleDA.get(ThreadLocalRandom.current().nextInt(possibleDA.size()));
        characterSheet.addValueToAbility(AbilityIdentifier.STRENGTH, 2);
    }
}
