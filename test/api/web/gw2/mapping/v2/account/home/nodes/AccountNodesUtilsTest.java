/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.home.nodes;

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
public final class AccountNodesUtilsTest {

    public AccountNodesUtilsTest() {
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
    public void testFindAccountNodeType() {
        System.out.println("findAccountNodeType"); // NOI18N.
        final String[] values = {
            "basic_ore_nodes", // NOI18N.
            "basic_lumber_nodes", // NOI18N.
            "basic_harvesting_nodes", // NOI18N.
            "basic_cloth_rack", // NOI18N.
            "basic_leather_rack", // NOI18N.
            "hard_wood_node", // NOI18N.
            "ancient_wood_node", // NOI18N.
            "elder_wood_node", // NOI18N.
            "iron_ore_node", // NOI18N.
            "platinum_ore_node", // NOI18N.
            "mithril_ore_node", // NOI18N.
            "orichalcum_ore_node", // NOI18N.
            "omnomberry_node", // NOI18N.
            "snow_truffle_node", // NOI18N.
            "lotus_node", // NOI18N.
            "orrian_truffle_node", // NOI18N.
            "flaxseed_node", // NOI18N.
            "ghost_pepper_node", // NOI18N.
            "aurilium_node", // NOI18N.
            "enchanted_treasure_chest", // NOI18N.
            "candy_corn_node", // NOI18N.
            "wintersday_tree", // NOI18N.
            "quartz_node", // NOI18N.
            "sprocket_generator", // NOI18N.
            "krait_obelisk", // NOI18N.
            "bandit_chest", // NOI18N.
            "bloodstone_crystals", // NOI18N.
            "king_sized_candy_corn", // NOI18N.
            "airship_cargo", // NOI18N.
            "crystallized_supply_cache", // NOI18N.
            "exalted_chest", // NOI18N.
            "petrified_stump", // NOI18N.
            "winterberry_bush", // NOI18N.
            "jade_fragment", // NOI18N.
            "noxious_pod", // NOI18N.
            null,
            "" // NOI18N.
        };
        final AccountNodeType[] expResults = {
            AccountNodeType.BASIC_ORE_NODES,
            AccountNodeType.BASIC_LUMBER_NODES,
            AccountNodeType.BASIC_HARVESTING_NODES,
            AccountNodeType.BASIC_CLOTH_RACK,
            AccountNodeType.BASIC_LEATHER_RACK,
            AccountNodeType.HARD_WOOD_NODE,
            AccountNodeType.ANCIENT_WOOD_NODE,
            AccountNodeType.ELDER_WOOD_NODE,
            AccountNodeType.IRON_ORE_NODE,
            AccountNodeType.PLATINUM_ORE_NODE,
            AccountNodeType.MITHRIL_ORE_NODE,
            AccountNodeType.ORICHALCUM_ORE_NODE,
            AccountNodeType.OMNOMBERRY_NODE,
            AccountNodeType.SNOW_TRUFFLE_NODE,
            AccountNodeType.LOTUS_NODE,
            AccountNodeType.ORRIAN_TRUFFLE_NODE,
            AccountNodeType.FLAXSEED_NODE,
            AccountNodeType.GHOST_PEPPER_NODE,
            AccountNodeType.AURILIUM_NODE,
            AccountNodeType.ENCHANTED_TREASURE_CHEST,
            AccountNodeType.CANDY_CORN_NODE,
            AccountNodeType.WINTERSDAY_TREE,
            AccountNodeType.QUARTZ_NODE,
            AccountNodeType.SPROKET_GENERATOR,
            AccountNodeType.KRAIT_OBELISK,
            AccountNodeType.BANDIT_CHEST,
            AccountNodeType.BLOODSTONE_KRYSTAL,
            AccountNodeType.KING_SIZED_CANDY_CORN,
            AccountNodeType.AIRSHIP_CARGO,
            AccountNodeType.CRYSTALLIZED_SUPPLY_CACHE,
            AccountNodeType.EXALTED_CHEST,
            AccountNodeType.PETRIFIED_STUMP,
            AccountNodeType.WINTERBERRY_BUSH,
            AccountNodeType.JADE_FRAGMENT,
            AccountNodeType.NOXIOUS_POD,
            AccountNodeType.UNKNOWN,
            AccountNodeType.UNKNOWN,};
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AccountNodeType expResult = expResults[index];
                    final AccountNodeType result = EnumValueFactory.INSTANCE.mapEnumValue(AccountNodeType.class, value);
                    assertEquals(expResult, result);
                });

    }
}
