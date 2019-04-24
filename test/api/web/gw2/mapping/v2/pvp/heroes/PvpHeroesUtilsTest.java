/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.heroes;

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
public class PvpHeroesUtilsTest {

    public PvpHeroesUtilsTest() {
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
     * Test of PvpHeroStat.
     */
    @Test
    public void testFindPvpHeroStat() {
        System.out.println("findPvpHeroStat");
        final String[] values = {
                "defense", // NOI18N.
                "offense", // NOI18N.
                "speed", // NOI18N.
                null,
                "" // NOI18N.
        };
        final PvpHeroStat[] expResults = {
                PvpHeroStat.DEFENSE,
                PvpHeroStat.OFFENSE,
                PvpHeroStat.SPEED,
                PvpHeroStat.UNKNOWN,
                PvpHeroStat.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvpHeroStat expResult = expResults[index];
                    final PvpHeroStat result = EnumValueFactory.INSTANCE.mapEnumValue(PvpHeroStat.class, value);
                    assertEquals(expResult, result);
                });
    }
}
