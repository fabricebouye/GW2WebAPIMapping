/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.games;

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
public class GameUtilsTest {

    public GameUtilsTest() {
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
     * Test of findGameTeam method, of class GameUtils.
     */
    @Test
    public void testFindGameTeam() {
        System.out.println("findGameTeam");
        final String[] values = {
            "Red", // NOI18N.
            "Blue", // NOI18N.
            "red", // NOI18N.
            "blue", // NOI18N.
            null,
            "" // NOI18N.
        };
        final GameTeam[] expResults = {
            GameTeam.RED,
            GameTeam.BLUE,
            GameTeam.RED,
            GameTeam.BLUE,
            GameTeam.UNKNOWN,
            GameTeam.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GameTeam expResult = expResults[index];
                    final GameTeam result = GameUtils.findGameTeam(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findGameResult method, of class GameUtils.
     */
    @Test
    public void testFindGameResult() {
        System.out.println("findGameResult");
        final String[] values = {
            "Defeat", // NOI18N.
            "Victory", // NOI18N.
            null,
            "" // NOI18N.
        };
        final GameResult[] expResults = {
            GameResult.DEFEAT,
            GameResult.VICTORY,
            GameResult.UNKNOWN,
            GameResult.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GameResult expResult = expResults[index];
                    final GameResult result = GameUtils.findGameResult(value);
                    assertEquals(expResult, result);
                });
    }
}
