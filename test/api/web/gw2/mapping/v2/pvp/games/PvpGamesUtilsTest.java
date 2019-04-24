/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.games;

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
public class PvpGamesUtilsTest {

    public PvpGamesUtilsTest() {
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
     * Test of PvpGameTeam.
     */
    @Test
    public void testFindPvpGameTeam() {
        System.out.println("findPvpGameTeam");
        final String[] values = {
                "Red", // NOI18N.
                "Blue", // NOI18N.
                "red", // NOI18N.
                "blue", // NOI18N.
                null,
                "" // NOI18N.
        };
        final PvpGameTeam[] expResults = {
                PvpGameTeam.RED,
                PvpGameTeam.BLUE,
                PvpGameTeam.RED,
                PvpGameTeam.BLUE,
                PvpGameTeam.UNKNOWN,
                PvpGameTeam.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvpGameTeam expResult = expResults[index];
                    final PvpGameTeam result = EnumValueFactory.INSTANCE.mapEnumValue(PvpGameTeam.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of PvpGameResult.
     */
    @Test
    public void testFindPvpGameResult() {
        System.out.println("findPvpGameResult");
        final String[] values = {
                "Defeat", // NOI18N.
                "Victory", // NOI18N.
                null,
                "" // NOI18N.
        };
        final PvpGameResult[] expResults = {
                PvpGameResult.DEFEAT,
                PvpGameResult.VICTORY,
                PvpGameResult.UNKNOWN,
                PvpGameResult.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvpGameResult expResult = expResults[index];
                    final PvpGameResult result = EnumValueFactory.INSTANCE.mapEnumValue(PvpGameResult.class, value);
                    assertEquals(expResult, result);
                });
    }
}
