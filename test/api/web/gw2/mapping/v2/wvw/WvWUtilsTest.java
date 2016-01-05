/* 
 * Copyright (C) 2015 Fabrice Bouyé
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
public class WvWUtilsTest {

    public WvWUtilsTest() {
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
    public void testFindMapType() {
        System.out.println("findMapType");
        final String[] values = {
            "Center", // NOI18N.
            "BlueHome", // NOI18N.
            "GreenHome", // NOI18N.
            "RedHome", // NOI18N.
            "EdgeOfTheMists", // NOI18N.
            null,
            "" // NOI18N.
        };
        final MapType[] expResults = {
            MapType.CENTER,
            MapType.BLUE_HOME,
            MapType.GREEN_HOME,
            MapType.RED_HOME,
            MapType.EDGE_OF_THE_MISTS,
            MapType.UNKNOWN,
            MapType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MapType expResult = expResults[index];
                    final MapType result = EnumValueFactory.INSTANCE.mapEnumValue(MapType.class, value);
                    assertEquals(expResult, result);
                });
    }

}
