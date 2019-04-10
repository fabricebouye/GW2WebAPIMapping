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
public class PvpHeroesUtilsTest {

    public PvpHeroesUtilsTest() {
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
