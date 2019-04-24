/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw;

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
public class WvwUtilsTest {

    public WvwUtilsTest() {
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
