/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.luck;

import api.web.gw2.mapping.core.EnumValueFactory;
import org.junit.*;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit test.
 *
 * @author Fabrice Bouyé
 */
public class LuckTest {
    public LuckTest() {
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
     * Test of {@code DailyCrafting}.
     */
    @Test
    public void testFindLuckId() {
        System.out.println("findSkinFlag");
        final String[] values = {
                "luck", // NOI18N.
                null,
                "" // NOI18N.
        };
        final LuckId[] expResults = {
                LuckId.LUCK,
                LuckId.UNKNOWN,
                LuckId.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final LuckId expResult = expResults[index];
                    final LuckId result = EnumValueFactory.INSTANCE.mapEnumValue(LuckId.class, value);
                    assertEquals(expResult, result);
                });
    }
}
