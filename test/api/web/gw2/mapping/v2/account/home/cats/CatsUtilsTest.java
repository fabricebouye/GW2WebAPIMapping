/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.home.cats;

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
public final class CatsUtilsTest {

    public CatsUtilsTest() {
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
     * Test of AccountAccessType.
     */
    @Test
    public void testFindCatHint() {
        System.out.println("findCatHint"); // NOI18N.
        final String[] values = {
            "chicken", // NOI18N.
            "grilled_chicken", // NOI18N.
            "spicy_flank", // NOI18N.
            "spicier_flank", // NOI18N.
            "fire_flank", // NOI18N.
            "prickley_pear_sorbet", // NOI18N.
            "ginger_lime_icecream", // NOI18N.
            "saffron_mango_icecream", // NOI18N.
            "peach_raspberry_icecream", // NOI18N.
            "chicken_day", // NOI18N.
            "chicken_night", // NOI18N.
            "warrior", // NOI18N.
            "mesmer", // NOI18N.
            "ranger", // NOI18N.
            "guardian", // NOI18N.
            "elementalist", // NOI18N.
            "engineer", // NOI18N.
            "revenant", // NOI18N.
            "thief", // NOI18N.
            "necromancer", // NOI18N.
            "lava_skritt", // NOI18N.
            "ghost_peppers", // NOI18N.
            "halloween", // NOI18N.
            "snow_leopard", // NOI18N.
            "frozen (poultry leek)", // NOI18N.
            "ice (poultry winter veg)", // NOI18N.
            "freezer (poultry lemongrass)", // NOI18N.
            "cold (saffron poultry)", // NOI18N.
            "cadeucus", // NOI18N.
            "bundle", // NOI18N.
            "ghost", // NOI18N.
            "sab", // NOI18N.
            null,
            "" // NOI18N.
        };
        final CatHint[] expResults = {
            CatHint.CHICKEN,
            CatHint.GRILLED_CHICKEN,
            CatHint.SPICY_FLANK,
            CatHint.SPICIER_FLANK,
            CatHint.FIRE_FLANK,
            CatHint.PRICKLEY_PEAR_SORBET,
            CatHint.GINGER_LIME_ICECREAM,
            CatHint.SAFFRON_MANGO_ICECREAM,
            CatHint.PEACH_RASPBERRY_ICECREAM,
            CatHint.CHICKEN_DAY,
            CatHint.CHIKEN_NIGHT,
            CatHint.WARRIOR,
            CatHint.MESMER,
            CatHint.RANGER,
            CatHint.GUARDIAN,
            CatHint.ELEMENTALIST,
            CatHint.ENGINEER,
            CatHint.REVENANT,
            CatHint.THIEF,
            CatHint.NECROMANCER,
            CatHint.LAVA_SKRITT,
            CatHint.GHOST_PEPPERS,
            CatHint.HALLOWEEN,
            CatHint.SNOW_LEPOARD,
            CatHint.FROZEN_POULTRY_LEEK,
            CatHint.ICE_POULTRY_WINTER_VEG,
            CatHint.FREEZER_POULTRY_LEMONGRASS,
            CatHint.COLD_SAFFRON_POULTRY,
            CatHint.CAUDECUS,
            CatHint.BUNDLE,
            CatHint.GHOST,
            CatHint.SAB,
            CatHint.UNKNOWN,
            CatHint.UNKNOWN,};
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final CatHint expResult = expResults[index];
                    final CatHint result = EnumValueFactory.INSTANCE.mapEnumValue(CatHint.class, value);
                    assertEquals(expResult, result);
                });

    }
}
