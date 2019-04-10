/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mapchests;

import api.web.gw2.mapping.core.EnumValueFactory;
import org.junit.*;
import java.util.stream.IntStream;
import static org.junit.Assert.assertEquals;

/**
 * Unit test.
 *
 * @author Fabrice Bouyé
 */
public class MapChestsUtilsTest {
    public MapChestsUtilsTest() {
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
     * Test of {@code MapChest}.
     */
    @Test
    public void testFindMapChest() {
        System.out.println("testFindMapChest");
        final String[] values = {
                "auric_basin_heros_choice_chest", // NOI18N.
                "dragons_stand_heros_choice_chest", // NOI18N.
                "tangled_depths_heros_choice_chest", // NOI18N.
                "verdant_brink_heros_choice_chest", // NOI18N.
                null,
                "" // NOI18N.
        };
        final MapChest[] expResults = {
                MapChest.AURIC_BASIN_HEROS_CHOICE_CHEST,
                MapChest.DRAGON_STAND_HEROS_CHOICE_CHEST,
                MapChest.TANGLED_DEPTHS_HEROS_CHOICE_CHEST,
                MapChest.VERDANT_BRINK_HEROS_CHOICE_CHEST,
                MapChest.UNKNOWN,
                MapChest.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MapChest expResult = expResults[index];
                    final MapChest result = EnumValueFactory.INSTANCE.mapEnumValue(MapChest.class, value);
                    assertEquals(expResult, result);
                });
    }
}
