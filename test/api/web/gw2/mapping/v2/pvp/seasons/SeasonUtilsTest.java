/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

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
public final class SeasonUtilsTest {

    public SeasonUtilsTest() {
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
     * Test of LogEventType.
     */
    @Test
    public void testSeasonDivisionFlag() {
        System.out.println("findSeasonDivisionFlag");
        final String[] values = {
            "CanLosePoints", // NOI18N.
            "CanLoseTiers", // NOI18N.
            "Repeatable", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SeasonDivisionFlag[] expResults = {
            SeasonDivisionFlag.CAN_LOSE_POINTS,
            SeasonDivisionFlag.CAN_LOSE_TIERS,
            SeasonDivisionFlag.REPEATABLE,
            SeasonDivisionFlag.UNKNOWN,
            SeasonDivisionFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SeasonDivisionFlag expResult = expResults[index];
                    final SeasonDivisionFlag result = EnumValueFactory.INSTANCE.mapEnumValue(SeasonDivisionFlag.class, value);
                    assertEquals(expResult, result);
                });
    }
}
