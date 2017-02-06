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
public class ObjectivesUtilsTest {

    public ObjectivesUtilsTest() {
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
    public void testFindObjectiveType() {
        System.out.println("findObjectiveType");
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
        final ObjectiveType[] expResults = {
            ObjectiveType.CAMP,
            ObjectiveType.GENERIC,
            ObjectiveType.KEEP,
            ObjectiveType.RESOURCE,
            ObjectiveType.RUINS,
            ObjectiveType.TOWER,
            ObjectiveType.CASTLE,
            ObjectiveType.MERCENARY,
            ObjectiveType.SPAWN,
            ObjectiveType.UNKNOWN,
            ObjectiveType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final ObjectiveType expResult = expResults[index];
                    final ObjectiveType result = EnumValueFactory.INSTANCE.mapEnumValue(ObjectiveType.class, value);
                    assertEquals(expResult, result);
                });
    }

}
