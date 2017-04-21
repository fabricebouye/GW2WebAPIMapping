/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.objectives;

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
public class WvwObjectivesUtilsTest {

    public WvwObjectivesUtilsTest() {
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
     * Test of ObjectiveType.
     */
    @Test
    public void testFindWvwObjectiveType() {
        System.out.println("findWvwObjectiveType");
        final String[] values = {
            "Camp", // NOI18N.
            "Generic", // NOI18N.
            "Keep", // NOI18N.
            "Resource", // NOI18N.
            "Ruins", // NOI18N.
            "Tower", // NOI18N.
            "Castle", // NOI18N.
            "Mercenary", // NOI18N.
            "Spawn", // NOI18N.
            null,
            "" // NOI18N.
        };
        final WvwObjectiveType[] expResults = {
            WvwObjectiveType.CAMP,
            WvwObjectiveType.GENERIC,
            WvwObjectiveType.KEEP,
            WvwObjectiveType.RESOURCE,
            WvwObjectiveType.RUINS,
            WvwObjectiveType.TOWER,
            WvwObjectiveType.CASTLE,
            WvwObjectiveType.MERCENARY,
            WvwObjectiveType.SPAWN,
            WvwObjectiveType.UNKNOWN,
            WvwObjectiveType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final WvwObjectiveType expResult = expResults[index];
                    final WvwObjectiveType result = EnumValueFactory.INSTANCE.mapEnumValue(WvwObjectiveType.class, value);
                    assertEquals(expResult, result);
                });
    }

}
