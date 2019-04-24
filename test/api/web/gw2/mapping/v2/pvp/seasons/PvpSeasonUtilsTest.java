/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.EnumValueFactory;

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
public final class PvpSeasonUtilsTest {

    public PvpSeasonUtilsTest() {
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
     * Test of PvpSeasonDivisionFlag.
     */
    @Test
    public void testFindPvpSeasonDivisionFlag() {
        System.out.println("findPvpSeasonDivisionFlag");
        final String[] values = {
                "CanLosePoints", // NOI18N.
                "CanLoseTiers", // NOI18N.
                "Repeatable", // NOI18N.
                null,
                "" // NOI18N.
        };
        final PvpSeasonDivisionFlag[] expResults = {
                PvpSeasonDivisionFlag.CAN_LOSE_POINTS,
                PvpSeasonDivisionFlag.CAN_LOSE_TIERS,
                PvpSeasonDivisionFlag.REPEATABLE,
                PvpSeasonDivisionFlag.UNKNOWN,
                PvpSeasonDivisionFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvpSeasonDivisionFlag expResult = expResults[index];
                    final PvpSeasonDivisionFlag result = EnumValueFactory.INSTANCE.mapEnumValue(PvpSeasonDivisionFlag.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of PvpSeasonLadderType.
     */
    @Test
    public void testFindPvpSeasonLadderType() {
        System.out.println("findPvpSeasonLadderType");
        final String[] values = {
                "legendary", // NOI18N.
                "guild", // NOI18N.
                "ladder", // NOI18N.
                null,
                "" // NOI18N.
        };
        final PvpSeasonLadderType[] expResults = {
                PvpSeasonLadderType.LEGENDARY,
                PvpSeasonLadderType.GUILD,
                PvpSeasonLadderType.LADDER,
                PvpSeasonLadderType.UNKNOWN,
                PvpSeasonLadderType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvpSeasonLadderType expResult = expResults[index];
                    final PvpSeasonLadderType result = EnumValueFactory.INSTANCE.mapEnumValue(PvpSeasonLadderType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of PvpSeasonLadderScoringType.
     */
    @Test
    public void testFindPvpSeasonLadderScoringType() {
        System.out.println("findPvpSeasonLadderScoringType");
        final String[] values = {
                "Integer", // NOI18N.
                null,
                "" // NOI18N.
        };
        final PvpSeasonLadderScoringType[] expResults = {
                PvpSeasonLadderScoringType.INTEGER,
                PvpSeasonLadderScoringType.UNKNOWN,
                PvpSeasonLadderScoringType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvpSeasonLadderScoringType expResult = expResults[index];
                    final PvpSeasonLadderScoringType result = EnumValueFactory.INSTANCE.mapEnumValue(PvpSeasonLadderScoringType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of PvpSeasonLadderScoringOrdering.
     */
    @Test
    public void testFindSeasonLadderScoringOrdering() {
        System.out.println("findPvpSeasonLadderScoringOrdering");
        final String[] values = {
                "LessIsBetter", // NOI18N.
                "MoreIsBetter", // NOI18N.
                null,
                "" // NOI18N.
        };
        final PvpSeasonLadderScoringOrdering[] expResults = {
                PvpSeasonLadderScoringOrdering.LESS_IS_BETTER,
                PvpSeasonLadderScoringOrdering.MORE_IS_BETTER,
                PvpSeasonLadderScoringOrdering.UNKNOWN,
                PvpSeasonLadderScoringOrdering.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvpSeasonLadderScoringOrdering expResult = expResults[index];
                    final PvpSeasonLadderScoringOrdering result = EnumValueFactory.INSTANCE.mapEnumValue(PvpSeasonLadderScoringOrdering.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of PvpSeasonLadderSettingsTierType.
     */
    @Test
    public void testFindPvpSeasonLadderSettingsTierType() {
        System.out.println("findPvpSeasonLadderSettingsTierType");
        final String[] values = {
                "Rank", // NOI18N.
                null,
                "" // NOI18N.
        };
        final PvpSeasonLadderSettingsTierType[] expResults = {
                PvpSeasonLadderSettingsTierType.RANK,
                PvpSeasonLadderSettingsTierType.UNKNOWN,
                PvpSeasonLadderSettingsTierType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvpSeasonLadderSettingsTierType expResult = expResults[index];
                    final PvpSeasonLadderSettingsTierType result = EnumValueFactory.INSTANCE.mapEnumValue(PvpSeasonLadderSettingsTierType.class, value);
                    assertEquals(expResult, result);
                });
    }
}
