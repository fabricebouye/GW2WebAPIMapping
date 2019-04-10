/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
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
public class GuildUpgradesUtilsTest {

    public GuildUpgradesUtilsTest() {
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
     * Test of GuildUpgradeType.
     */
    @Test
    public void testFindGuildUpgradeType() {
        System.out.println("findGuildUpgradeType");
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
        final GuildUpgradeType[] expResults = {
            GuildUpgradeType.ACCUMULATING_CURRENCY,
            GuildUpgradeType.BANK_BAG,
            GuildUpgradeType.BOOST,
            GuildUpgradeType.CLAIMABLE,
            GuildUpgradeType.CONSUMABLE,
            GuildUpgradeType.DECORATION,
            GuildUpgradeType.HUB,
            GuildUpgradeType.UNKNOWN,
            GuildUpgradeType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildUpgradeType expResult = expResults[index];
                    final GuildUpgradeType result = EnumValueFactory.INSTANCE.mapEnumValue(GuildUpgradeType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of GuildUpgradeCostType.
     */
    @Test
    public void testFindGuildUpgradeCostType() {
        System.out.println("findGuildUpgradeCostType");
        final String[] values = {
            "Collectible", // NOI18N.
            "Currency", // NOI18N.
            "Item", // NOI18N.
            null,
            "" // NOI18N.
        };
        final GuildUpgradeCostType[] expResults = {
            GuildUpgradeCostType.COLLECTIBLE,
            GuildUpgradeCostType.CURRENCY,
            GuildUpgradeCostType.ITEM,
            GuildUpgradeCostType.UNKNOWN,
            GuildUpgradeCostType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final GuildUpgradeCostType expResult = expResults[index];
                    final GuildUpgradeCostType result = EnumValueFactory.INSTANCE.mapEnumValue(GuildUpgradeCostType.class, value);
                    assertEquals(expResult, result);
                });
    }
}
