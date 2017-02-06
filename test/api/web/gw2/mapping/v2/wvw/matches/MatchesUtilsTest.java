/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.matches;

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
public class MatchesUtilsTest {

    public MatchesUtilsTest() {
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
     * Test of MatchMapBonusType.
     */
    @Test
    public void testFindMatchMapBonusType() {
        System.out.println("findMatchMapBonusType");
        final String[] values = {
            "Bloodlust", // NOI18N.
            "Center", // NOI18N.
            null,
            "" // NOI18N.
        };
        final MatchMapBonusType[] expResults = {
            MatchMapBonusType.BLOODLUST,
            MatchMapBonusType.CENTER,
            MatchMapBonusType.UNKNOWN,
            MatchMapBonusType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MatchMapBonusType expResult = expResults[index];
                    final MatchMapBonusType result = EnumValueFactory.INSTANCE.mapEnumValue(MatchMapBonusType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of MatchMapType.
     */
    @Test
    public void testFindMatchMapType() {
        System.out.println("findMatchMapType");
        final String[] values = {
            "BlueHome", // NOI18N.
            "Center", // NOI18N.
            "GreenHome", // NOI18N.
            "RedHome", // NOI18N.
            null,
            "" // NOI18N.
        };
        final MatchMapType[] expResults = {
            MatchMapType.BLUE_HOME,
            MatchMapType.CENTER,
            MatchMapType.GREEN_HOME,
            MatchMapType.RED_HOME,
            MatchMapType.UNKNOWN,
            MatchMapType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MatchMapType expResult = expResults[index];
                    final MatchMapType result = EnumValueFactory.INSTANCE.mapEnumValue(MatchMapType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of MatchTeam.
     */
    @Test
    public void testFindMatchTeam() {
        System.out.println("findMatchTeam");
        final String[] values = {
            "Blue", // NOI18N.
            "Green", // NOI18N.
            "Neutral", // NOI18N.
            "Red", // NOI18N.
            null,
            "" // NOI18N.
        };
        final MatchTeam[] expResults = {
            MatchTeam.BLUE,
            MatchTeam.GREEN,
            MatchTeam.NEUTRAL,
            MatchTeam.RED,
            MatchTeam.UNKNOWN,
            MatchTeam.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MatchTeam expResult = expResults[index];
                    final MatchTeam result = EnumValueFactory.INSTANCE.mapEnumValue(MatchTeam.class, value);
                    assertEquals(expResult, result);
                });
    }
}
