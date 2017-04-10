/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.dungeons;

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
public class DugeonUtilsTest {

    public DugeonUtilsTest() {
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
     * Test of ExchangeResource.
     */
    @Test
    public void testFindDungeon() {
        System.out.println("findDungeon");
        final String[] values = {
            "ascalonian_catacombs", // NOI18N.
            "caudecus_manor", // NOI18N.
            "citadel_of_flame", // NOI18N.
            "crucible_of_eternity", // NOI18N.
            "honor_of_the_waves", // NOI18N.
            "ruined_city_of_arah", // NOI18N.
            "sorrows_embrace", // NOI18N.
            "twilight_arbor", // NOI18N.
            null,
            "" // NOI18N.
        };
        final Dungeon[] expResults = {
            Dungeon.ASCALONIAN_CATACOMBS,
            Dungeon.CAUDECUS_MANOR,
            Dungeon.CITADEL_OF_FLAME,
            Dungeon.CRUCIBLE_OF_ETERNITY,
            Dungeon.HONOR_OF_THE_WAVES,
            Dungeon.RUINED_CITY_OF_ARAH,
            Dungeon.SORROWS_EMBRACE,
            Dungeon.TWILIGHT_ARBOR,            
            Dungeon.UNKNOWN,
            Dungeon.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final Dungeon expResult = expResults[index];
                    final Dungeon result = EnumValueFactory.INSTANCE.mapEnumValue(Dungeon.class, value);
                    assertEquals(expResult, result);
                });
    }

}
