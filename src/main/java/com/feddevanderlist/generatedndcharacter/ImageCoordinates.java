package com.feddevanderlist.generatedndcharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImageCoordinates {
    private static final List<Integer> featureLines = new ArrayList<>(Arrays.asList(1015,
            1042,
            1069,
            1096,
            1123,
            1150,
            1177,
            1204,
            1231,
            1258,
            1285,
            1312,
            1339,
            1366,
            1393,
            1420,
            1447,
            1474,
            1501,
            1528,
            1555,
            1582,
            1609,
            1636,
            1663,
            1690,
            1717,
            1744,
            1771,
            1798,
            1825,
            1852,
            1879,
            1906,
            1933
    ));

    private ImageCoordinates(){}

    public static int getFirstFeatureLine() {
        int result = featureLines.get(0);
        featureLines.remove(0);
        return result;

    }
}
