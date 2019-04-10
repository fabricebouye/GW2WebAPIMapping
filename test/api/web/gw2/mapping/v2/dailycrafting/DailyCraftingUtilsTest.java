/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.dailycrafting;

import api.web.gw2.mapping.core.EnumValueFactory;
import org.junit.*;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit test.
 *
 * @author Fabrice Bouyé
 */
public class DailyCraftingUtilsTest {
    public DailyCraftingUtilsTest() {
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
    public void testFindDailyCrafting() {
        System.out.println("findSkinFlag");
        final String[] values = {
                "charged_quartz_crystal", // NOI18N.
                "glob_of_elder_spirit_residue", // NOI18N.
                "lump_of_mithrilium", // NOI18N.
                "spool_of_silk_weaving_thread", // NOI18N.
                "spool_of_thick_elonian_cord", // NOI18N.
                null,
                "" // NOI18N.
        };
        final DailyCrafting[] expResults = {
                DailyCrafting.CHARGED_QUARTZ_CRYSTAL,
                DailyCrafting.GLOB_OF_ELDER_SPIRIT_RESIDUE,
                DailyCrafting.LUMP_OF_MITHRILIIUM,
                DailyCrafting.SPOOL_OF_SILK_WEAWING_THREAD,
                DailyCrafting.SPOOL_OF_THICK_ELONIAN_CORD,
                DailyCrafting.UNKNOWN,
                DailyCrafting.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final DailyCrafting expResult = expResults[index];
                    final DailyCrafting result = EnumValueFactory.INSTANCE.mapEnumValue(DailyCrafting.class, value);
                    assertEquals(expResult, result);
                });
    }
}
