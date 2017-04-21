/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw;

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
public class WvwUtilsTest {

    public WvwUtilsTest() {
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
     * Test of MapType.
     */
    @Test
    public void testWvwFindMapType() {
        System.out.println("findWvwMapType");
        final String[] values = {
            "Center", // NOI18N.
            "BlueHome", // NOI18N.
            "GreenHome", // NOI18N.
            "RedHome", // NOI18N.
            "EdgeOfTheMists", // NOI18N.
            null,
            "" // NOI18N.
        };
        final WvwMapType[] expResults = {
            WvwMapType.CENTER,
            WvwMapType.BLUE_HOME,
            WvwMapType.GREEN_HOME,
            WvwMapType.RED_HOME,
            WvwMapType.EDGE_OF_THE_MISTS,
            WvwMapType.UNKNOWN,
            WvwMapType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final WvwMapType expResult = expResults[index];
                    final WvwMapType result = EnumValueFactory.INSTANCE.mapEnumValue(WvwMapType.class, value);
                    assertEquals(expResult, result);
                });
    }

}
