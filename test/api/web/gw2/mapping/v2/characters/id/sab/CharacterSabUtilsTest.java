/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.sab;

import api.web.gw2.mapping.core.EnumValueFactory;
import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test.
 * @author Fabrice Bouyé
 */
public class CharacterSabUtilsTest {

    public CharacterSabUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of SabMode.
     */
    @Test
    public void testFindCharacterSabMode() {
        System.out.println("findCharacterSabMode");
        final String[] values = {
            "infantile", // NOI18N.
            "normal", // NOI18N.
            "tribulation", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CharacterSabMode[] expResults = {
            CharacterSabMode.INFANTILE,
            CharacterSabMode.NORMAL,
            CharacterSabMode.TRIBULATION,
            CharacterSabMode.UNKNOWN,
            CharacterSabMode.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterSabMode expResult = expResults[index];
                    final CharacterSabMode result = EnumValueFactory.INSTANCE.mapEnumValue(CharacterSabMode.class, value);
                    assertEquals(expResult, result);
                });
    }
}
