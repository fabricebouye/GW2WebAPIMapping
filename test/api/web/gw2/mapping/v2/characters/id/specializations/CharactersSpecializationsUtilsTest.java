/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.specializations;

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
public class CharactersSpecializationsUtilsTest {

    public CharactersSpecializationsUtilsTest() {
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
     * Test of CharacterSpecializationGameType.
     */
    @Test
    public void testFindCharacterSpecializationGameType() {
        System.out.println("findCharacterSpecializationGameType"); // NOI18N.
        final String[] values = {
            "pve", // NOI18N.
            "pvp", // NOI18N.
            "wvw", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CharacterSpecializationGameType[] expResults = {
            CharacterSpecializationGameType.PVE,
            CharacterSpecializationGameType.PVP,
            CharacterSpecializationGameType.WVW,
            CharacterSpecializationGameType.UNKNOWN,
            CharacterSpecializationGameType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CharacterSpecializationGameType expResult = expResults[index];
                    final CharacterSpecializationGameType result = EnumValueFactory.INSTANCE.mapEnumValue(CharacterSpecializationGameType.class, value);
                    assertEquals(expResult, result);
                });
    }
}
