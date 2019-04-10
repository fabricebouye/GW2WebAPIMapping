/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
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
public class WvwMatchesUtilsTest {

    public WvwMatchesUtilsTest() {
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
    public void testFindWvwMatchMapBonusType() {
        System.out.println("findWvwMatchMapBonusType");
        final String[] values = {
            "Bloodlust", // NOI18N.
            "Center", // NOI18N.
            null,
            "" // NOI18N.
        };
        final WvwMatchMapBonusType[] expResults = {
            WvwMatchMapBonusType.BLOODLUST,
            WvwMatchMapBonusType.CENTER,
            WvwMatchMapBonusType.UNKNOWN,
            WvwMatchMapBonusType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final WvwMatchMapBonusType expResult = expResults[index];
                    final WvwMatchMapBonusType result = EnumValueFactory.INSTANCE.mapEnumValue(WvwMatchMapBonusType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of MatchMapType.
     */
    @Test
    public void testFindWvwMatchMapType() {
        System.out.println("findWvwMatchMapType");
        final String[] values = {
            "BlueHome", // NOI18N.
            "Center", // NOI18N.
            "GreenHome", // NOI18N.
            "RedHome", // NOI18N.
            null,
            "" // NOI18N.
        };
        final WvwMatchMapType[] expResults = {
            WvwMatchMapType.BLUE_HOME,
            WvwMatchMapType.CENTER,
            WvwMatchMapType.GREEN_HOME,
            WvwMatchMapType.RED_HOME,
            WvwMatchMapType.UNKNOWN,
            WvwMatchMapType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final WvwMatchMapType expResult = expResults[index];
                    final WvwMatchMapType result = EnumValueFactory.INSTANCE.mapEnumValue(WvwMatchMapType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of MatchTeam.
     */
    @Test
    public void testFindWvwMatchTeam() {
        System.out.println("findWvwMatchTeam");
        final String[] values = {
            "Blue", // NOI18N.
            "Green", // NOI18N.
            "Neutral", // NOI18N.
            "Red", // NOI18N.
            null,
            "" // NOI18N.
        };
        final WvwMatchTeam[] expResults = {
            WvwMatchTeam.BLUE,
            WvwMatchTeam.GREEN,
            WvwMatchTeam.NEUTRAL,
            WvwMatchTeam.RED,
            WvwMatchTeam.UNKNOWN,
            WvwMatchTeam.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final WvwMatchTeam expResult = expResults[index];
                    final WvwMatchTeam result = EnumValueFactory.INSTANCE.mapEnumValue(WvwMatchTeam.class, value);
                    assertEquals(expResult, result);
                });
    }
}
