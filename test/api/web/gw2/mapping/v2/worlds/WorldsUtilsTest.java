/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.worlds;

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
public class WorldsUtilsTest {

    public WorldsUtilsTest() {
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
     * Test of WorldPopulation.
     */
    @Test
    public void testFindWorldPopulation() {
        System.out.println("findWorldPopulation");
        final String[] values = {
            "Low", // NOI18N.
            "Medium", // NOI18N.
            "High", // NOI18N.
            "VeryHigh", // NOI18N.
            "Full", // NOI18N.
            null,
            "" // NOI18N.
        };
        final WorldPopulation[] expResults = {
            WorldPopulation.LOW,
            WorldPopulation.MEDIUM,
            WorldPopulation.HIGH,
            WorldPopulation.VERY_HIGH,
            WorldPopulation.FULL,
            WorldPopulation.UNKNOWN,
            WorldPopulation.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final WorldPopulation expResult = expResults[index];
                    final WorldPopulation result = EnumValueFactory.INSTANCE.mapEnumValue(WorldPopulation.class, value);
                    assertEquals(expResult, result);
                });
    }
}
