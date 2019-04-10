/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
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
public class DungeonUtilsTest {

    public DungeonUtilsTest() {
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
    public void testFindDungeonPathType() {
        System.out.println("findPathType");
        final String[] values = {
            "Explorable", // NOI18N.
            "Story", // NOI18N.
            null,
            "" // NOI18N.
        };
        final DungeonPathType[] expResults = {
            DungeonPathType.EXPLORABLE,
            DungeonPathType.STORY,
            DungeonPathType.UNKNOWN,
            DungeonPathType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final DungeonPathType expResult = expResults[index];
                    final DungeonPathType result = EnumValueFactory.INSTANCE.mapEnumValue(DungeonPathType.class, value);
                    assertEquals(expResult, result);
                });
    }

}
