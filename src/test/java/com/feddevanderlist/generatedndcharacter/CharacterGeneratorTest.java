package com.feddevanderlist.generatedndcharacter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class CharacterGeneratorTest {

    @Test
    void main() throws IOException {
        CharacterGenerator.main(new String[]{});
        Path basePath = Path.of("src\\main\\resources\\test.jpg");

        Assertions.assertTrue(Files.exists(basePath));

        Files.delete(basePath);
        Assertions.assertFalse(Files.exists(basePath));

    }
}