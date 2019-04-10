/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mounts.skins;

import api.web.gw2.mapping.core.EnumValueFactory;
import org.junit.*;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit test.
 *
 * @author Fabrice Bouyé
 */
public class MountsSkinsUtilsTest {
    public MountsSkinsUtilsTest() {
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
     * Test of {@code MountDyeSlotMaterial}.
     */
    @Test
    public void testFindMountDyeSlotMaterial() {
        System.out.println("findMountDyeSlotMaterial");
        final String[] values = {
                "cloth", // NOI18N.
                "fur", // NOI18N.
                "leather", // NOI18N.
                "metal", // NOI18N.
                null,
                "" // NOI18N.
        };
        final MountDyeSlotMaterial[] expResults = {
                MountDyeSlotMaterial.CLOTH,
                MountDyeSlotMaterial.FUR,
                MountDyeSlotMaterial.LEATHER,
                MountDyeSlotMaterial.METAL,
                MountDyeSlotMaterial.UNKNOWN,
                MountDyeSlotMaterial.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MountDyeSlotMaterial expResult = expResults[index];
                    final MountDyeSlotMaterial result = EnumValueFactory.INSTANCE.mapEnumValue(MountDyeSlotMaterial.class, value);
                    assertEquals(expResult, result);
                });
    }
}
