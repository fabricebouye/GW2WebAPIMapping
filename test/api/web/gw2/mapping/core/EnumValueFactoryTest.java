/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.core;

import api.web.gw2.mapping.v2.characters.CharacterGender;

import java.util.stream.IntStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test.
 *
 * @author Fabrice Bouyé
 */
public class EnumValueFactoryTest {

    public EnumValueFactoryTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findEnumValue method, of class EnumValueFactory.
     */
    @Test
    public void testMapEnumValue_CharacterGender() throws Exception {
        System.out.println("mapEnumValue_CharacterGender");
        EnumValueFactory instance = EnumValueFactory.INSTANCE;
        final String[] values = {
                "Female", // NOI18N.
                "Male", // NOI18N.
                "", // NOI18N.
                null
        };
        final CharacterGender[] expResults = {
                CharacterGender.FEMALE,
                CharacterGender.MALE,
                CharacterGender.UNKNOWN,
                CharacterGender.UNKNOWN

        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).forEach(index -> {
            final String value = values[index];
            final CharacterGender expResult = expResults[index];
            final CharacterGender result = instance.mapEnumValue(CharacterGender.class, value);
            assertEquals(expResult, result);
        });
    }

}
