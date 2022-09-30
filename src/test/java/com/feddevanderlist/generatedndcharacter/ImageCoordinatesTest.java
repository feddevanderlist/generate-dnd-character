package com.feddevanderlist.generatedndcharacter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImageCoordinatesTest {

    @Test
    void getFirstFeatureLine() {
        int coordinate = ImageCoordinates.getFirstFeatureLine();
        while (coordinate > 0) {
            Assertions.assertNotEquals(0, coordinate);
            coordinate = ImageCoordinates.getFirstFeatureLine();
        }
    }
}