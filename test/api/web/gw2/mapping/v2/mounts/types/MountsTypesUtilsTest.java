/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mounts.types;

import api.web.gw2.mapping.core.EnumValueFactory;
import org.junit.*;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit test.
 *
 * @author Fabrice Bouyé
 */
public class MountsTypesUtilsTest {
    public MountsTypesUtilsTest() {
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
     * Test of {@code MounType}.
     */
    @Test
    public void testFindMountType() {
        System.out.println("findMountType");
        final String[] values = {
                "griffon", // NOI18N.
                "jackal", // NOI18N.
                "raptor", // NOI18N.
                "roller_beetle", // NOI18N.
                "skimmer", // NOI18N.
                "skyscale", // NOI18N.
                "springer", // NOI18N.
                "warclaw", // NOI18N.
                null,
                "" // NOI18N.
        };
        final MountType[] expResults = {
                MountType.GRIFFON,
                MountType.JACKAL,
                MountType.RAPTOR,
                MountType.ROLLER_BEETLE,
                MountType.SKIMMER,
                MountType.SKYSCALE,
                MountType.SPRINGER,
                MountType.WARCLAW,
                MountType.UNKNOWN,
                MountType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MountType expResult = expResults[index];
                    final MountType result = EnumValueFactory.INSTANCE.mapEnumValue(MountType.class, value);
                    assertEquals(expResult, result);
                });
    }
}
