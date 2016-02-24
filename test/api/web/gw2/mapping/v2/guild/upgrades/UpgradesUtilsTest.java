/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.upgrades;

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
public class UpgradesUtilsTest {

    public UpgradesUtilsTest() {
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
     * Test of UpgradeType.
     */
    @Test
    public void testFindUpgradeType() {
        System.out.println("findUpgradeType");
        final String[] values = {
            "AccumulatingCurrency", // NOI18N.
            "BankBag", // NOI18N.
            "Boost", // NOI18N.
            "Claimable", // NOI18N.
            "Consumable", // NOI18N.
            "Decoration", // NOI18N.
            "Hub", // NOI18N.
            null,
            "" // NOI18N.
        };
        final UpgradeType[] expResults = {
            UpgradeType.ACCUMULATING_CURRENCY,
            UpgradeType.BANK_BAG,
            UpgradeType.BOOST,
            UpgradeType.CLAIMABLE,
            UpgradeType.CONSUMABLE,
            UpgradeType.DECORATION,
            UpgradeType.HUB,
            UpgradeType.UNKNOWN,
            UpgradeType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final UpgradeType expResult = expResults[index];
                    final UpgradeType result = EnumValueFactory.INSTANCE.mapEnumValue(UpgradeType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of UpgradeCostType.
     */
    @Test
    public void testFindUpgradeCostType() {
        System.out.println("findUpgradeCostType");
        final String[] values = {
            "Collectible", // NOI18N.
            "Currency", // NOI18N.
            "Item", // NOI18N.
            null,
            "" // NOI18N.
        };
        final UpgradeCostType[] expResults = {
            UpgradeCostType.COLLECTIBLE,
            UpgradeCostType.CURRENCY,
            UpgradeCostType.ITEM,
            UpgradeCostType.UNKNOWN,
            UpgradeCostType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final UpgradeCostType expResult = expResults[index];
                    final UpgradeCostType result = EnumValueFactory.INSTANCE.mapEnumValue(UpgradeCostType.class, value);
                    assertEquals(expResult, result);
                });
    }
}
