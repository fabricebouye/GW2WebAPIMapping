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
     * Test of SeasonDivisionFlag.
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

    /**
     * Test of SeasonLadderType.
     */
    @Test
    public void testSeasonLadderType() {
        System.out.println("findSeasonLadderType");
        final String[] values = {
            "legendary", // NOI18N.
            "guild", // NOI18N.
            "ladder", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SeasonLadderType[] expResults = {
            SeasonLadderType.LEGENDARY,
            SeasonLadderType.GUILD,
            SeasonLadderType.LADDER,
            SeasonLadderType.UNKNOWN,
            SeasonLadderType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SeasonLadderType expResult = expResults[index];
                    final SeasonLadderType result = EnumValueFactory.INSTANCE.mapEnumValue(SeasonLadderType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of SeasonLadderScoringType.
     */
    @Test
    public void testSeasonLadderScoringType() {
        System.out.println("findSeasonLadderScoringType");
        final String[] values = {
            "Integer", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SeasonLadderScoringType[] expResults = {
            SeasonLadderScoringType.INTEGER,
            SeasonLadderScoringType.UNKNOWN,
            SeasonLadderScoringType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SeasonLadderScoringType expResult = expResults[index];
                    final SeasonLadderScoringType result = EnumValueFactory.INSTANCE.mapEnumValue(SeasonLadderScoringType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of SeasonLadderScoringOrdering.
     */
    @Test
    public void testSeasonLadderScoringOrdering() {
        System.out.println("findSeasonLadderScoringOrdering");
        final String[] values = {
            "LessIsBetter", // NOI18N.
            "MoreIsBetter", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SeasonLadderScoringOrdering[] expResults = {
            SeasonLadderScoringOrdering.LESS_IS_BETTER,
            SeasonLadderScoringOrdering.MORE_IS_BETTER,
            SeasonLadderScoringOrdering.UNKNOWN,
            SeasonLadderScoringOrdering.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SeasonLadderScoringOrdering expResult = expResults[index];
                    final SeasonLadderScoringOrdering result = EnumValueFactory.INSTANCE.mapEnumValue(SeasonLadderScoringOrdering.class, value);
                    assertEquals(expResult, result);
                });
    }
}
