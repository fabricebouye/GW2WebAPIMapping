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
public final class AccountCatsUtilsTest {

    public AccountCatsUtilsTest() {
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
    public void testFindAccountHomeCatHint() {
        System.out.println("findAccountHomeCatHint"); // NOI18N.
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
        final AccountCatHint[] expResults = {
            AccountCatHint.CHICKEN,
            AccountCatHint.GRILLED_CHICKEN,
            AccountCatHint.SPICY_FLANK,
            AccountCatHint.SPICIER_FLANK,
            AccountCatHint.FIRE_FLANK,
            AccountCatHint.PRICKLEY_PEAR_SORBET,
            AccountCatHint.GINGER_LIME_ICECREAM,
            AccountCatHint.SAFFRON_MANGO_ICECREAM,
            AccountCatHint.PEACH_RASPBERRY_ICECREAM,
            AccountCatHint.CHICKEN_DAY,
            AccountCatHint.CHIKEN_NIGHT,
            AccountCatHint.WARRIOR,
            AccountCatHint.MESMER,
            AccountCatHint.RANGER,
            AccountCatHint.GUARDIAN,
            AccountCatHint.ELEMENTALIST,
            AccountCatHint.ENGINEER,
            AccountCatHint.REVENANT,
            AccountCatHint.THIEF,
            AccountCatHint.NECROMANCER,
            AccountCatHint.LAVA_SKRITT,
            AccountCatHint.GHOST_PEPPERS,
            AccountCatHint.HALLOWEEN,
            AccountCatHint.SNOW_LEPOARD,
            AccountCatHint.FROZEN_POULTRY_LEEK,
            AccountCatHint.ICE_POULTRY_WINTER_VEG,
            AccountCatHint.FREEZER_POULTRY_LEMONGRASS,
            AccountCatHint.COLD_SAFFRON_POULTRY,
            AccountCatHint.CAUDECUS,
            AccountCatHint.BUNDLE,
            AccountCatHint.GHOST,
            AccountCatHint.SAB,
            AccountCatHint.UNKNOWN,
            AccountCatHint.UNKNOWN,};
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AccountCatHint expResult = expResults[index];
                    final AccountCatHint result = EnumValueFactory.INSTANCE.mapEnumValue(AccountCatHint.class, value);
                    assertEquals(expResult, result);
                });

    }
}
