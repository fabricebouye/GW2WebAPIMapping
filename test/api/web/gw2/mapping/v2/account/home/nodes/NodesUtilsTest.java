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
public final class NodesUtilsTest {

    public NodesUtilsTest() {
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
    public void testFindNodeType() {
        System.out.println("findNodeType"); // NOI18N.
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
        final NodeType[] expResults = {
            NodeType.BASIC_ORE_NODES,
            NodeType.BASIC_LUMBER_NODES,
            NodeType.BASIC_HARVESTING_NODES,
            NodeType.BASIC_CLOTH_RACK,
            NodeType.BASIC_LEATHER_RACK,
            NodeType.HARD_WOOD_NODE,
            NodeType.ANCIENT_WOOD_NODE,
            NodeType.ELDER_WOOD_NODE,
            NodeType.IRON_ORE_NODE,
            NodeType.PLATINUM_ORE_NODE,
            NodeType.MITHRIL_ORE_NODE,
            NodeType.ORICHALCUM_ORE_NODE,
            NodeType.OMNOMBERRY_NODE,
            NodeType.SNOW_TRUFFLE_NODE,
            NodeType.LOTUS_NODE,
            NodeType.ORRIAN_TRUFFLE_NODE,
            NodeType.FLAXSEED_NODE,
            NodeType.GHOST_PEPPER_NODE,
            NodeType.AURILIUM_NODE,
            NodeType.ENCHANTED_TREASURE_CHEST,
            NodeType.CANDY_CORN_NODE,
            NodeType.WINTERSDAY_TREE,
            NodeType.QUARTZ_NODE,
            NodeType.SPROKET_GENERATOR,
            NodeType.KRAIT_OBELISK,
            NodeType.BANDIT_CHEST,
            NodeType.BLOODSTONE_KRYSTAL,
            NodeType.KING_SIZED_CANDY_CORN,
            NodeType.AIRSHIP_CARGO,
            NodeType.CRYSTALLIZED_SUPPLY_CACHE,
            NodeType.EXALTED_CHEST,
            NodeType.PETRIFIED_STUMP,
            NodeType.WINTERBERRY_BUSH,
            NodeType.JADE_FRAGMENT,
            NodeType.NOXIOUS_POD,
            NodeType.UNKNOWN,
            NodeType.UNKNOWN,};
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final NodeType expResult = expResults[index];
                    final NodeType result = EnumValueFactory.INSTANCE.mapEnumValue(NodeType.class, value);
                    assertEquals(expResult, result);
                });

    }
}
